package dados_vendedor;

public class Ficha {

	public String nomeVendedor(String n) {
		return n;
	}
	
	public double salario(double sf, double tv) {
		double c = tv * 0.15;
		double scc = sf + c;
		return scc;
	}
	
}
