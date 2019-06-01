package net.berduchev.internetmarket.controller;

import net.berduchev.internetmarket.model.Phones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import net.berduchev.internetmarket.service.PhoneService;



@Controller
public class PhonesController {
    private PhoneService phoneService;

    @Autowired(required = true)
    @Qualifier(value = "phonesService")
    public void setPhoneServise(PhoneService phoneService){this.phoneService = phoneService;}


    @RequestMapping(value = "phones", method = RequestMethod.GET)
    public String listPhones(Model model){
        model.addAttribute("phones", new Phones());
        model.addAttribute("listPhones", this.phoneService.listPhonesList());

        return "phones";
    }

    @RequestMapping(value = "/phone/add", method = RequestMethod.POST)
    public String addPhones(@ModelAttribute("phone")Phones phones){
        if(phones.getId() == 0){
            this.phoneService.addPhone(phones);
        }else{
            this.phoneService.updatePhone(phones);
        }

        return "redirect:/phones";

    }

    @RequestMapping ("/remove/{id}")
    public String removePhones(@PathVariable("id") int id){
        this.phoneService.removePhone(id);

        return "redirect:/phones";
    }

    @RequestMapping("edit/{id}")
    public String editPhones(@PathVariable("id") int id, Model model){
        model.addAttribute("phones", this.phoneService.getPhoneById(id));
        model.addAttribute("listPhones", this.phoneService.listPhonesList());

        return "phones";
    }

    @RequestMapping("phonesdata/{id}")
    public String phoneData(@PathVariable("id") int id, Model model){
        model.addAttribute("phone", this.phoneService.getPhoneById(id));

        return "phonesdata";
    }

}