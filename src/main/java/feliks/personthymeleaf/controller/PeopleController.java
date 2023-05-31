package feliks.personthymeleaf.controller;

import feliks.personthymeleaf.model.Dog;
import feliks.personthymeleaf.model.Person;
import feliks.personthymeleaf.repository.DogRepository;
import feliks.personthymeleaf.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/people")
public class PeopleController {

    private final PersonService personService;
    private final DogRepository dogRepository;

    public PeopleController(PersonService personService, DogRepository dogRepository) {
        this.personService = personService;
        this.dogRepository = dogRepository;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("people", personService.findAll());
        return "people/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("person", personService.show(id));
        return "people/show";
    }

    @GetMapping("/new")
    public String newPerson(@ModelAttribute("person") Person person,
                            @ModelAttribute ("dog")Dog dog, Model model) {
        model.addAttribute("dogs", dogRepository.findAll());

        return "people/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("person") Person person) {

        personService.save(person);
        return "redirect:/people";
    }
}
