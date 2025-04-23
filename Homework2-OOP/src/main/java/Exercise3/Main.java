package Exercise3;

public class Main {
    public static void main(String[] args) {

        Mail m1 = new Mail("sender1", "Subject1", "Body1");
        Mail m2 = new Mail("sender2", "Subject2", "Body2");
        Mail m3 = new Mail("sender3", "Subject3", "Body3");
        Mail m4 = new Mail("sender4", "Subject4", "Body4");
        Mail m5 = new Mail("sender5", "Subject5", "Body5");

        Inbox inbox = new Inbox();
        inbox.add(m1); inbox.add(m2); inbox.add(m3); inbox.add(m4); inbox.add(m5);


        m1.printMail();
        m2.isRead();
        inbox.open(5);
        System.out.println(inbox.countUnread());
        m1.markAsRead();
        System.out.println(inbox.countUnread());

    }
}
