
public class Lavadora extends Electrodomestico{
	private int carga = 5;

	public Lavadora() {
		
	}
	public Lavadora(int precio, int peso) {
		super(precio,peso);
	}
	public Lavadora(String color, char consumo,int precio, int peso,int carga) {
		super(color,consumo,precio,peso);
		this.carga = carga;
	}
	
	public int getCarga() {
		return this.carga;
	}
	
	public int precioFinal() {
		int aux = 0;
		if(carga>30) {
			aux = 50;
		}
		return super.precioFinal() + aux;
	}
}
