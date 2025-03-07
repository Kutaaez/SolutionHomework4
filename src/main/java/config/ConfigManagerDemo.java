package config;

public class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance();
        System.out.println(config.getConfig("maxPlayers"));
        config.printAllConfigs();
    }
}
