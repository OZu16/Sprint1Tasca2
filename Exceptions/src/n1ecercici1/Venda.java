package n1ecercici1;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	private List<Producte> totalProductes;
	private float preuTotal = 0f;
	

	
	public Venda(List<Producte> totalProductes) {
		this.totalProductes = new ArrayList<Producte>();
	}





	public List<Producte> getTotalProductes() {
		return totalProductes;
	}




	public void calcularTotal() throws VendaBuidaException{
		
			
		if(getTotalProductes().size() == 0) {
			throw new VendaBuidaException("per fer una venda primer has de afegir productes");
		}else {
			for(int i = 0; i < getTotalProductes().size(); i++) {
				this.preuTotal += getTotalProductes().get(i).getPreu();
			}
			System.out.println("preu total: " + this.preuTotal);
		}	
	}
}
