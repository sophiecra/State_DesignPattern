/**
 * Home State of the TV
 * @author Sophie Crane
 */
public class HomeState implements State {
    private TV tv;
    
    /**
     * Instance of the Home State
     * @param tv Instance of TV
     */
    public HomeState(TV tv) {
        this.tv = tv;
    }

    /**
     * Presses home button of the TV to go to Home State
     */
    @Override
    public void pressHomeButton() {
        System.out.println("TV is already on home screen\n");
    }

    /**
     * Presses Netflix button of the TV to go to Netflix State
     */
    @Override
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...\n");
        tv.setState(tv.getNetflixState());
    }

    /**
     * Presses Hulu button of the TV to go to Hulu state
     */
    @Override
    public void pressHuluButton() {
        System.out.println("Loading Hulu...\n");
        tv.setState(tv.getHuluState());
    }

    /**
     * Presses movie button of the TV to display movies
     */
    @Override
    public void pressMovieButton() {
        System.out.println("You must pick an app to show movies\n");
    }

    /**
     * Presses TV button of the TV to display TV shows
     */
    @Override
    public void pressTVButton() {
        System.out.println("You must pick an app to show movies\n");
    }
}
