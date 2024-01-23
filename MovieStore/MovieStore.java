package MovieStore;

import java.util.*;

public class MovieStore {
    private List<Movie> movies;

    public MovieStore()
    {
        this.movies = new ArrayList<>(); 
    }

    public void addMovie(Movie obj)
    {
        this.movies.add(new Movie(obj));
    }

    public List<Movie> filterByGenre(String genre)
    {
        return this.movies.stream().filter(x -> x.getGenre() == genre).toList();
    }

    public List<Movie> sortByReleaseYear()
    {
        return this.movies.stream().sorted((right,left) -> Integer.compare(right.getYear(),left.getYear())).toList();
    }

    public List<Movie> getTopRatedMovies(int no)
    {
        return this.movies.stream().sorted((right,left) -> Double.compare(left.getRating(), right.getRating())).limit(no).toList();
    }
}
