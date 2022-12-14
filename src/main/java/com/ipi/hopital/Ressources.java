package com.ipi.hopital;

import com.ipi.hopital.DTO.EtudiantAgeDto;
import com.ipi.hopital.DTO.EtudiantDto;
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

     @PostMapping("Somme")
    public Integer sum(@RequestBody List<Integer> list){
        int result =0;
        for (int i = 0; i<list.size(); i++){

            result = result + list.get(i);
        }
        return result;
    }

    @GetMapping ("afficher")
    public EtudiantDto afficher (){
        EtudiantDto etudiantDto = new EtudiantDto("Thomas",
                "CLAMON",
                LocalDate.of(1990,11, 3));

        return etudiantDto;
    }

        @PostMapping ("afficherAge")
        public EtudiantAgeDto afficherAge(@RequestBody EtudiantDto dto ){
            EtudiantAgeDto result = new EtudiantAgeDto();

            result.setNom(dto.getNom());
            result.setPrenom(dto.getPrenom());
            result.setAge(dto.CalculerAge());

            return result;
        }
    }
