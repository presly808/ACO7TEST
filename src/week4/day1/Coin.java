package week4.day1;

import week3.day2.MyNumber;

public final class Coin implements Comparable<Coin> {
  private final int nominal;
  private final double size;

  public Coin(int nominal, double size) {
    this.nominal = nominal;
    this.size = size;
  }

  public int getNominal() {
    return nominal;
  }

  public double getSize() {
    return size;
  }

  @Override
  public String toString() {
    return String.format("nominal=%d, size=%.1f", nominal, size);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }

    if (obj == null || !(obj instanceof Coin)) {
      return false;
    }

    Coin other = ((Coin) obj);
    return nominal == other.nominal && size == other.size;
  }

  public int compareToCoin(Coin coin) {
    if (nominal > coin.nominal) {
      return 1;
    } else if (nominal < coin.nominal) {
      return -1;
    }
    return 0;
  }

  @Override
  public int compareTo(Coin coin) {
    if (nominal > coin.nominal) {
      return 1;
    } else if (nominal < coin.nominal) {
      return -1;
    }
    return 0;
  }
}
