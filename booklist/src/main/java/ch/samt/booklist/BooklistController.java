package ch.samt.booklist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BooklistController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("book", new Book());
        return "home";
    }

    @PostMapping("/insert")
    public String saveBook(@ModelAttribute Book book){
        System.out.println(book);
        return "bookAdded";
    }

}