import java.util.Scanner;
class Raton {
  private int edad = 0; // edad del raton en dias
  private double peso = 1.0; // peso del raton en gramos
  private double porcientoCrecimiento; // incremento en dias
  
  // Este metodo asigna el porciento de crecimiento del raton.
   public void setPorcientoCrecimiento(double porcientoCrecimiento) {
       this.porcientoCrecimiento = porcientoCrecimiento; 
    } // fin del setPorcientoCrecimiento
  
    // Este metodo simula un dia de crecimiento del raton.
    public void crecer() {
       this.peso += (.01 * this.porcientoCrecimiento * this.peso); 
       this.edad++;
    } // fin crecer
  
    // Este metodo imprime la edad del raton y su peso.
    public void desplegar() {
      System.out.printf("Edad = %d, peso = %.3f\n",
       this.edad, this.peso);
    } // fin desplegar
 } // fin clase Raton


public class RatonD {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    double relacionCrecimiento;
    Raton gus = new Raton();
    Raton jaq = new Raton();

    System.out.print("Escribir el % de relacion de crecimiento: ");
    relacionCrecimiento = stdIn.nextDouble();
    gus.setPorcientoCrecimiento(relacionCrecimiento);
    jaq.setPorcientoCrecimiento(relacionCrecimiento);
    gus.crecer();
    jaq.crecer();
    gus.crecer();
    gus.desplegar();
    jaq.desplegar();
  } // fin de main
} // fin clase MouseDriver
