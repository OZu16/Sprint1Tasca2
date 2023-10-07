package n1ecercici1;

import java.util.ArrayList;

public class Venda {

	private ArrayList<Producte> totalProductes = new ArrayList<Producte>();
	private float preuTotal = 0f;
	

	
	/*public Venda(ArrayList<Producte> totalProductes, float preuTotal) {
		super();
		this.totalProductes = totalProductes;
		this.preuTotal = preuTotal;
	}*/



	public ArrayList<Producte> getTotalProductes() {
		return totalProductes;
	}



	public float getPreuTotal() {
		return preuTotal;
	}

	


	public void setTotalProductes(ArrayList<Producte> totalProductes) {
		this.totalProductes = totalProductes;
	}



	public void setPreuTotal(float preuTotal) {
		this.preuTotal = preuTotal;
	}



	public void calcularTotal() throws VendaBuidaException{
		
		if(getTotalProductes().size() < 1) {
			throw new VendaBuidaException("per fer una venda primer has de afegir productes");
		}else {
			for(int i = 0; i < getTotalProductes().size(); i++) {
				this.preuTotal += getTotalProductes().get(i).getPreu();
			}
			setPreuTotal(this.preuTotal);
		}
	}
}