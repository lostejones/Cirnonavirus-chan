package CirnonavirusChan;

import cirnonavirusChan.CirnonavirusChanConfig;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.channel.TextChannel;
import org.javacord.api.entity.message.MessageBuilder;
import org.javacord.api.entity.message.MessageDecoration;

import java.io.*;
import java.util.Properties;

public class CirnonavirusChan {
    private static final String CIRNONAVIRUS_PROPERTIES_FILE_PATH = "./src/main/resources/cirnonavirus.properties";

        public static void main(String[] args) {
            CirnonavirusChanConfig cirnonavirusChanConfig;
            try (Reader read = new FileReader(CIRNONAVIRUS_PROPERTIES_FILE_PATH)) {
                Properties prop = new Properties();
                prop.load(read);
                cirnonavirusChanConfig = new CirnonavirusChanConfig(prop);
            } catch (IOException e) {
                System.out.println("Unable to initialize Cirnonavirus-Chan. Check properties file at " + CIRNONAVIRUS_PROPERTIES_FILE_PATH);
                e.printStackTrace();
                System.exit(1);
                return;
            }

            DiscordApi api = new DiscordApiBuilder().setToken(cirnonavirusChanConfig.getDiscordToken()).login().join();

            //Boot up message, replace 'id' with the channel ID you want the message to be sent to. Replace :baka: emoji with your own. You can get an emoji's ID by typing \:emoji:
            api.getChannelById(cirnonavirusChanConfig.getLoadChannelId()).ifPresent(channel -> {
                new MessageBuilder()
                        .append("Cirnonavirus-chan has started in version 9.0.2!", MessageDecoration.BOLD)
                        .append("\n\n")
                        .append("Update notes:", MessageDecoration.BOLD)
                        .append("\n")
                        .append("• Added additional reactions")
                        .append("\n")
                        .append("• Version number is now 9")
                        .append("\n\n")
                        .append("<:baka:609202434660761601>")
                        .send((TextChannel) channel);
            });

            //Creates a listener for the various reaction images and help message
            api.addMessageCreateListener(event -> {

                //poke reaction

                if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().equals("/poke")) {
                    event.getChannel().sendMessage(new File("./images/poke.gif"));
                }

                //dance reaction

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().equals("/dance")) {
                    event.getChannel().sendMessage(new File("./images/lizard.gif"));
                }

                //clean reaction

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().equals("/clean")) {
                    event.getChannel().sendMessage(new File("./images/clean.gif"));
                }

