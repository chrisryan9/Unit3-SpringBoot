package Unit3.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BestMovieService {

    private Movie movie;

    @Autowired
    public BestMovieService(@Qualifier("TitanicMovie") Movie movie) {
        this.movie = movie;
    }

    public Movie getBestMovie() {
        if (movie == null) {
            throw new IllegalStateException("Movie is null in BestMovieService");
        }
        return movie;
    }


    @Override
    public String toString() {
        return "BestMovieService{" +
                "movie=" + movie +
                '}';
    }
}
