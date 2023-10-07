package n1ecercici1;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) throws VendaBuidaException {

		
		Venda venda1 = new Venda();
		/*venda1.getTotalProductes().add(new Producte("a", 9.6f));
		venda1.getTotalProductes().add(new Producte("b", 6.2f));
		venda1.getTotalProductes().add(new Producte("c", 3.1f));*/
		
		
		venda1.calcularTotal();	
		
		System.out.println(venda1.getPreuTotal());
	}



}