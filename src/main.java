import java.util.Scanner;

public class main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Albums newAlbums = new Albums();

        // Objective: Playlist of Songs


        //Steps:

        //1-Create a class Songs

        //2-Create a class Album
            // Different albums are stores in arrayList and each album has songs
            // List<Songs> album

        //3-Create an albumList Class
            // arrayList<album> albums;

        //4-Create a class PlayList
            //List<Songs> PlayList


       printMenu(newAlbums);






    }
    public static void printMenu(Albums newAlbums){
        System.out.println("Menu");
        System.out.println("1 to add the Song to album");
        if (newAlbums.sizeOFAlbums()>0)
        {

        }
        else{
            System.out.println("No albums are present.");
            newAlbums.createAlbums();
            newAlbums.displayAlbums();
        }
    }
}
