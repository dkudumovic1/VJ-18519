package ba.unsa.etf.rma.vjezba1;

import java.util.ArrayList;

public class MovieListInteractor {
    public  ArrayList<Movie> get () {
        return Movie.MoviesModel.movies;
    }
}
