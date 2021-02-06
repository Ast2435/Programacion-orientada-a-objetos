public class Circulo {
  double radio;
  double getArea() {
    return radio * radio * Math.PI;
  }
  /** Metodo principal */
  public static void main(String[] args) {
    // Crea un circulo con radio 1.0
    Circulo circulo1 = new Circulo();
    circulo1.radio = 1;
    System.out.println("El area del circulo de radio "
	+ circulo1.radio + " es " + circulo1.getArea());
    // Crea un circulo con radio 25
    Circulo circulo2 = new Circulo();
    circulo2.radio = 25;
    System.out.println("El area del circulo de radio "
	+ circulo2.radio + " es " + circulo2.getArea());
    // Crea un circulo de radio 125
    Circulo circulo3 = new Circulo();
    circulo3.radio = 125;
    System.out.println("El area del circulo de radio "
	+ circulo3.radio + " es " + circulo3.getArea());
    // Modifica el radio del circulo
    circulo2.radio = 100;
    System.out.println("El area del circulo de radio "
	+ circulo2.radio + " es " + circulo2.getArea() );
    }
  }
