package git.hashibutogarasu.minecraftwiki.client;

import net.fabricmc.api.ClientModInitializer;
import git.hashibutogarasu.minecraftwiki.core.MinecraftWiki;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class MinecraftWikiClientMod implements ClientModInitializer {
    public static Logger logger = LoggerFactory.getLogger("MinecraftWiki");
    @Override
    public void onInitializeClient() {
        try {
            MinecraftWiki minecraftWiki = MinecraftWiki.get("Village");
            logger.info(String.valueOf(minecraftWiki.data.batchcomplete));
        } catch (IOException ignored) {

        }
    }
}
