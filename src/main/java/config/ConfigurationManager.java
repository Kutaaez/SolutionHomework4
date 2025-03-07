package config;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Map<String, String> configSettings;

    private ConfigurationManager() {
        configSettings = new HashMap<>();
        loadConfigurations();
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    private void loadConfigurations() {
        configSettings.put("maxPlayers", "100");
        configSettings.put("defaultLanguage", "en");
        configSettings.put("gameDifficulty", "medium");
    }

    public String getConfig(String key) {
        return configSettings.get(key);
    }

    public void printAllConfigs() {
        configSettings.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
