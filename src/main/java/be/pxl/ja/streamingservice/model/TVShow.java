package be.pxl.ja.streamingservice.model;

public final class TVShow extends Content{
    private int numberOfSeasons;

    public TVShow(String title, Rating maturityRating) {
        super(title, maturityRating);
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }
}
