package n1ecercici1;

public class Producte {
	
	private String nom = "";
	private float preu = 0f;
	
	public Producte(String nom, float preu) {
		super();
		this.nom = nom;
		this.preu = preu;
	}

	public String getNom() {
		return nom;
	}

	public float getPreu() {
		return preu;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPreu(float preu) {
		this.preu = preu;
	}
	
	

}