package n1e1;

public class App {

	public static void main(String[] args) {
		Venda venda1 = new Venda();
		try {
			venda1.calcularTotal();
		} catch (VendaBuidaException e) {
			System.out.println(e.getMessage());
		} //donara el missatge d'error
		
		Producte producte1 = new Producte("Producte 1", 20);
		Producte producte2 = new Producte("Producte 2", 30);
		venda1.newProducte(producte1);
		venda1.newProducte(producte2);
		
		try {
			venda1.calcularTotal();
		} catch (VendaBuidaException e) {
			System.out.println(e.getMessage());
		} //no donara el missatge d'error y executara el codi normalment
	}

}
