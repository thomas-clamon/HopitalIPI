package com.ipi.hopital;

import com.ipi.hopital.dto.EtudientDto;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

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
        return 1+1;
     }


     @PostMapping("Somme")
     public Integer sum(@RequestBody List<Integer> list) {
        int result = 0;
        for (int i = 0;i<list.size(); i++) {
            result = result + list.get(i);
         }
        return result;
     }

     @GetMapping("afficher")
    public EtudientDto afficher() {
        EtudientDto etudiantDto = new EtudientDto("Thomas",
                "Clamont",
                LocalDate.of(1990,11,03));
    return etudiantDto;
    }

}
