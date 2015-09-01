package week7.day1;

import java.util.Date;

public class RailwayTicket {
  private final long id;
  private final String departure;
  private final String destination;
  private final String passName;
  private final Date date;
  private final String trainId;
  private final int wagon;
  private final int place;
  private final boolean tea;
  private final boolean postelka;

  private RailwayTicket(Builder builder) {
    this.id = builder.id;
    this.departure = builder.departure;
    this.destination = builder.destination;
    this.passName = builder.name;
    this.date = builder.date;
    this.trainId = builder.trainId;
    this.wagon = builder.wagon;
    this.place = builder.place;
    this.tea = builder.tea;
    this.postelka = builder.postelka;
  }

  public static Builder builder(long id) {
    return new Builder(id);
  }

  public static class Builder {
    private final long id;
    private String departure;
    private String destination;
    private String name;
    private Date date;
    private String trainId;
    private int wagon;
    private int place;
    private boolean tea;
    private boolean postelka;

    private Builder(long id) {
      this.id = id;
    }

    public Builder departure(String departure) {
      this.departure = departure;
      return this;
    }

    public Builder destination(String destination) {
      this.destination = destination;
      return this;
    }

    public Builder passenger(String name) {
      this.name = name;
      return this;
    }

    public Builder departureDate(Date date) {
      this.date = date;
      return this;
    }

    public Builder train(String id) {
      this.trainId = id;
      return this;
    }

    public Builder wagon(int wagon) {
      this.wagon = wagon;
      return this;
    }

    public Builder place(int place) {
      this.place = place;
      return this;
    }

    public Builder tea(boolean tea) {
      this.tea = tea;
      return this;
    }

    public Builder postelka(boolean postelka) {
      this.postelka = postelka;
      return this;
    }

    public RailwayTicket build() {
      return new RailwayTicket(this);
    }
  }
}
