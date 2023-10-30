package atelier1.springboot.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Encadrant")
public class Encadrant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = true, name = "nom", length = 30)
	private String nom;
	
	@Column(nullable = true, name = "prenom", length = 30)
	private String prenom;
	
	@Column(nullable = true, name = "specialite", length = 30)
	private String specialite;

	@Column(nullable = true, name = "type", length = 30)
	private String type;
	
	@Column(nullable = true, name = "tele", length = 30)
	private String tele;

    @ManyToOne
    private PFE pfe;
    

    
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

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTele() {
		return tele;
	}

	public void setTele(String tele) {
		this.tele = tele;
	}

	public PFE getPfe() {
		return pfe;
	}

	public void setPfe(PFE pfe) {
		this.pfe = pfe;
	}



	public Encadrant(int id, String nom, String prenom, String specialite, String type, String tele, PFE pfe) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.specialite = specialite;
		this.type = type;
		this.tele = tele;
		this.pfe = pfe;
	}


	 
}

