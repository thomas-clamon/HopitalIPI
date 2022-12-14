package com.ipi.hopital;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("exemple")
public class Ressources {

    @GetMapping("hello")
    public String helloWorld(){
        return "Bonjour a tous";
    }

     @GetMapping("bonjour/{nom}")
    public String exemple(@PathVariable String nom){
        return "Bonjour " + nom;
     }

     @GetMapping("hello2")
     public String test(@RequestParam String prenom, @RequestParam String nom){
        return String.format("je m'appelle %s %s", nom, prenom);
     }

     @GetMapping("test")
    public int exemple(){
        return 1+123;
     }
}
