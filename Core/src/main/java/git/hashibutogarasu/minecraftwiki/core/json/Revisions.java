package git.hashibutogarasu.minecraftwiki.core.json;

public class Revisions {
    public int revid;
    public int parentid;
    public boolean minor;
    public String user;
    public String timestamp;
    public String comment;

    public Revisions(int revid, int parentid, boolean minor, String user, String timestamp, String comment) {
        this.revid = revid;
        this.parentid = parentid;
        this.minor = minor;
        this.user = user;
        this.timestamp = timestamp;
        this.comment = comment;
    }
}
