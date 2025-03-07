#  HomeWork 4. 
**Singleton and Adapter patterns.** 

**Part 1: Global Configuration Manager (Singleton Pattern)**
## GOALS:

### Implement a configuration manager that ensures that only one instance of it exists in an application.
- Create a **centralized configuration manager** that stores key-value pairs.  
- Ensure **only one instance** is created using **lazy initialization**.  
- Provide methods to **retrieve configuration values** and **display all settings**.
### Data structure:
```plaintext
 config/
         ├── ConfigurationManager.java
                 - Implements the **Singleton pattern** with lazy initialization.  
                 - Provides:
                          * `getConfig(String key)`: Retrieves a value by key.  
                          * `printAllConfigs()`: Displays all settings.  
         ├── ConfigManagerDemo.java
                - Demonstrates **singleton behavior** by accessing the same instance multiple times.  
                - Retrieves and prints configurations.
```
```plaintext
###        Notes:
        - Uses lazy initialization to create the instance only when needed.
        - Ensures a single global access point to configuration settings.
        - Follows SOLID principles for maintainability.
```
