import java.util.ArrayList;
import java.util.Arrays;
public class NetflixState implements State {
    private TV tv;
    private ArrayList<String> movies = new ArrayList<>(Arrays.asList("Die Hard", "50 First Dates", "La La Land", "Eat, Pray, Love", "Inception"));
    private ArrayList<String> tvShows = new ArrayList<>(Arrays.asList("How I Met Your Mother", "The Office", "New Girl", "Broadchurch", "Parks and Recreation"));

    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...");
        tv.setState(tv.getHomeState());
    }

    public void pressNetflixButton() {
        System.out.println("We are already in Netflix");
    }

    public void pressHuluButton() {
        System.out.println("Loading Hulu...");
        tv.setState(tv.getHuluState());
    }

    public void pressMovieButton() {
        System.out.println("Netflix Movies:");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println("- " + movies.get(i));
        }
    }

    public void pressTVButton() {
        System.out.println("Netflix TV Shows: ");
        for (int i = 0; i < tvShows.size(); i++) {
            System.out.println("- " + tvShows.get(i));
        }
    }
}
