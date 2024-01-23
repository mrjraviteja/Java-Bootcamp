package Exceptions;

public class Main {
    public void setName(String name)
    {
        if(name == null || name == "")
        {
            throw new IllegalArgumentException();
        }
    }

    public void setFormat(String format)
    {
        if(format == null || format == "")
        {
            throw new IllegalArgumentException();
        }
    }

    public void setRating(double rating)
    {
        if(rating < 0 || rating > 10)
        {
            throw new IllegalArgumentException();
        }
    }
}
