package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;


public class Movie extends Content implements Playable {
    public static final int LONG_PLAYING_TIME = 2 * 60 + 15;

    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;

    public Movie(String title, Rating maturityRating) {
        super(title, maturityRating);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void play() {
        System.out.println("Playing " + this);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this);
    }

    public void setDuration(int duration) {
        if (duration < 0){
            this.duration = duration * -1;
        }
        else {
            this.duration = duration;
        }

    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public boolean isLongPlayingTime(){
        return duration >= LONG_PLAYING_TIME;
    }

    public String getPlayingTime () {
        // TODO: implement this method correctly
        String string = "";
        if (duration == 0) {
            string = "?";
        } else if (duration < 60) {
            string = String.format("%d min", duration);
        } else {
            if (duration % 60 == 0) {
                int uur = duration / 60;
                string = String.format("%d h", uur);
            } else {
                int uur = duration / 60;
                int min = duration % 60;
                string = String.format("%d h %d min", uur, min);
            }
        }
        return string;
    }


    @Override
    public String toString() {
        if (releaseDate != null) {
            return String.format("%s (%4d)", super.getTitle(), releaseDate.getYear());
        } else {
            return getTitle();
        }
    }

}