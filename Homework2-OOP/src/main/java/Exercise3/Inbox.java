package Exercise3;

import java.util.ArrayList;

public class Inbox {

    ArrayList<Mail> inbox;

    public Inbox() {
        this.inbox = new ArrayList<>();
    }

    public void add(Mail mail) {
        this.inbox.add(mail);
    }


    public void printAllMailHeader() {
        for(Mail mail : this.inbox) {
            System.out.println(mail.printMailWithoutMessage());
        }
    }

    public void open(int index) {
        int size = inbox.size() - 1;
        if (index >= inbox.size() - 1) {
            System.out.println("Der angegebene Index ist größer als die Mails in der Inbox. Bitte wähle einen Index zwischen 0 und " + size + " .");
            return;
        }
        System.out.println(inbox.get(index).returnMailAsString());
    }

    public int countUnread() {
        int unread = inbox.size();
        for(Mail mail : inbox) {
            if (mail.isRead())
                unread--;
        }
        return unread;
    }

}
