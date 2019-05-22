package net.berduchev.internetmarket.service;

import net.berduchev.internetmarket.dao.BooksDao;
import net.berduchev.internetmarket.model.Books;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BooksServiseImpl implements BooksServise {
    private BooksDao booksDao;
    public void setBooksDao(BooksDao booksDao){this.booksDao = booksDao;}
    @Override
    @Transactional
    public void addBooks(Books books) {
        this.booksDao.addBooks(books);
    }

    @Override
    public void updateBooks(Books books) {
        this.booksDao.updateBooks(books);
    }

    @Override
    public void removeBook(int id) {
        this.booksDao.removeBook(id);
    }

    @Override
    public Books getBookById(int id) {
        return this.booksDao.getBookById(id);
    }

    @Override
    public List<Books> listBooksList() {
        return this.booksDao.listBooksList();
    }
}
