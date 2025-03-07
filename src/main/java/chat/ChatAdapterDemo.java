package chat;

public class ChatAdapterDemo {
    //testing chat adapter demo
    public static void main(String[] args) {
        LegacyChatService legacyChat = new LegacyChatService();
        ChatService chatService = new ChatServiceAdapter(legacyChat);

        chatService.sendMessage("Hello world!");
    }
}
