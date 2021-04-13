public class TV {
    private State homeState;
    private State huluState;
    private State netflixState;
    private State state;

    public TV() {
        homeState = new HomeState();
        huluState = new HuluState();
        netflixState = new NetflixState();
        state = homeState;
    }

    public void pressHomeButton() {
        state.pressHomeButton();
    }

    public void pressNetflixButton() {
        state.pressNetflixButton();
    }

    public void pressHuluButton() {
        state.pressHuluButton();
    }

    public void pressMovieButton() {
        state.pressMovieButton();
    }

    public void pressTVButton() {
        state.pressTVButton();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getHomeState() {
        return homeState;
    }

    public State getNetflixState() {
        return netflixState;
    }

    public State getHuluState() {
        return huluState;
    }
}