import java.util.ArrayList;
public class Principal {

	public static void main(String[] args) {
		ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
		Television tv1 = new Television("BLANCO",'C',360000,19,32,false);
		electrodomesticos.add(tv1);
		Lavadora lavadora1 = new Lavadora("NEGRO",'A',500000,15,60);
		electrodomesticos.add(lavadora1);
		Television tv2 = new Television("ROJO",'E',350000,10,42,true);
		electrodomesticos.add(tv2);
		Lavadora lavadora2 = new Lavadora("GRIS",'B',200000,20,45);
		electrodomesticos.add(lavadora2);
		Lavadora lavadora3 = new Lavadora("ROJO",'E',230000,23,50);
		electrodomesticos.add(lavadora3);
		Television tv3 = new Television("AZUL",'A',500000,5,60,true);
		electrodomesticos.add(tv3);
		Lavadora lavadora4 = new Lavadora("BLANCO",'C',180000,30,30);
		electrodomesticos.add(lavadora4);
		Television tv4 = new Television("BLANCO",'D',250000,21,32,false);
		electrodomesticos.add(tv4);
		Lavadora lavadora5 = new Lavadora("NEGRO",'F',150000,40,70);
		electrodomesticos.add(lavadora5);
		Television tv5 = new Television("BLANCO",'A',600000,15,70,true);
		electrodomesticos.add(tv5);
		int contador_tv 		= 0;
		int contador_lavadora 	= 0;
		ArrayList<Television> televisiones = new ArrayList<Television>();
		ArrayList<Lavadora> lavadoras = new ArrayList<Lavadora>();
		for(int i = 0 ; i<electrodomesticos.size();i++) {
			if(electrodomesticos.get(i) instanceof Television) {
				contador_tv += 1;
			}
			else {
				contador_lavadora += 1;
			}
		}
		System.out.println("SE ENCONTRARON "+contador_tv+" TELEVISIONES Y "+contador_lavadora+" LAVADORAS");
		int suma_electrodomesticos = 0;
		int suma_televisores = 0;
		int suma_lavadoras = 0;
		System.out.println("INFORMACIÓN DE TELEVISIONES");
		int c = 0;
		for(int i = 0 ; i<electrodomesticos.size();i++) {
			if(electrodomesticos.get(i) instanceof Television) {
				System.out.println("PRECIO TELEVISOR "+(c+1)+" : "+electrodomesticos.get(i).precioFinal());
				suma_televisores += electrodomesticos.get(i).precioFinal();
				suma_electrodomesticos += electrodomesticos.get(i).precioFinal();
				c += 1;
			}
		}
		System.out.println("INFORMACIÓN DE LAVADORAS");
		c = 0;
		for(int i = 0 ; i<electrodomesticos.size();i++) {
			if(electrodomesticos.get(i) instanceof Lavadora) {
				System.out.println("PRECIO LAVADORA "+(c+1)+" : "+electrodomesticos.get(i).precioFinal());
				suma_lavadoras += electrodomesticos.get(i).precioFinal();
				suma_electrodomesticos += electrodomesticos.get(i).precioFinal();
				c += 1;
			}
		}
		System.out.println("INFORMACIÓN GENERAL");
		System.out.println("TOTAL ELECTRODOMÉSTICOS : "+suma_electrodomesticos);
		System.out.println("TOTAL TELEVISORES       : "+suma_televisores);
		System.out.println("TOTAL LAVADORAS         : "+suma_lavadoras);
	}

}
