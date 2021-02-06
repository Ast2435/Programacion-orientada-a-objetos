public class Foco {
  

  public void intensidad() { 
    System.out.println("La intensidad es media");
  }
  public void prender() {
    System.out.println("El Foco esta encendido");
  }
  public void apagar() {
    System.out.println("El Foco esta apagado");
  }
  public static void main(String[] args) {
    Foco foco1 = new Foco();
    Foco foco2 = new Foco();
    Foco foco3 = new Foco();
    foco1.intensidad();
    foco2.prender();
    foco3.apagar();
  }
  
}