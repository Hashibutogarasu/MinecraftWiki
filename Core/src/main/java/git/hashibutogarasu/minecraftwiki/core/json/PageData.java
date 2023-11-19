package git.hashibutogarasu.minecraftwiki.core.json;

import java.util.List;

public class PageData {
    public int pageid;
    public int ns;
    public String title;
    public String contentmodel;
    public String pagelanguage;
    public String pagelanguagehtmlcode;
    public String pagelanguagedir;
    public String touched;
    public int lastrevid;
    public int length;
    public String extract;
    public List<Revisions> revisions;

    public PageData(int pageid, int ns, String title, String contentmodel, String pagelanguage, String pagelanguagehtmlcode, String pagelanguagedir, String touched, int lastrevid, int length, String extract, List<Revisions> revisions) {
        this.pageid = pageid;
        this.ns = ns;
        this.title = title;
        this.contentmodel = contentmodel;
        this.pagelanguage = pagelanguage;
        this.pagelanguagehtmlcode = pagelanguagehtmlcode;
        this.pagelanguagedir = pagelanguagedir;
        this.touched = touched;
        this.lastrevid = lastrevid;
        this.length = length;
        this.extract = extract;
        this.revisions = revisions;
    }
}
