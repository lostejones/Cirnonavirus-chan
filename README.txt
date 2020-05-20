Cirnonavirus-chan is a Java Discord bot written using the Javacord library and intended to be hosted on Heroku.

If you wish to test out the code, you should first make your own Discord bot. This can be done at https://discord.com/developers/. You should make your own application there, and then give it an account using the provided button. The code has a comment where your bot's token should go. The code also has places where you are required to insert your own channel and emoji IDs; these are commented.

If adding your own images as reactions to /images, bear in mind Discord image embeds will appear with a maximum 400x300 resolution and you should resize your images accordingly. Animated GIFs should be optimized to reduce filesize so that the bot can upload them quickly.

If you wish to host your own copy on Heroku, you will have to build a usable .jar file. This should be accomplished with Gradle (https://gradle.org/) with the ShadowJar plugin (included). With Gradle installed, in the main cirnonavirusChan-public folder, run the following line in your bash terminal of choice.

./gradlew clean build

If hosting on Heroku, you should then update PROCFILE with the location of your new .jar file.

This software is licensed to you under the GPLv3 copyleft free software license.