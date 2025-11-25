import java.util.Scanner;

class YT {
    private String channelName;
    private String Password;
    private int SubscriberCount;
    private int totalgained;
    private int lost;

    public YT(String channelName,String Password) {
        this.channelName = channelName;
        this.Password = Password;
        this.SubscriberCount = 0;
        this.totalgained = 0;
        this.lost = 0;
    }

    public void getName() {
        System.out.println(channelName);
    }

    public void getPassword() {
        System.out.println(Password);
    }

    public void getSubscriberCount(String pin) {
        if (Password.equals(pin)) {
            System.out.println("Subscriber count=" + SubscriberCount);
        } else {
            System.out.println("Wrong pin ! unable to show subscriber count");
        }
    }

    public void addSubscribers(int n) {
        SubscriberCount+=n;
        totalgained+=n;
    }

    public void Unsubscribed(int n) {
        if (SubscriberCount >= n) {
            SubscriberCount -= n;
            lost += n;
        } else {
            System.out.println("Subscriber count is out of range");
        }
    }

    public void showdetails(String pin) {
        if (Password.equals(pin)) {
            System.out.println("\nChannel Name:" + channelName);
            System.out.println("Subscribers gained:"+totalgained);
            System.out.println("Subscribers removed:"+lost);
            System.out.println("Final subscribers:" + SubscriberCount);
        } else {
            System.out.println("Wrong pin ! unable to show details");
        }
    }
}
public class youtube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your channel name:");
        String name = sc.nextLine();

        System.out.print("Enter your password:");
        String pass = sc.nextLine();
        YT y = new YT(name, pass);

        System.out.print("Enter the no. of subscribers who have subscribed: ");
        int gainedSubscribers = sc.nextInt();
        y.addSubscribers(gainedSubscribers);

        System.out.print("Enter the no. of subscribers who unsubscribed:");
        int lostSubscribers = sc.nextInt();
        y.Unsubscribed(lostSubscribers);

        sc.nextLine();

        System.out.print("Enter password to view subscriber count: ");
        String pin = sc.nextLine();
        y.getSubscriberCount(pin);

        System.out.println("\nEnter password to view full details:");
        String pin1= sc.nextLine();
        y.showdetails(pin1);
    }
}