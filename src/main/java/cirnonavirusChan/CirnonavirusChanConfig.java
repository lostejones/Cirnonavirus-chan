package cirnonavirusChan;

import java.util.Properties;

public class CirnonavirusChanConfig {
    private final long channelId;
    private final String discordToken;

    public CirnonavirusChanConfig(Properties prop) {
        this.channelId = Long.parseLong(prop.getProperty("channelId"));
        this.discordToken = prop.getProperty("discordToken");
    }

    public long getChannelId() {
        return channelId;
    }

    public String getDiscordToken() {
        return discordToken;
    }
}
