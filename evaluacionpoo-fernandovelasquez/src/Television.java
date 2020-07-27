
public class Television extends Electrodomestico{
	public int pulgadas = 20;
	public boolean sintonizador_tdt = false;

	public Television() {
		
	}
	public Television(int precio, int peso) {
		super(precio,peso);
	}
	public Television(String color, char consumo,int precio, int peso,int pulgadas,boolean sintonizador) {
		super(color,consumo,precio,peso);
		this.pulgadas 			= pulgadas;
		this.sintonizador_tdt 	= sintonizador;
	}
	public int getPulgadas() {
		return pulgadas;
	}
	public boolean isSintonizador_tdt() {
		return sintonizador_tdt;
	}
	
	public int precioFinal() {
		int aux = super.precioFinal();
		if(this.pulgadas>40) {
			aux *= (int)1.3;
		}
		if(isSintonizador_tdt()) {
			aux += 50;
		}
		return aux;
	}
}
