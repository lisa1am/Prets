package fr.dauphine.miageif.msa.Biblio;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Pret {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="isbn")
    private String isbn;

    @Column(name="lecteur")
    private Long lecteur;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name="date_pret")
    private Date datepret;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name="date_retour")
    private Date dateretour;

    public Pret(){}

    public Pret(String isbn, Long lecteur, Date datepret, Date dateretour) {
        this.isbn = isbn;
        this.lecteur = lecteur;
        this.datepret = datepret;
        this.dateretour = dateretour;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Long getLecteur() {
        return lecteur;
    }

    public void setLecteur(Long lecteur) {
        this.lecteur = lecteur;
    }

    public Date getDate_pret() {
        return datepret;
    }

    public void setDate_pret(Date date_pret) {
        this.datepret = date_pret;
    }

    public Date getDate_retour() {
        return dateretour;
    }

    public void setDate_retour(Date date_retour) {
        this.dateretour = date_retour;
    }
}
