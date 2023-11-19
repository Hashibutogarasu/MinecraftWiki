package git.hashibutogarasu.minecraftwiki.core.json;

import java.util.List;
import java.util.Map;

public class Query {
    public List<Map<String, String>> normalized;
    public List<PageData> pages;

    public Query(List<Map<String, String>> normalized, List<PageData> pages) {
        this.normalized = normalized;
        this.pages = pages;
    }
}
