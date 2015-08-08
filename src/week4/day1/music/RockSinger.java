package week4.day1.music;

public class RockSinger implements Singer {
  @Override
  public void sing(Song song) {
    System.out.println(String.format("Super rock-star voice : %s", song));
  }
}
