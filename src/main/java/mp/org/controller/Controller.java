package mp.org.controller;

import mp.org.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {
    @Autowired
    private Service service;
    @GetMapping("/")
    public String get(){
        return service.getMessage();
    }
}
