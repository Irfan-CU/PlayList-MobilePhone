import java.util.ArrayList;

public class Albums {

    private ArrayList<Album> Albums;

    public Albums() {
        this.Albums = new ArrayList<>();
    }

    public Albums(ArrayList<Album> albums) {
        this.Albums = albums;
    }

    public ArrayList<Album> getAlbums() {
        return Albums;
    }

    public void createAlbums(){
        Album newAlbum = new Album();
        newAlbum.createAlbum();
        this.Albums.add(newAlbum);
    }

    public void displayAlbums(){
        if (this.Albums.size() == 0) {
            System.out.println("No album present");
        }
        else {
            for (int i = 0; i<this.Albums.size();i++){
                this.Albums.get(i).displayAlbum();
            }
        }
    }

    public int  sizeOFAlbums(){
        return this.Albums.size();
    }



}
