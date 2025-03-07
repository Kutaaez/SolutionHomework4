# HomeWork 4  
## Singleton and Adapter Patterns  

## Part 1: Global Configuration Manager (Singleton Pattern)  

###  Goals:  
- Implement a **configuration manager** that ensures only **one instance** exists in an application.  
- Create a **centralized configuration manager** that stores key-value pairs.  
- Ensure **lazy initialization** for instance creation.  
- Provide methods to **retrieve configuration values** and **display all settings**.  

###  Project Structure:  
config/ ├── ConfigurationManager.java │ ├── Implements the Singleton pattern with lazy initialization.
│ ├── Provides: │ │ - getConfig(String key): Retrieves a value by key.
│ │ - printAllConfigs(): Displays all settings.
├── ConfigManagerDemo.java │ ├── Demonstrates singleton behavior by accessing the same instance multiple times.
│ ├── Retrieves and prints configurations.

### Notes:
Uses lazy initialization to create the instance only when needed.
Ensures a single global access point to configuration settings.
Follows SOLID principles for maintainability.
