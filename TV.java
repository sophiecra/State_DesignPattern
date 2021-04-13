/**
 * A television
 * @author Sophie Crane
 */
public class TV {
    private State homeState;
    private State huluState;
    private State netflixState;

    private State state;

    /**
     * Sets the default variables of the TV
     */
    public TV() {
        homeState = new HomeState(this);
        huluState = new HuluState(this);
        netflixState = new NetflixState(this);
        state = homeState;
    }

    /**
     * Presses the home button of the TV to go back to the home screen
     */
    public void pressHomeButton() {
        state.pressHomeButton();
    }

    /**
     * Presses the Netflix button of the TV to go to Netflix
     */
    public void pressNetflixButton() {
        state.pressNetflixButton();
    }

    /**
     * Presses the Hulu button of the TV to go to Hulu
     */
    public void pressHuluButton() {
        state.pressHuluButton();
    }

    /**
     * Presses the movie button to display movies
     */
    public void pressMovieButton() {
        state.pressMovieButton();
    }

    /**
     * Presses the TV button to display TV shows
     */
    public void pressTVButton() {
        state.pressTVButton();
    }

    /**
     * Sets the state of the TV
     * @param state New state to set to 
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Returns the home state of the TV
     * @return Home State
     */
    public State getHomeState() {
        return homeState;
    }

    /**
     * Returns Netflix state of the TV
     * @return Netflix State
     */
    public State getNetflixState() {
        return netflixState;
    }

    /**
     * Returns Hulu State of the TV
     * @return Hulu State
     */
    public State getHuluState() {
        return huluState;
    }
}