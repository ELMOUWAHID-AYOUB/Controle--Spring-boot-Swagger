package ma.projet.entities;

import java.sql.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private Date dateProduction;
	@ManyToOne 
	private Categorie categorie;
	
	public Article() {
		super();
	}
	
	public Article(int id, String nom, Date dateProduction, Categorie categorie) {
		super();
		this.id = id;
		this.nom = nom;
		this.dateProduction = dateProduction;
		this.categorie = categorie;
	}
	

	@Override
	public String toString() {
		return "Article [id=" + id + ", nom=" + nom + ", dateProduction=" + dateProduction + ", categorie=" + categorie
				+ "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDateProduction() {
		return dateProduction;
	}
	public void setDateProduction(Date dateProduction) {
		this.dateProduction = dateProduction;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	
}
