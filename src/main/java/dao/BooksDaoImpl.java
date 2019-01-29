package dao;

import model.Books;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class BooksDaoImpl implements BooksDao{
    public static  final Logger LOGGER = LoggerFactory.getLogger(BooksDaoImpl.class);

    private SessionFactory sessionFactory;
    @Override
    public void addBooks(Books books) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(books);
        LOGGER.info("Books saved");
    }

    @Override
    public void updateBooks(Books books) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(books);
        LOGGER.info("Books upfate" + books);
    }

    @Override
    public void removeBook(int id) {

    }

    @Override
    public Books getBookById(int id) {
        return null;
    }

    @Override
    public List<Books> listBooksList() {
        return null;
    }
}
