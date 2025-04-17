package Exercise3;

import java.time.LocalDate;

public class Mail {

    private String sender;
    private String subject;
    private String message;
    private LocalDate dateTime;
    private boolean read;

    public Mail(String sender, String subject, String message, LocalDate dateTime) {
        this.sender = sender;
        this.subject = subject;
        this.message = message;
        this.dateTime = dateTime;
        this.read = false;
    }

    public void markAsRead() {
        this.read = true;
    }

    public void printMail() {
        System.out.println(subject + " from " +  sender + " on "  + dateTime + ": " + message);
    }

}
