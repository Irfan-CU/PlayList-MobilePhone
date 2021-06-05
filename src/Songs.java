import java.util.Scanner;

public class Songs {

    private String Title;
    private String duration;
    private static Scanner scanner = new Scanner(System.in);

    public Songs() {
        //this.Title = title;
        //this.duration = duration;
    }

    public String getTitle() {
        return Title;
    }

    private void setTitle(String title) {
        this.Title = title;
    }

    public String getDuration() {
        return duration;
    }

    private void setDuration(String duration) {
        this.duration = duration;
    }

    public void createSong(){
        System.out.println("Please enter the title of the song");
        this.setTitle(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Please enter the duration of the song");
        this.setDuration(scanner.nextLine());
        scanner.nextLine();
    }
}
