package controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Controller {

    @GetMapping("/main")
    public String user() {
        return "/main";
    }
}
