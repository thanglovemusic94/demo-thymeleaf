package thangtony.quanlysinhvien.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import thangtony.quanlysinhvien.model.User;

@Controller
@RequestMapping("/")
public class HelloController {

    @GetMapping("xinchao")
    public String xinchao(){
        return "index";
    }


    @GetMapping("/user")
    public String xinchao2(Model model){

        User user = new User();
        user.setName("thang");
        user.setAge(18);

        model.addAttribute("user", user);

        return "index";
    }

    @GetMapping("/users")
    public String listUser(){
        return "index";
    }
}
