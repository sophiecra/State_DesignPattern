/**
 * Hulu State of the TV
 * @author Sophie Crane
 */
import java.util.ArrayList;
import java.util.Arrays;
public class HuluState implements State {
    private TV tv;

    private ArrayList<String> movies = new ArrayList<>(Arrays.asList("Crazy, Stupid Love", "Interstellar", "21 Jump Street", "Minions", "Despicable Me"));
    private ArrayList<String> tvShows = new ArrayList<>(Arrays.asList("iCarly", "Big Time Rush", "ABC News", "Jeopardy", "Garfield"));

    /**
     * Instance of the Hulu State
     * @param tv Instance of TV 
     */
    public HuluState(TV tv) {
        this.tv = tv;
    }

    /**
     * Presses home button to go to Home State 
     */
    @Override
    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...\n");
        tv.setState(tv.getHomeState());
    }

    /**
     * Presses Netflix button to go to Netflix State
     */
    @Override
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...\n");
        tv.setState(tv.getNetflixState());
    }

    /**
     * Presses Hulu Button to go to Hulu State
     */
    @Override
    public void pressHuluButton() {
        System.out.println("We are already in Hulu\n");
    }

    /**
     * Presses movie button to display movies
     */
    @Override
    public void pressMovieButton() {
        System.out.println("Hulu Movies:");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println("- " + movies.get(i));
        }
        System.out.println();
    }

    /**
     * Presses TV button to display TV shows
     */
    @Override
    public void pressTVButton() {
        System.out.println("Hulu TV Shows: ");
        for (int i = 0; i < tvShows.size(); i++) {
            System.out.println("- " + tvShows.get(i));
        }
        System.out.println();
    }
}
