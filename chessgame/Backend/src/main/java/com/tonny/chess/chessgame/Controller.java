package com.tonny.chess.chessgame;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("/")
    public String sayHello() {
        return "index.jsx";
    }
}
