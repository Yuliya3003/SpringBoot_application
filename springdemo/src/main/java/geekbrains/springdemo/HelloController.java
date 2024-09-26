package geekbrains.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HelloController {
    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("name", "Пользователь");
        return "greeting";
    }
}


