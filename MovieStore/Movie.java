package MovieStore;

public class Movie {
    private String name;
    private String director;
    private String genre;
    private int year;
    private double rating;

    public Movie(String name,String director,String genre,int year,double rating)
    {
        setName(name);
        setDirector(director);
        setGenre(genre);
        setRating(rating);
        setYear(year);
    }

    public Movie(Movie obj)
    {
        setName(obj.name);
        setDirector(obj.director);
        setGenre(obj.genre);
        setRating(obj.rating);
        setYear(obj.year);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", director='" + getDirector() + "'" +
            ", genre='" + getGenre() + "'" +
            ", year='" + getYear() + "'" +
            ", rating='" + getRating() + "'" +
            "}";
    }

}
