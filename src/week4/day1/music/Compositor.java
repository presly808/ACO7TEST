package week4.day1.music;

public class Compositor implements SongWriter {

  @Override
  public Song writeSong() {
    return new Song("La la");
  }
}
