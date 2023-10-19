package n1e1;
import java.util.ArrayList;

public class Venda {
	
	private ArrayList<Producte> productes;
	private int ventaTotal;
	
	public Venda () {
		this.productes = new ArrayList<Producte>();
		ventaTotal = 0;
	}
	
	//methods
	public void newProducte(Producte newProducte) {
		productes.add(newProducte);
	}
	
	public void calcularTotal() throws VendaBuidaException {
			if (productes.size() >= 1) {
			for(int i = 0; i < productes.size(); i ++) {
				ventaTotal += (productes.get(i).getPrice());
			}
			System.out.println("La venda total ara es " + ventaTotal);
		} else {
			throw new VendaBuidaException("Has d'afegir productes");
		}
	}
	
	public int getTotal() {
		return ventaTotal;
	}

}
