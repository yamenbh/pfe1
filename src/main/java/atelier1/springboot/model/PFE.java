package atelier1.springboot.model;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "PFE")
public class PFE {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ref;
	
	@Column(nullable = true, name = "nom", length = 30)
	private String entreprise;
	
	@Column(nullable = true, name = "prenom", length = 30)
	private String sujet;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable=true, name="date_debut")
	private Date date_debut;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable=true, name="date_fin")
	private Date date_fin;
	
    @OneToOne
    @JoinColumn(name = "etudiant_id")
    private Etudiant etudiant;
    
    @OneToMany(mappedBy = "pfe")
    private Set<Encadrant> encadrants;
	
	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public String getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public Set<Encadrant> getEncadrants() {
		return encadrants;
	}

	public void setEncadrants(Set<Encadrant> encadrants) {
		this.encadrants = encadrants;
	}

	public PFE(int ref, String entreprise, String sujet, Date date_debut, Date date_fin, Etudiant etudiant,
			Set<Encadrant> encadrants) {
		super();
		this.ref = ref;
		this.entreprise = entreprise;
		this.sujet = sujet;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.etudiant = etudiant;
		this.encadrants = encadrants;
	}

	public PFE(){
		
	}



	 
}

