import java.util.HashMap;
import java.util.Scanner;
class MusicLibrary {
    private HashMap<String, String> musicLib;
    public MusicLibrary() {
        this.musicLib = new HashMap<>();
    }
    public void addSong(String artistName, String songId) {
        musicLib.put(songId, artistName);
        System.out.println("Artist " + artistName + " added with ID " + songId);
    }
    public String getSong(String songId) {
        if (musicLib.containsKey(songId)) {
            return "Song with artist name " + musicLib.get(songId) + " found";
        } else {
            return "Song not found";
        }
    }
}
public class store {
    public static void main(String[] args) {
        MusicLibrary songs = new MusicLibrary();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1:Add Song \n2:Get Song \n3:Exit");
            System.out.print("Enter your choice:");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                System.out.print("Enter artist name:");
                String artistName = scanner.nextLine();
                System.out.print("Enter song id:");
                String songId = scanner.nextLine();
                songs.addSong(artistName, songId);
            } else if (choice.equals("2")) {
                System.out.print("Enter song id:");
                String songId = scanner.nextLine();
                System.out.println(songs.getSong(songId));
            } else if (choice.equals("3")) {
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
        scanner.close();
    }
}
