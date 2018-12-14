package controller;

import model.Phones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.PhoneServise;

import java.awt.print.Book;

public class PhonesController {
    private PhoneServise phoneServise;

    @Autowired(required = true)
    @Qualifier(value = "phoneServise")
    public void setPhoneServise(PhoneServise phoneServise){this.phoneServise = phoneServise;}


    @RequestMapping(value = "phones", method = RequestMethod.GET)
    public String listBooks(Model model){
        model.addAttribute("book", new Book());
        model.addAttribute("listBooks", this.phoneServise.listPhonesList());

        return "phones";
    }

    @RequestMapping(value = "/phone/add", method = RequestMethod.POST)
    public String aaddPhones(@ModelAttribute("phone")Phones phones){
        if(phones.getId() == 0){
            this.phoneServise.addPhone(phones);
        }else{
            this.phoneServise.updatePhone(phones);
        }

        return "redirect^/phones";

    }

    @RequestMapping ("/remove/{id}")
    public String removeBook(@PathVariable("id") int id){
        this.phoneServise.removePhone(id);

        return "redirect:/phones";
    }

    @RequestMapping("edit/{id}")
    public String editBook(@PathVariable("id") int id, Model model){
        model.addAttribute("phones", this.phoneServise.getPhoneById(id));
        model.addAttribute("listPhones", this.phoneServise.listPhonesList());

        return "phones";
    }

    @RequestMapping("bookdata/{id}")
    public String bookData(@PathVariable("id") int id, Model model){
        model.addAttribute("phone", this.phoneServise.getPhoneById(id));

        return "phonedata";
    }

}
