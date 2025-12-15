import java.util.*;

public class Main {
    public static void main(String[] args) {
//    new Main().go();
//    new Main().map();
        new Main().convenienceFactoryMethodsForCollections();

    }

    private void convenienceFactoryMethodsForCollections() {
        List<String> strings = List.of("somersault", "cassidy", "$10");
        List<SongV2> songs = List.of(
                new SongV2("somersault", "zero 7", 147),
                new SongV2("cassidy", "grateful dead", 158),
                new SongV2("$10", "hitchhiker", 140));
        System.out.println(songs);

        Set<Book> books = Set.of(
                new Book("How Cats Work"),
                new Book("Remix your Body"),
                new Book("Finding Emo"));
        books.stream().filter(b -> b.getTittle().contains("Emo")).forEach(System.out::println);
        System.out.println(books);

        Map<String, Integer> scores = Map.of(
                "Kathy", 42,
                "Bert", 343,
                "Skyler", 420);
        System.out.println(scores);
        Map<String, String> stores = Map.ofEntries(
                Map.entry("Riley", "Supersports"),
                Map.entry("Brooklyn", "Camera World"),
                Map.entry("Jay", "Homecase"));
        System.out.println(stores.get("Jay"));
    }

    private void map() {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Kathy", 42);
        scores.put("Bert", 343);
        scores.put("Skyler", 420);

        System.out.println(scores);
        System.out.println(scores.get("Bert"));
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