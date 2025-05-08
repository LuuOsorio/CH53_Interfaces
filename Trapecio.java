
public class Trapecio implements FiguraGeometrica  {

	private String nombre;
	private double lado;
	private double altura;
	private double baseMayor;
	private double baseMenor;

	public Trapecio(String nombre, double lado, double altura, double baseMayor, double baseMenor) {
		super();
		this.nombre = nombre;
		this.lado = lado;
		this.altura = altura;
		this.baseMayor = baseMayor;
		this.baseMenor = baseMenor;

	}// constructorTrapecio
	
	
	
	public double calcularArea() {
		return  ((getAltura()) * (getBaseMayor()+getBaseMenor()))/2;
	}// calcularArea
	
	public double calcularPerimetro() {
		return getBaseMayor() + getBaseMenor() + 2 * getLado();
	}//calcularPerimetro
	

	public String getNombre() {
		return nombre;
	}// getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}// setNombre

	public double getLado() {
		return lado;
	}// getLado

	public void setLado(double lado) {
		this.lado = lado;
	}// setLado

	public double getAltura() {
		return altura;
	}// getAltura

	public void setAltura(double altura) {
		this.altura = altura;
	}// setAtura

	public double getBaseMayor() {
		return baseMayor;
	}// getBaseMayor

	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}// setBaseMayor

	public double getBaseMenor() {
		return baseMenor;
	}// getBaseMenor

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}// setBaseMenor

	@Override
	public String toString() {
		return "Trapecio [nombre=" + nombre + ", lado=" + lado + ", altura=" + altura + ", baseMayor=" + baseMayor
				+ ", baseMenor=" + baseMenor + "]";
	}// toString

}// class Trapecio
