import java.util.ArrayList;
import java.util.Arrays;
public class HuluState implements State {
    private TV tv = new TV();
    
    private ArrayList<String> movies = new ArrayList<>(Arrays.asList("Crazy, Stupid Love", "Interstellar", "21 Jump Street", "Minions", "Despicable Me"));
    private ArrayList<String> tvShows = new ArrayList<>(Arrays.asList("iCarly", "Big Time Rush", "ABC News", "Jeopardy", "Garfield"));
    
    @Override
    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...");
        tv.setState(tv.getHomeState());
    }

    @Override
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...");
        tv.setState(tv.getNetflixState());
    }

    @Override
    public void pressHuluButton() {
        System.out.println("We are already in Hulu");
    }

    @Override
    public void pressMovieButton() {
        System.out.println("Hulu Movies:");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println("- " + movies.get(i));
        }
    }

    @Override
    public void pressTVButton() {
        System.out.println("Hulu TV Shows: ");
        for (int i = 0; i < tvShows.size(); i++) {
            System.out.println("- " + tvShows.get(i));
        }
    }
}
