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
Notes:
        - Uses lazy initialization to create the instance only when needed.
        - Ensures a single global access point to configuration settings.
        - Follows SOLID principles for maintainability.
```

## Part 2: Chat Service Adapter (Adapter Pattern)  

### 🎯 GOALS:  
- Integrate a **legacy chat system** with a new application.  
- Use the **Adapter Pattern** to make the legacy chat service compatible with the new interface.  
- Ensure that messages sent via the new interface are correctly translated to the legacy system format.  

### 📂 Data structure:  
```plaintext
 chat/
         ├── LegacyChatService.java
                 - Simulates the old chat system.
                 - Provides:
                          * `sendLegacyMessage(String msg)`: Sends a message using the old format.  
                          
         ├── ChatService.java
                 - Defines the new expected chat interface.
                 - Provides:
                          * `sendMessage(String message)`: Standardized method for sending messages.  
                          
         ├── ChatServiceAdapter.java
                 - Implements **Adapter Pattern**.
                 - Wraps `LegacyChatService` and translates calls to match `ChatService`.  
                          
         ├── ChatAdapterDemo.java
                 - Demonstrates how the adapter makes `LegacyChatService` compatible with `ChatService`.
                 - Sends a message using the new interface and produces expected output.
```
```plaintext
Notes:
        - Ensures compatibility without modifying the legacy chat system.
        - Implements the Adapter Pattern for seamless integration.
        - Follows SOLID principles, improving maintainability.
```

## Summary

This task implemented two structural design patterns:

- **Singleton** – ensures that the configuration manager exists in a single instance, providing a centralized storage of settings.

- **Adapter** – allows integrating the legacy chat system with the new interface, ensuring compatibility without changing the old code.

### Key Takeaways:

- **Singleton** helps manage global state and prevents the creation of redundant object instances.

- **Adapter** allows for binding incompatible interfaces, while maintaining the flexibility and extensibility of the system.

- Both patterns follow the **SOLID** principles, increasing the maintainability and scalability of the code.

As a result, the code became structured, flexible, and ready for real use.
