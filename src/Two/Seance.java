package Two;

import java.time.Duration;

public class Seance extends Movie{
    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance() {
    }

    public Seance(String title, Duration filmLenth, Movie movie, Time startTime, Time endTime) {
        super(title, filmLenth);
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = startTime+Duration.ofHours(1);
    }
}
