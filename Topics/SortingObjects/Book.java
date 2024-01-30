package SortingObjects;

public class Book implements Comparable<Book>
{

    private String title;
    private int year;

    public Book(String title,int year)
    {
        this.title = title;
        this.year = year;
    }
    
    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.year,other.year);
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
