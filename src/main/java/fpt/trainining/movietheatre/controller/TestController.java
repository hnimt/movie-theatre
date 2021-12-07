package fpt.trainining.movietheatre.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String testAuthority() {
        return "Success";
    }
}