                //succ reaction

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().equals("/succ")) {
                    event.getChannel().sendMessage(new File("./images/succ.gif"));
                }

                //tejones reaction

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().equals("/tejones")) {
                    event.getChannel().sendMessage(new File("./images/tejones.gif"));
                }

                //moth reaction

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().equals("/moth")) {
                    event.getChannel().sendMessage(new File("./images/moth.png"));
                }

                //cheers reaction

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().equals("/cheers")) {
                    event.getChannel().sendMessage(new File("./images/cheers.png"));
                }

                //gitgud reaction

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().equals("/gitgud")) {
                    event.getChannel().sendMessage(new File("./images/gitgud.png"));
                }

                //normie reaction

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().equals("/normie")) {
                    event.getChannel().sendMessage(new File("./images/normie.png"));
                }

                //capitalism reaction

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().equals("/capitalism")) {
                    event.getChannel().sendMessage(new File("./images/capitalism.png"));
                }

                //bounce reaction

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().equals("/bounce")) {
                    event.getChannel().sendMessage(new File("./images/bounce.gif"));
                }

                //cool reaction

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().equals("/cool")) {
                    event.getChannel().sendMessage(new File("./images/cool.gif"));
                }

                //ping reaction

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().equals("/ping")) {
                    event.getChannel().sendMessage(new File("./images/ping.jpg"));
                }

                //trans rights reaction

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().equals("/transrights")) {
                    event.getChannel().sendMessage(new File("./images/transrights.png"));
                }

                //Help message. Also note there are custom emojis that you should replace.

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().equals("/help")) {
                    new MessageBuilder()
                            .append("Cirnonavirus-chan Function List", MessageDecoration.BOLD, MessageDecoration.UNDERLINE)
                            .append("\n\n")
                            .append("Autoresponds!", MessageDecoration.BOLD)
                            .append("\n\n")
                            .append("• Welcomes newcomers and sacrifices normies to los tejones\n")
                            .append("• Responds to 'baka' in both romanji and hiragana\n")
                            .append("• Reminds horny people or bakas that she hates them and just wants to read")
                            .append("\n\n")
                            .append("Posts reaction images!", MessageDecoration.BOLD)
                            .append("\n\n")
                            .append("/bounce: Bouncing moth\n")
                            .append("/capitalism: What is to be done? \n")
                            .append("/cheers: 'I'll drink to that bro'\n")
                            .append("/clean: Jesse Wilson cleaning\n")
                            .append("/cool: cool\n")
                            .append("/dance: Dancing gecko\n")
                            .append("/gitgud: Hornet telling you to git gud\n")
                            .append("/moth: moth sees you\n")
                            .append("/normie: Normies don't entry\n")
                            .append("/ping: The weak should fear the strong\n")
                            .append("/poke: Get your brain assaulted by Cirno\n")
                            .append("/succ: Empusa <:succ:510586865057923092>\n")
                            .append("/tejones: Scene from Tejones de Extremadura IV\n")
                            .append("/transrights: We say it")
                            .append("\n\n")
                            .append("<:baka:609202434660761601>")
                            .send((TextChannel) event.getChannel());
                }

                //Scold horny bakas

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().toLowerCase().contains("fap") && event.getMessage().getContent().toLowerCase().contains("baka")) {
                    event.getChannel().sendMessage(new File("./images/hornybakas.png"));
                }

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().toLowerCase().contains("horny") && event.getMessage().getContent().toLowerCase().contains("baka")) {
                    event.getChannel().sendMessage(new File("./images/hornybakas.png"));
                }

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().toLowerCase().contains("horni") && event.getMessage().getContent().toLowerCase().contains("baka")) {
                    event.getChannel().sendMessage(new File("./images/hornybakas.png"));
                }

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().toLowerCase().contains("fap") && event.getMessage().getContent().toLowerCase().contains("ばか")) {
                    event.getChannel().sendMessage(new File("./images/hornybakas.png"));
                }

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().toLowerCase().contains("horny") && event.getMessage().getContent().toLowerCase().contains("ばか")) {
                    event.getChannel().sendMessage(new File("./images/hornybakas.png"));
                }

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().toLowerCase().contains("horni") && event.getMessage().getContent().toLowerCase().contains("ばか")) {
                    event.getChannel().sendMessage(new File("./images/hornybakas.png"));
                }

                //Scold horny people

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().toLowerCase().contains("horni") && !event.getMessage().getContent().toLowerCase().contains("ばか")) {
                    event.getChannel().sendMessage(new File("./images/hornypeople.png"));
                }

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().toLowerCase().contains("horni") && !event.getMessage().getContent().toLowerCase().contains("baka")) {
                    event.getChannel().sendMessage(new File("./images/hornypeople.png"));
                }

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().toLowerCase().contains("horny") && !event.getMessage().getContent().toLowerCase().contains("ばか")) {
                    event.getChannel().sendMessage(new File("./images/hornypeople.png"));
                }

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().toLowerCase().contains("horny") && !event.getMessage().getContent().toLowerCase().contains("baka")) {
                    event.getChannel().sendMessage(new File("./images/hornypeople.png"));
                }

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().toLowerCase().contains("fap") && !event.getMessage().getContent().toLowerCase().contains("ばか")) {
                    event.getChannel().sendMessage(new File("./images/hornypeople.png"));
                }

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().toLowerCase().contains("fap") && !event.getMessage().getContent().toLowerCase().contains("baka")) {
                    event.getChannel().sendMessage(new File("./images/hornypeople.png"));
                }

                //Baka

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().toLowerCase().contains("ばか") && !event.getMessage().getContent().toLowerCase().contains("baka") && !event.getMessage().getContent().toLowerCase().contains("horny") && !event.getMessage().getContent().toLowerCase().contains("horni") && !event.getMessage().getContent().toLowerCase().contains("fap") ) {
                    event.getChannel().sendMessage("ばか");
                }

                else if (event.getMessage().getAuthor().isRegularUser() && event.getMessage().getContent().toLowerCase().contains("baka") && !event.getMessage().getContent().toLowerCase().contains("ばか") && !event.getMessage().getContent().toLowerCase().contains("fap") && !event.getMessage().getContent().toLowerCase().contains("horny") && !event.getMessage().getContent().toLowerCase().contains("horni") ) {
                    event.getChannel().sendMessage("baka");
                }

            });

            //Adds a listener that sends a server join message when someone joins. Replace 'id' with the channel to be used.

            api.addServerMemberJoinListener(event -> {

                String mentionTag;
                mentionTag = event.getUser().getMentionTag();
                api.getChannelById(cirnonavirusChanConfig.getHelloChannelId()).ifPresent(channel -> {
                    new MessageBuilder()
                            .append("Welcome " + mentionTag + "! Enjoy your stay. <:hikkawaka:479146842014089226>")
                            .addAttachment(new File("./images/welcome.mp4"))
                            .send((TextChannel) channel);

                });
            });

            //Adds a listener that sends a server leave message when someone joins. Replace 'id' with the channel to be used.

            api.addServerMemberLeaveListener(event -> {

                String mentionTag;
                mentionTag = event.getUser().getMentionTag();
                api.getChannelById(cirnonavirusChanConfig.getGoodbyeChannelId()).ifPresent(channel -> {
                    new MessageBuilder()
                            .append(mentionTag + " has been sacrificed to los tejones. ¡Olé!")
                            .addAttachment(new File("./images/jesse cleaning.gif"))
                            .send((TextChannel) channel);

                });
            });

            // Print the invite url of the bot in the console
            System.out.println("You can invite the bot by using the following url: " + api.createBotInvite());
        }

}

