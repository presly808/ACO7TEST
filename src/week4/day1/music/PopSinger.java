package week4.day1.music;

public class PopSinger implements Singer {
  @Override
  public void sing(Song song) {
    System.out.println(String.format("Sound like Gaga: %s", song));
  }
}
