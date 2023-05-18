package feliks.personthymeleaf.controller;

import feliks.personthymeleaf.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewAllController {
    private final PersonService personService;

    @Autowired

    public ViewAllController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping("/view_all")
    public String viewAll(Model model){
        model.addAttribute("perem2", personService.findAll() );



        return "view_all";
    }
}
