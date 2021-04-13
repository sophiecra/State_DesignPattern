/**
 * Netflix State of the TV
 * @author Sophie Crane
 */
import java.util.ArrayList;
import java.util.Arrays;
public class NetflixState implements State {
    private TV tv;

    private ArrayList<String> movies = new ArrayList<>(Arrays.asList("Die Hard", "50 First Dates", "La La Land", "Eat, Pray, Love", "Inception"));
    private ArrayList<String> tvShows = new ArrayList<>(Arrays.asList("How I Met Your Mother", "The Office", "New Girl", "Broadchurch", "Parks and Recreation"));
    
    /**
     * Instance of the Netflix State
     * @param tv Instance of TV
     */
    public NetflixState(TV tv) {
        this.tv = tv;
    }

    /**
     * Presses the home button of the TV to get to the home state
     */
    @Override
    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...\n");
        tv.setState(tv.getHomeState());
    }

    /**
     * Presses the netflix button of the TV to get to the Netflix State
     */
    @Override
    public void pressNetflixButton() {
        System.out.println("We are already in Netflix\n");
    }

    /**
     * Presses the Hulu button of the TV to get to the Hulu State
     */
    @Override
    public void pressHuluButton() {
        System.out.println("Loading Hulu...\n");
        tv.setState(tv.getHuluState());
    }

    /**
     * Presses the movie button of the TV to display movies
     */
    @Override
    public void pressMovieButton() {
        System.out.println("Netflix Movies:");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println("- " + movies.get(i));
        }
        System.out.println();
    }

    /**
     * Presses the TV button of the TV to display TV shows
     */
    @Override
    public void pressTVButton() {
        System.out.println("Netflix TV Shows: ");
        for (int i = 0; i < tvShows.size(); i++) {
            System.out.println("- " + tvShows.get(i));
        }
        System.out.println();
    }
}
