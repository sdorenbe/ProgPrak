package Exercise3;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mail {

    private String sender;
    private String subject;
    private String message;
    private LocalDate dateTime;
    private boolean read;

    public Mail(String sender, String subject, String message) {
        this.sender = sender;
        this.subject = subject;
        this.message = message;
        this.dateTime = dateTime.now();
        this.read = false;
    }

    public void markAsRead() {
        this.read = true;
    }

    public void printMail() {
        System.out.println(subject + " from " +  sender + " on "  + dateTime + ": " + message);
    }

    public String returnMailAsString() {
        return (subject + " from " +  sender + " on "  + dateTime + ": " + message);
    }

    //Für Aufruf in Inbox Klasse wird hier ein String returnt
    public String printMailWithoutMessage() {
        return (subject + " from " +  sender + " on "  + dateTime);
    }

    public boolean isRead() {
        return read;
    }
}
