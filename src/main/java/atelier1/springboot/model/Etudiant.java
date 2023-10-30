package atelier1.springboot.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Etudiant")
public class Etudiant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = true, name = "nom", length = 30)
	private String nom;
	
	@Column(nullable = true, name = "prenom", length = 30)
	private String prenom;
	
	@Column(nullable = true, name = "filiere", length = 30)
	private String filiere;
	
	@Column(unique = true, nullable = true, name = "groupe", length = 30)
	private String groupe;
	
	@Column(unique = true, nullable = true, name = "tele", length = 80)
	private String tele;
	
	@Column(unique = true, nullable = false, name = "mail", length = 60)
	private String mail;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "etudiant")
    private PFE pfe;
    
	
    @ManyToMany
    @JoinTable(name = "etudiant_offre",
            joinColumns = @JoinColumn(name = "etudiant_id"),
            inverseJoinColumns = @JoinColumn(name = "offre_id"))
    private Set<Offre> offres;
    
    
	
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



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getFiliere() {
		return filiere;
	}



	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}



	public String getGroupe() {
		return groupe;
	}



	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}



	public String getTele() {
		return tele;
	}



	public void setTele(String tele) {
		this.tele = tele;
	}



	public String getMail() {
		return mail;
	}



	public void setMail(String mail) {
		this.mail = mail;
	}



	public PFE getPfe() {
		return pfe;
	}



	public void setPfe(PFE pfe) {
		this.pfe = pfe;
	}



	public Set<Offre> getOffres() {
		return offres;
	}



	public void setOffres(Set<Offre> offres) {
		this.offres = offres;
	}



	public Etudiant(int id, String nom, String prenom, String filiere, String groupe, String tele, String mail, PFE pfe,
			Set<Offre> offres) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.filiere = filiere;
		this.groupe = groupe;
		this.tele = tele;
		this.mail = mail;
		this.pfe = pfe;
		this.offres = offres;
	}



	public Etudiant() {

	}

	 
}

