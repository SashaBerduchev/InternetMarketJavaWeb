package controller;


import model.Computers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.ComputerService;

import java.awt.print.Book;

public class ComputersController {
    private ComputerService computerService;

    @Autowired(required = true)
    @Qualifier(value = "ComputersService")
    public void setComputerService(ComputerService computerService){this.computerService = computerService;}


    @RequestMapping(value = "computers", method = RequestMethod.GET)
    public String listBooks(Model model){
        model.addAttribute("book", new Book());
        model.addAttribute("listBooks", this.computerService.listComputersCardList());

        return "computers";
    }


    @RequestMapping(value = "/computers/add", method = RequestMethod.POST)
    public String addGraphics(@ModelAttribute("computers") Computers computers){
        if(computers.getId() == 0){
            this.computerService.addComputersCard(computers);
        }else{
            this.computerService.updateComputersCard(computers);
        }

        return "redirect^/computers";

    }

    @RequestMapping ("/remove/{id}")
    public String removeBook(@PathVariable("id") int id){
        this.computerService.removeComputersCard(id);

        return "redirect:/graphics";
    }

    @RequestMapping("edit/{id}")
    public String editBook(@PathVariable("id") int id, Model model){
        model.addAttribute("computers", this.computerService.getComputersCardById(id));
        model.addAttribute("listComputers", this.computerService.listComputersCardList());

        return "graphics";
    }

    @RequestMapping("bookdata/{id}")
    public String bookData(@PathVariable("id") int id, Model model){
        model.addAttribute("computers", this.computerService.getComputersCardById(id));

        return "computers";
    }

}
