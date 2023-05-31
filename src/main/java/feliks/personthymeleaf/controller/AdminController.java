package feliks.personthymeleaf.controller;

import feliks.personthymeleaf.model.Person;
import feliks.personthymeleaf.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    //для создания выпадающего списка. Сделать кого-то из юзеров админом

    private final PersonService personService;

    public AdminController(PersonService personService) {
        this.personService = personService;
    }
    @GetMapping()//при обращении на адрес /admin в модель person добавляем переменную people, содержащую в себе список всех
    //людей, а пользователю отображаем страницу admin_page c с формой, в которой уже будут все люди, а с этой формы уже
    //пойдет пост-запрос на /add, с указанием, с каким именно id человек выбран (т.е. у модели person будет уже какой-то конкретный
    //выбранный id.
    public String adminPage (Model model, @ModelAttribute ("person") Person person){
        model.addAttribute("people", personService.findAll());
        return "admin_page";
    }

    @PostMapping ("/add")// из переменной модели person вытаскиваем ее id (другие поля в модели null, так как мы их не сетили в модель)
    public String makeAdmin (@ModelAttribute ("person") Person person ){
        System.out.println(person.getId());
        System.out.println(person.getName());
        System.out.println(person.getAge());
        return "redirect:/people";

    }
}
