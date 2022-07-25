package D20220724.Interfaces;

public class Telegram implements Messenger {

    public void sendMessage() {
        System.out.println("Sent via Telegram");
    }
    public void getMessage() {
        System.out.println("Got via Telegram");
    }
}
