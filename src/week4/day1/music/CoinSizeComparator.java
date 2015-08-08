package week4.day1.music;

import week4.day1.Coin;

import java.util.Comparator;

public class CoinSizeComparator implements Comparator<Coin>{

  public int compare(Coin coin1, Coin coin2) {
    if (coin1.getSize() > coin2.getSize()) {
      return 1;
    } else if (coin1.getSize() < coin2.getSize()) {
      return -1;
    }
    return 0;
  }
}
