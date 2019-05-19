package controller;


import model.GrphicsCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.GraficsCardService;

import java.awt.print.Book;

public class GraphicsCardController {
    private GraficsCardService graficsCardService;

    @Autowired(required = true)
    @Qualifier(value = "graficsCardService")
    public void setGraficsCardService(GraficsCardService graficsCardService){this.graficsCardService = graficsCardService;}


    @RequestMapping(value = "phones", method = RequestMethod.GET)
    public String listBooks(Model model){
        model.addAttribute("book", new Book());
        model.addAttribute("listBooks", this.graficsCardService.listGraficsCardList());

        return "graphicscard";
    }


    @RequestMapping(value = "/graphics/add", method = RequestMethod.POST)
    public String addGraphics(@ModelAttribute("graphics") GrphicsCard graphics){
        if(graphics.getId() == 0){
            this.graficsCardService.addGraficsCard(graphics);
        }else{
            this.graficsCardService.updateGraficsCard(graphics);
        }

        return "redirect^/phones";

    }

    @RequestMapping ("/remove/{id}")
    public String removeBook(@PathVariable("id") int id){
        this.graficsCardService.removeGraficsCard(id);

        return "redirect:/graphics";
    }

    @RequestMapping("edit/{id}")
    public String editBook(@PathVariable("id") int id, Model model){
        model.addAttribute("graphics", this.graficsCardService.getGraficsCardById(id));
        model.addAttribute("listGraphics", this.graficsCardService.listGraficsCardList());

        return "graphics";
    }

    @RequestMapping("bookdata/{id}")
    public String bookData(@PathVariable("id") int id, Model model){
        model.addAttribute("phone", this.graficsCardService.getGraficsCardById(id));

        return "graphicsdata";
    }



}
