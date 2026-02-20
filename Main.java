import gg.acai.chatgpt.ChatGPT;
import gg.acai.chatgpt.Conversation;

public class Main {
    public static void main(String[] args) {
        // Read credentials from environment variables (never hardcode secrets)
        String sessionToken = System.getenv("CHATGPT_SESSION_TOKEN");
        String cfClearance = System.getenv("CHATGPT_CF_CLEARANCE");
        String userAgent = System.getenv("CHATGPT_USER_AGENT");

        if (sessionToken == null || sessionToken.isEmpty()) {
            System.err.println("Error: CHATGPT_SESSION_TOKEN environment variable is not set.");
            System.err.println("Set it with: export CHATGPT_SESSION_TOKEN=\"your-session-token\"");
            System.exit(1);
        }
        if (cfClearance == null || cfClearance.isEmpty()) {
            System.err.println("Error: CHATGPT_CF_CLEARANCE environment variable is not set.");
            System.err.println("Set it with: export CHATGPT_CF_CLEARANCE=\"your-cf-clearance\"");
            System.exit(1);
        }
        if (userAgent == null || userAgent.isEmpty()) {
            userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 "
                + "(KHTML, like Gecko) Chrome/115.0.0.0 Safari/537.36";
        }

        ChatGPT chatGpt = ChatGPT.newBuilder()
            .sessionToken(sessionToken)       // get from browser cookies
            .cfClearance(cfClearance)          // get from browser cookies
            .userAgent(userAgent)              // google 'what is my user agent'
            .build();

        Conversation conversation = chatGpt.createConversation();
        conversation.sendMessageAsync("Hello!")
            .whenComplete((response) -> {
                System.out.println("Response: " + response.getMessage());
            });
    }
}
