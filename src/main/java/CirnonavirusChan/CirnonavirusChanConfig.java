package CirnonavirusChan;

import java.util.Properties;

public class CirnonavirusChanConfig {
    private final long loadChannelId;
    private final long helloChannelId;
    private final long goodbyeChannelId;
    private final String discordToken;

    public CirnonavirusChanConfig(Properties prop) {
        this.loadChannelId = Long.parseLong(prop.getProperty("loadChannelId"));
        this.helloChannelId = Long.parseLong(prop.getProperty("helloChannelId"));
        this.goodbyeChannelId = Long.parseLong(prop.getProperty("goodbyeChannelId"));
        this.discordToken = prop.getProperty("discordToken");
    }

    public long getLoadChannelId() {
        return loadChannelId;
    }
    
    public long getHelloChannelId() {
        return helloChannelId;
    }
    
    public long getGoodbyeChannelId() {
        return goodbyeChannelId;
    }

    public String getDiscordToken() {
        return discordToken;
    }
}
