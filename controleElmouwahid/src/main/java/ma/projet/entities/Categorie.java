package ma.projet.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Categorie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_categorie_id")
    private List<Categorie> subCategorie;
	
	public Categorie() {
		super();
	}
	
	public Categorie(int id, String nom, List<Categorie> subCategorie) {
		super();
		this.id = id;
		this.nom = nom;
		this.subCategorie = subCategorie;
	}

	@Override
	public String toString() {
		return "Categorie [id=" + id + ", nom=" + nom + ", subCategorie=" + subCategorie + "]";
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
	public List<Categorie> getSubCategorie() {
		return subCategorie;
	}
	public void setSubCategorie(List<Categorie> subCategorie) {
		this.subCategorie = subCategorie;
	}
	
}
