package dao;

import model.Books;

import java.util.List;


public interface BooksDao {
    public void addBooks(Books books);
    public  void updateBooks(Books books);
    public void removeBook(int id);
    public Books getBookById(int id);
    public List<Books> listBooksList();
}
