import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Album {

    private static Scanner scanner = new Scanner(System.in);

    private String albumTitle;
    private LinkedList<Songs> album;

    public Album() {
        this.album = new LinkedList<>();
        this.albumTitle = "";
    }

    public Album(LinkedList<Songs> album, String albumTitle) {
        this.album = album;
        this.albumTitle = albumTitle;
    }

    public LinkedList<Songs> getAlbum() {
        return album;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void addSong (Songs song){
        album.add(song);
    }

    public void removeSong (Songs song){
        album.remove(song);
    }

    public void createAlbum(){

        boolean addSong = true;

        System.out.println("Please enter the name of the Album");
        this.albumTitle = scanner.nextLine();

        while (addSong){
            Songs newSong = new Songs();
            newSong.createSong();
            this.album.add(newSong);
            System.out.println("Please press 1 to quit and 2 to enter next song.");
            int check = scanner.nextInt();
            if (check==1){
                addSong = false;
            }

        }

    }

    public void displayAlbum(){
        for (Songs temp : this.album){
            System.out.println("The next song in this list is "+ temp.getTitle() + " and the duration is " + temp.getDuration());
        }
    }





}
