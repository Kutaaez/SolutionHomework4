package chat;

public class ChatServiceAdapter implements ChatService {
    //calling old message format
    private LegacyChatService legacyChat;

    public ChatServiceAdapter(LegacyChatService legacyChat) {
        this.legacyChat = legacyChat;
    }

    //use old format message in new interface for sending in new format,
    // and ensures compatibility without modifying the old code
    @Override
    public void sendMessage(String message) {
        legacyChat.sendLegacyMessage(message);
    }
}
