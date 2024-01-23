package Movies;

import java.util.Scanner;

public class Main {

    static Store store = new Store();

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        Movie[] movies = new Movie[]{
            new Movie("The Shawshank Redemption", "BlueRay", 9.2),
            new Movie("The Godfather", "BlueRay", 9.1),
            new Movie("The Godfather: Part II", "DVD", 9.0),
            new Movie("The Dark Knight", "BlueRay", 9.0),
            new Movie("Schindler's List", "DVD", 8.9),
            new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
            new Movie("Pulp Fiction", "DVD", 8.8),
            new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        };

        for(int i=0;i<movies.length;i++)
        {
            store.setMovie(i,movies[i]);
        }

        System.out.println("***********************************IMDB**********************************");
        for(int i=0;i<movies.length;i++)
        {
            System.out.println(movies[i]);
        }

        do {
            System.out.println("Please choose an integer between 0-9: ");
            
        } while (!(s.next().equals("stop")));
        s.close();
    }
}
