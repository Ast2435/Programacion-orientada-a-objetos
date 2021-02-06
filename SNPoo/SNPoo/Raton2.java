import java.util.Scanner;

public class Raton2 {
  private int edad = 0; // edad en dias
  private double peso = 1.0; // peso en gramos
  private double porcientoRelacionCrecimiento; // % aumento de peso

  public void setPorcientoRelacionCrecimiento(double porcientoRelacionCrecimiento) {
    this.porcientoRelacionCrecimiento = porcientoRelacionCrecimiento;
  } // fin setPorcientoRelacionCrecimiento


  public int getEdad() {
    return this.edad;
  } // fin getEdad

  public double getPeso() {
    return this.peso;
  } // fin getPeso

  public void crecer(int dias) {
    for (int i=0; i<dias; i++) {
      this.peso +=
        (0.01 * this.porcientoRelacionCrecimiento * this.peso);
  }
  this.edad += dias;
  } // fin crecer
} // fin clase Raton2
