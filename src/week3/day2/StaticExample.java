package week3.day2;

public class StaticExample {

  public static void main(String[] args) {
    Ticket ticket1 = new Ticket(30, "Oleg");
    Ticket ticket2 = new Ticket(30, "Anna");
    Ticket ticket3 = new Ticket(30, "Anna");

    System.out.println(ticket1);
    System.out.println(ticket2);
    System.out.println(ticket3);

    //bad example
    System.out.println(ticket1.getCounter());

    //correct
    System.out.println(Ticket.getCounter());

  }


}
