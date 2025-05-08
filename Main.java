
public class Main {

	public static void main(String[] args) {

		Triangulo t1 = new Triangulo("Bermudas", 20, 10, 15);
		Triangulo t = new Triangulo("Triángulo T", 200, 100, 150);
		Cuadrado c1 = new Cuadrado ("Cuadrado1", 4);
		Rectangulo r1 = new Rectangulo("Rectangulo1", 40, 50);
		Rombo rom1 = new Rombo("Rombo1", 34, 40, 30);
		Romboide romb1 = new Romboide("Romboide", 50, 70);
		Trapecio tra1 = new Trapecio("Trapecio", 20, 40, 60, 30);

		Main.imprimirCalculos(t1);
		Main.imprimirCalculos(t);
		Main.imprimirCalculos(c1);
		Main.imprimirCalculos(r1);
		Main.imprimirCalculos(rom1);
		Main.imprimirCalculos(romb1);
		Main.imprimirCalculos(tra1);

	}// main

	
	//crear todas las clases de las figuras
	// hacer una interface y que se pase una FiguraGeometrica
	//implementar la interface en todas las  figuras
	public static void imprimirCalculos(FiguraGeometrica f) {

	
		System.out.println("+---------------------------------+");
		System.out.println("| El área de [" + f.getNombre() 
		      + "]");
		System.out.println("| es " + f.calcularArea());

		System.out.println("| El perimetro de [" + f.getNombre() 
		      + "]");

		System.out.println("| es " + f.calcularPerimetro());
		System.out.println("+---------------------------------+");

	}// imprimirCalculos

}// class Main
