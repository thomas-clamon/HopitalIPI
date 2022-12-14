package com.ipi.hopital.DTO;

import java.time.LocalDate;
import java.time.Period;

public class EtudiantDto {

    private String prenom;
    private String nom;
    private LocalDate date_naisse;

    public EtudiantDto(String prenom, String nom, LocalDate date_naisse) {
        this.prenom = prenom;
        this.nom = nom;
        this.date_naisse = date_naisse;
    }

    public int CalculerAge()
    {
        return Period.between(date_naisse, LocalDate.now()).getYears();
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDate_naisse() {
        return date_naisse;
    }

    public void setDate_naisse(LocalDate date_naisse) {
        this.date_naisse = date_naisse;
    }
}
