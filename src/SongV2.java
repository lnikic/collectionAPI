public class SongV2 implements Comparable<SongV2> {
    private String tittle;
    private String artist;
    private int bpm;

    public int compareTo(SongV2 o) {
        return tittle.compareTo(o.getTittle());
    }

    public boolean equals(Object aSong) {
        SongV2 other = (SongV2) aSong;
        return tittle.equals(other.tittle);
    }

    public int hashCode() {
        return tittle.hashCode();
    }

    SongV2(String tittle, String artist, int bpm) {
        this.tittle = tittle;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTittle() {
        return tittle;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }

    public String toString() {
        return tittle;
    }
}
