package Movies;

public class Store {
    Movie[] movies;

    public Store()
    {
        this.movies = new Movie[10];
    }

    public Movie getMovie(int index)
    {
        return new Movie(movies[index]);
    }

    public void setMovie(int index,Movie movie)
    {
        this.movies[index] = new Movie(movie);
    }
}
