package config;

public class ConfigManagerDemo {
    //testing  config manager.
    public static void main(String[] args) {
        //creating one singltone class
        ConfigurationManager config = ConfigurationManager.getInstance();
        System.out.println(config.getConfig("maxPlayers"));
        config.printAllConfigs();
    }
}
