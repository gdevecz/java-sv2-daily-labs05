package day01;

import java.time.LocalDateTime;
import java.util.List;

public class Movie {

    private String title;

    private List<LocalDateTime> onScreen;


    public Movie(String name, List<LocalDateTime> played) {
        this.title = name;
        this.onScreen = played;
    }

    public String getTitle() {
        return title;
    }

    public List<LocalDateTime> getOnScreen() {
        return onScreen;
    }
}
