package net.berduchev.internetmarket.controller;

import com.mysql.cj.xdevapi.SessionFactory;
import net.berduchev.internetmarket.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import net.berduchev.internetmarket.service.BooksServise;


public class BooksController {
    private BooksServise booksServise;
    @Autowired(required = true)
    @Qualifier(value = "booksServise")
    public void setBooksServise(BooksServise booksServise){this.booksServise = booksServise;}

    @RequestMapping(value = "books", method = RequestMethod.GET)
    public String listBooks(Model model){
        model.addAttribute("books", new Books());
        model.addAttribute("listBooks", this.booksServise.listBooksList());

        return "books";
    }

    @RequestMapping(value = "/books/add", method = RequestMethod.POST)
    public String addPhones(@ModelAttribute("book")Books books){
        if(books.getId() == 0){
            this.booksServise.addBooks(books);
        }else{
            this.booksServise.updateBooks(books);
        }

        return "redirect:/books";

    }

    @RequestMapping ("/remove/{id}")
    public String removePhones(@PathVariable("id") int id){
        this.booksServise.removeBook(id);

        return "redirect:/books";
    }

    @RequestMapping("edit/{id}")
    public String editPhones(@PathVariable("id") int id, Model model){
        model.addAttribute("books", this.booksServise.getBookById(id));
        model.addAttribute("listBooks", this.booksServise.getBookById(id));

        return "books";
    }

    @RequestMapping("booksdata/{id}")
    public String bookData(@PathVariable("id") int id, Model model){
        model.addAttribute("book", this.booksServise.getBookById(id));

        return "booksdata";
    }


}
