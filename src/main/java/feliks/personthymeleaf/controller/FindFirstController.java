package feliks.personthymeleaf.controller;

import feliks.personthymeleaf.model.Person;
import feliks.personthymeleaf.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class FindFirstController {

    private final PersonService personService;

    public FindFirstController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/find_first")
    public String findFirst (Model model){
        model.addAttribute("perem3",personService.findFirst());
        model.addAttribute("perem4", personService.findRandom());

         return "find_first";
    }
}
