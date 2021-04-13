public class HomeState implements State {
    private TV tv;
    
    @Override
    public void pressHomeButton() {
        System.out.println("TV is already on home screen");
    }

    @Override
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...");
        tv.setState(tv.getNetflixState());
    }

    public void pressHuluButton() {
        System.out.println("Loading Hulu...");
        tv.setState(tv.getHuluState());
    }

    public void pressMovieButton() {
        System.out.println("You must pick an app to show movies");
    }

    public void pressTVButton() {
        System.out.println("You must pick an app to show movies");
    }
}
