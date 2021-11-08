package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {

    List<Movie> movies = new ArrayList<>();


    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<String> findMovieByTime(LocalDateTime time) {
        List<String> namesOfMovies = new ArrayList<>();

        for (Movie movie : movies) {
            if (movieContainsTime(movie, time)) {
                namesOfMovies.add(movie.getTitle());
            }
        }
        return namesOfMovies;
    }

    private boolean movieContainsTime(Movie movie, LocalDateTime time) {

        for (LocalDateTime date : movie.getOnScreen()) {
            if (date.isEqual(time)) {
                return true;
            }
        }
        return false;
    }
}
