package git.hashibutogarasu.minecraftwiki.core.util;

import org.json.JSONObject;

import java.util.*;

public class Utils {
    public static List<Map<String, String>> IteratorToMapList(JSONObject jsonObject) {
        List<Map<String, String>> list = new ArrayList<>();
        for (Iterator<String> it = jsonObject.keys(); it.hasNext(); ) {
            var key = it.next();
            Map<String, String> map = new HashMap<>();
            map.put(key, jsonObject.get(key).toString());
            list.add(map);
        }

        return list;
    }
}
