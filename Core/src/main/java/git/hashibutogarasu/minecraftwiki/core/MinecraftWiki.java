package git.hashibutogarasu.minecraftwiki.core;

import com.google.gson.Gson;
import git.hashibutogarasu.minecraftwiki.core.json.API;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class MinecraftWiki {
    public API data;
    public List<String> lines;

    public MinecraftWiki(API data, List<String> lines) {
        this.lines = lines;
        this.data = data;
    }

    public MinecraftWiki() {
    }

    public static MinecraftWiki get(String query) throws IOException {
        String encoded = URLEncoder.encode(query, StandardCharsets.UTF_8);
        URL url = new URL("https://minecraft.wiki/api.php?action=query&format=json&prop=info|extracts|revisions|info&formatversion=2&titles=" + encoded);
        URLConnection connection = url.openConnection();

        API data = null;
        List<String> lines = new ArrayList<>();

        try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String line;
            while ((line = in.readLine()) != null) {
                Gson gson = new Gson();
                data = gson.fromJson(line, API.class);

                data.query.pages.forEach(pageData -> {
                    Element body = Jsoup.parse(pageData.extract).body();

                    body.forEach(element -> {
                        if (!element.text().equals("")) {
                            lines.add(element.text());
                        }
                    });
                });
            }
        }

        return new MinecraftWiki(data, lines);
    }
}
