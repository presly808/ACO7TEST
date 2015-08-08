package week4.day1.music;

public class TestMusicants {
  public static void main(String[] args) {


    Bard bard = new Bard();

    //~~~~~~~~~~~~~~~~~~~~
    SongWriter songWriter = bard;
    Song superHit = songWriter.writeSong();

    Singer singer = bard;
    singer.sing(superHit);

  }
}
