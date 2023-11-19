package git.hashibutogarasu.minecraftwiki.core.json;

public class API {
    public boolean batchcomplete;
    public Warnings warnings;
    public Query query;

    public API(boolean batchcomplete, Warnings warnings, Query query) {
        this.batchcomplete = batchcomplete;
        this.warnings = warnings;
        this.query = query;
    }
}
