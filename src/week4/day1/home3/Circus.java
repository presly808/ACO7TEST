package week4.day1.home3;

import collections.IList;
import collections.MyList;

public class Circus {
  private IList artists;

  public Circus() {
    this(10);
  }

  public Circus(int numberOfArtists) {
    artists = new MyList(numberOfArtists);
  }

  public void add(Artist artist) {
    artists.add(artist);
  }

  public void showArtists() {
//    for (Artist artist : artists) {
//      System.out.println(artist);
//    }
    for (int i = 0; i < artists.size(); i++) {
      System.out.println(artists.get(i));
    }
  }

  //don't do that! It's for learning purposes
  public void showAcrobats() {
    for (int i = 0; i < artists.size(); i++) {
      if (artists.get(i) instanceof Acrobat) {
        System.out.println(artists.get(i));
      }
    }
  }
}
