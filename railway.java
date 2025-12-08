
class TicketBooking extends Thread {
    private String passengerName;
    TicketBooking(String name) {
        this.passengerName = name;
    }

    public void run() {
        while(true){
        System.out.println("Processing booking for: " + passengerName 
                           +"Thread:" + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Booking confirmed for: " + passengerName);
    }
}
}

public class railway {
    public static void main(String[] args) {
        TicketBooking t1 = new TicketBooking("Alice");
        TicketBooking t2 = new TicketBooking("Bob");
        TicketBooking t3 = new TicketBooking("Charlie");
        t1.start();
        t2.start();
        t3.start();
    }
}
