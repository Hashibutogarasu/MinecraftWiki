import git.hashibutogarasu.minecraftwiki.core.MinecraftWiki;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LibraryTest {
    public static Logger logger = LoggerFactory.getLogger("MinecraftWiki");

    public static void main(String[] args){
        try {
            MinecraftWiki minecraftWiki = MinecraftWiki.get("Village");
            logger.info(String.valueOf(minecraftWiki.data.batchcomplete));
        } catch (IOException ignored) {

        }
    }
}
