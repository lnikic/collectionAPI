import java.util.*;

public class Main {
    public static void main(String[] args) {
    new Main().go();

    }
    public void go() {
        List<SongV2> songList = MockSongs.getSongsV2();
        System.out.println(songList);

        songList.sort(((o1, o2) -> o1.getTittle().compareTo(o2.getTittle())));
        System.out.println(songList);

//        Set<SongV2> songSet = new HashSet<>(songList);
//        System.out.println(songSet);

        Set<SongV2> songTreeSet = new TreeSet<>(((o1, o2) -> o1.getBpm() - o2.getBpm()));
        songTreeSet.addAll(songList);
        System.out.println(songTreeSet);
    }
}