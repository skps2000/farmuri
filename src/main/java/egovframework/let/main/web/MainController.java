package egovframework.let.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/shopper/main")
public class MainController {

    @GetMapping(value = "/index")
    public String index() {

        return "/shopper/main/index";
    }





}
