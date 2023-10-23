package n1ecercici1;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {

		
		Venda venda1 = new Venda(null);
		Venda venda2 = new Venda(null);
		
		venda1.getTotalProductes().add(new Producte("a", 9.6f));
		venda1.getTotalProductes().add(new Producte("b", 6.2f));
		venda1.getTotalProductes().add(new Producte("c", 3.1f));
		
		try {
			venda1.calcularTotal();	
			venda2.calcularTotal();
		}catch(VendaBuidaException e) {
			e.printStackTrace();
		}
		
		try {
			venda1.getTotalProductes().get(-1);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	}

}