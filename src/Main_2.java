interface MessageSender {
    void sendMessage(String message);
}


class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}


class SmsSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}


class NotificationServices {
    private final MessageSender messageSender;


    public NotificationServices(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendNotification(String message) {
        messageSender.sendMessage(message);
    }
}


public class Main_2 {
    public static void main(String[] args) {
        NotificationServices emailNotification = new NotificationServices(new EmailSender());
        emailNotification.sendNotification("This is an email notification!");

        NotificationServices smsNotification = new NotificationServices(new SmsSender());
        smsNotification.sendNotification("This is an SMS notification!");
    }
}
