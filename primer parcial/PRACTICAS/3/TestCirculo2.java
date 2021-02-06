class Circulo2 {
         /** El radio del circulo */
         double radio;
         /** El número de objeto creado */
         static int numeroDeObjeto = 0;
           /** Constructor de un circulo con radio 1 */
         Circulo2() {
           radio = 1.0;
           numeroDeObjeto++;
         }
         /** Constructor de un circulo con un radio especifico */
         Circulo2(double radioNuevo) {
           radio = radioNuevo;
           numeroDeObjeto++;
         }
         /** Retorno de numeroDeObjeto */
         static int getNumeroDeObjeto() {
           return numeroDeObjeto;
         }
         /** Retorno del área del ciculo */
         double getArea() {
         return radio * radio * Math.PI;
         }
       }

       public class TestCirculo2 {
         /** Metodo main */
         public static void main(String[] args) {
           System.out.println("Antes de crear el objecto");
           System.out.println("El numero del objeto Circulo es " +
             Circulo2.numeroDeObjeto);

           // Crear c1
           Circulo2 c1 = new Circulo2();

           // Desplegar c1 ANTES DE crear c2
           System.out.println("\nDespues de crear c1");
           System.out.println("c1: radio (" + c1.radio +
               ") y el numero de objeto circulo (" +
                c1.numeroDeObjeto + ")");
           // Crear c2
           Circulo2 c2 = new Circulo2(5);
           // Modificar c1
           c1.radio = 9;
           // Desplegar c1 y c2 DESPUES c2 fue creado
           System.out.println("\nDespues de crear c2 y modificar c1");
           System.out.println("c1: radio (" + c1.radio +
            ") y numero de objeto Circulo (" +
           c1.numeroDeObjeto + ")");
           System.out.println("c2: radio (" + c2.radio +
             ") y numero de objeto Circulo (" +
           c2.numeroDeObjeto + ")");
         }
       }