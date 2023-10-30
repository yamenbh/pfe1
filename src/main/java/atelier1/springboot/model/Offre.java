package atelier1.springboot.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Offre")
public class Offre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = true, name = "nom", length = 30)
	private String entreprise;
	
	@Column(nullable = true, name = "prenom", length = 30)
	private String techno;
	
	@Column(nullable = true, name = "filiere", length = 30)
	private String status;
	
	@ManyToMany(mappedBy = "offres")
    private Set<Etudiant> etudiants;


    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	public String getTechno() {
		return techno;
	}

	public void setTechno(String techno) {
		this.techno = techno;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(Set<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public Offre(int id, String entreprise, String techno, String status, Set<Etudiant> etudiants) {
		super();
		this.id = id;
		this.entreprise = entreprise;
		this.techno = techno;
		this.status = status;
		this.etudiants = etudiants;
	}


	 
}

