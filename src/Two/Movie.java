package Two;

import java.time.Duration;

public class Movie {
    private String title;
    private Duration filmLenth;

    public Movie() {
    }

    public Movie(String title, Duration filmLenth) {
        this.title = title;
        this.filmLenth = filmLenth = Duration.ofHours(1);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Duration getFilmLenth() {
        return filmLenth;
    }

    public void setFilmLenth(Duration filmLenth) {
        this.filmLenth = filmLenth = Duration.ofHours(1);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", filmLenth=" + filmLenth +
                '}';
    }
}
