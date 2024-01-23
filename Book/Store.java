package Book;

import java.util.*;

public class Store {
    private ArrayList<Book> books;

    public Store()
    {
        this.books = new ArrayList<>();
    }

    public Book getBook(int index)
    {
        return new Book(this.books.get(index));
    }

    public void setBook(int index,Book obj)
    {
        this.books.add(index,new Book(obj));
    }

    public boolean contains(Book book)
    {
        return this.books.contains(book);
    }

    public void sellBook(String title)
    {
        for(int i=0;i<books.size();i++)
        {
            if(books.get(i).getTitle().equals(title))
            {
                this.books.remove(i);
            }
        }
    }

    public void addBook(Book newBook)
    {
        this.books.add(new Book(newBook));
    }
}
