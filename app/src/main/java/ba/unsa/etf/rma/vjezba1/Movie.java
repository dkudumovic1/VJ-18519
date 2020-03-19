package ba.unsa.etf.rma.vjezba1;

import android.graphics.ColorSpace;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String genre;
    private String releaseDate;
    private String homepage;
    private String overview;



    public Movie() {
    }

    public Movie(String title, String genre, String releaseDate, String homepage, String overview) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.homepage = homepage;
        this.overview = overview;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public static class MoviesModel {
        static ArrayList<Movie> movies = new ArrayList<>();

        public MoviesModel() {
            movies.add(new Movie("Titanic","Drama","19 December 1997","https://www.imdb.com/title/tt0120338/",
                    "Seventeen-year-old Rose hails from an aristocratic family and is set to be married. " +
                  "When she boards the Titanic, she meets Jack Dawson, an artist, and falls in love with him"));

            movies.add(new Movie("It","Horror","8 September 2017","https://www.imdb.com/title/tt1396484/","Seven helpless and bullied children are forced to face their worst nightmares when Pennywise," +
                    " a shape-shifting clown, reappears. The clown lives in the sewers and targets small innocent children"));
        }

        public ArrayList<Movie> getMovies() {
            return movies;
        }
    }
}
