package shop.samdul.greeting.controller;
import java.util.Stack;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    Stack<String> names = new Stack<>();
    Stack<People> ps = new Stack<>();  

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name",required = false, defaultValue = "HI")String name, Model model){
        names.push(name);
        model.addAttribute("names", names);
        return "greeting";
    }
    @GetMapping("/people")
    public String people(@RequestParam(name="name",required = false, defaultValue = "HI")String name, Model model){
        People p = new People(0, name);
        p.num=ps.size()+1;
        ps.add(p);
        model.addAttribute("people", ps);
        return "greeting3";
    }

}