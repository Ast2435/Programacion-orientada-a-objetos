/*********************************************************
*                     EJERCICIO 1                        *
*********************************************************/ 

//Programa 1

        //se inicia la clase principal del programa
        class InicializacionDinamica { 
          //se declara la clase main del programa
          public static void main(String args[]) { 
            //se inicializan las variables a y b como double y se les asigna un valor
            double a = 3.0, b = 4.0; 
          
            //se inicializa la variable c como double y se le asigna un valor utilizando una operación aritmética
            double c = Math.sqrt(a * a + b * b); 
            //se imprime a pantalla el valor de C
            System.out.println("La hipotenusa es " + c);
          }
         }
        

//Programa 2

        //se inicia la clase principal del programa
        public class CalculoBono {
          //se declara la clase main del programa
          public static void main(String[] args) {

            int salario; // salario de la persona
            String bonoImpreso; // especifica horas de trabajo
    
            salario = 50000;
            //se le asigna un valor a la variable "bonoImpreso" utilizando una operación artmética, equivalente a calcular el 2% de "salario"
            bonoImpreso = "Bono = $" + (.02 * salario);
            //se imprime el valor de bonoImpreso a pantalla
            System.out.println(bonoImpreso);
          } // fin main
        } // fin clase CalculoBono
        

//Programa 3

        //se inicia la clase principal del programa
        public class ConvertidorTemperatura {
          //se declara la clase main del programa
          public static void main(String[] args) {
            //se declaran dos constantes, se utilizan mayusculas para resaltar que son valores constantes, se utiliza palabra clave de
            // "final" para evitar que estos valores se puedan modificar
            final double PUNTO_CONGELAMIENTO = 32.0;
            //se inicializa la constante FACTOR_CONVERSION utilizando una operación arimética
            final double FACTOR_CONVERSION = 5.0 / 9.0;

            double fahrenheit = 50; // temperatura en Fahrenheit
            double celsius; // temperatura en Celsius

            //se le asigna a la variable celsius el valor de la temperatura haciendo la conversión desde fahrenheit apoyándonos con los
            //valores constantes declarados anteriormente
            celsius = FACTOR_CONVERSION * (fahrenheit - PUNTO_CONGELAMIENTO);
            //se imprime el valor correspondiente a la temperatura en grados fahrenheit y en grados celsius
            System.out.println(fahrenheit + " grados Fahrenheit = " +
            celsius + " grados Celsius.");
          } // fin main
        } // fin clase ConvertidorTemperatura
        



/*********************************************************
*                     EJERCICIO 2                        *
*********************************************************/ 

       public class Raton4 {
         //variables de clase
        //se inicializa una variable privada estática de tipo entero.
         private static int ratonCuenta;
         private static Raton4 ratonJoven; 
         
         private int edad;
  
         public Raton4() {
           Raton4.ratonCuenta++;
           Raton4.ratonJoven = this;
       }
  
       //Metodo de clase
       public static void imprimirRatonCuenta() {
         System.out.println("Total de ratones = " +  Raton4.ratonCuenta);
       }
       public void viejoPorUnDia() {
         this.edad++;
       }

       public static void main(String[] args) {
         Raton4 pinky = new Raton4();
         //se llama al metodo de instancia "viejoPorUnDia" el cual incrementa el contador de edad de un objeto "raton" en específico, en este caso
         //llamado "pinky", en este caso la función va a aumentar la variable "edad"
         pinky.viejoPorUnDia();
         //se llama al metodo de clase"imprimirRatonCuenta" el cual imprime a pantalla el total de ratones creados utilizando esta clase, en 
         //este caso la funcion va a regresar: "Total de ratones = "1"
         Raton4.imprimirRatonCuenta();
       }
     } // fin clase Raton4
       