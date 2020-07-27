
public class Electrodomestico {
	protected int 		precio_base 		= 100000;
	protected String 	color 				= "BLANCO";
	protected char 	consumo_energetico 		= 'F';
	protected int 		peso				= 5;

	public Electrodomestico() {
		
	}
	public Electrodomestico(int precio, int peso) {
		this.precio_base 	= precio;
		this.peso 			= peso;
	}
	public Electrodomestico(String color, char consumo,int precio, int peso) {
		this.color 			= color;
		this.consumo_energetico = consumo;
		this.precio_base 	= precio;
		this.peso 			= peso;
	}
	public int getPrecio_base() {
		return precio_base;
	}
	public String getColor() {
		return color;
	}
	public char getConsumo_energetico() {
		return consumo_energetico;
	}
	public int getPeso() {
		return peso;
	}
	
	public boolean comprobarConsumoEnergetico(char letra) {
		if(this.consumo_energetico == letra) {
			return true;
		}
		return false;
	}
	
	public boolean comprobarColor(String color) {
		if(this.color.equals(color)) {
			return true;
		}
		return false;
	}
	
	public int precioFinal() {
		int precio = 0;
		if(this.consumo_energetico == 'A') {
			precio = 100;
		}
		else if(this.consumo_energetico == 'B') {
			precio = 80;
		}
		else if(this.consumo_energetico == 'C') {
			precio = 60;
		}
		else if(this.consumo_energetico == 'D') {
			precio = 50;
		}
		else if(this.consumo_energetico == 'E') {
			precio = 30;
		}
		else if(this.consumo_energetico == 'F') {
			precio = 10;
		}

		if(this.peso<19) {
			precio += 10;
		}
		else if(this.peso<49) {
			precio += 50;
		}
		else if(this.peso<79) {
			precio += 80;
		}
		else {
			precio += 100;
		}
		return precio;
	}
}
