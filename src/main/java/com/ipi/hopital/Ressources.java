package com.ipi.hopital;

import com.ipi.hopital.dto.EtudiantDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api")
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

     @PostMapping("sum")
    public int sum(@RequestBody List<Integer> numbers) {
         return numbers.stream().mapToInt(Integer::intValue).sum();
     }

     @GetMapping("afficher")
    public EtudiantDTO afficher(){
        return new EtudiantDTO("Lagarde", "Samuel", LocalDate.of(2003, 11, 2));
     }

     @PostMapping("afficherAge")
    public int afficherAge(@RequestBody EtudiantDTO etudiantDTO){
        return LocalDate.now().getYear() - etudiantDTO.getDateNaissance().getYear();
     }
}
