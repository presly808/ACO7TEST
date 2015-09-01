package week7.day1;


import java.util.Date;

public class BuyTicket {
  public static void main(String[] args) {
//    RailwayTicket ticket =
//      new RailwayTicket(101, "Kiev", "Chop", "Valera", new Date(), "089A", 5, 17, true, false);
//

    RailwayTicket ticket
      = RailwayTicket.builder(101)
      .departure("Kiev")
      .destination("Chop")
      .passenger("Valera")
      .departureDate(new Date())
      .train("089A")
      .wagon(5)
      .place(17)
      .tea(true)
      .postelka(false).build();

    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(2).append(123).toString();
  }
}
