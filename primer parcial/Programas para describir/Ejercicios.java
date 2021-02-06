//PROGRAMA 1
        class Jarra {

          //Crea un constructor que recibe un entero y lo imprime en pantalla para identificar una jarra
          Jarra (int marcador) {
            System.out.println("Jarra( " + marcador + ") ");
          }

          //Crea un metodo f que recibe un marcador y lo imprime en pantalla
          void f(int marcador) {
            System.out.println("f( " + marcador + ") ");
          }
        }
        //clase principal
        public class Jarras {
          //crea dos variables de tipo Jarra
          Jarra j1;
          Jarra j2;

          {
          	//inicializa dos instancias j1 y j2 de tipo Jarra, esto imprime en pantalla
          	//"Jarra(1) "
          	//"Jarra(2) "
            j1 = new Jarra(1) ;
            j2 = new Jarra (2) ;
            System.out.println("j1 y j2 inicializadas");
          }

          //constructor por defecto que imprime "Jarras()"
          Jarras() {
            System.out.println ("Jarras() ") ;
          }

          public static void main(String[] args) {
            System.out.println("Dentro de main()");
            //Crea un objeto X de clase Jarras usando el constructor por defecto
            Jarras x = new Jarras();
            /*
			Esto imprime a pantalla lo siguiente:
			Jarra(1)
			Jarra2()
			j1 y j2 inicializadas
			Jarras()
            */
          }
        }



//PROGRAMA 2
 public class SobrecargaPrimitiva {
          // los booleanos no pueden convertirse automáticamente
          //imprime un string recibido, método de clase
          static void visualizar(String s) {
            System.out.println(s);
          }
          //metodos sobrecargados, reciben un parametro de tipo diferente e imprimen en pantalla el tipo de dato recibido
          void f1(char x) {visualizar("f1(char) " ); }
          void f1(byte x) {visualizar("f1(byte) " ); }
          void f1(short x) {visualizar("f1(short) " ); }
          void f1(int x) {visualizar("f1(int) " ); }
          void f1(long x) {visualizar("f1(long) " ); }
          void f1(float x) { visualizar("f1(float) " ); }
          void f1(double x) { visualizar("f1(double) " ); }
          //metodos sobrecargados, reciben un parametro de tipo diferente e imprimen en pantalla el tipo de dato recibido
          void f2(byte x) { visualizar("f2(byte) " ); }
          void f2(short x) { visualizar("f2(short) " ); }
          void f2(int x) { visualizar("f2(int) " ); }
          void f2(long x) { visualizar("f2(long) " ); }
          void f2(float x) { visualizar("f2(float) " ); }
          void f2(double x) { visualizar("f2(double) " ); }
          //metodos sobrecargados, reciben un parametro de tipo diferente e imprimen en pantalla el tipo de dato recibido
          void f3(short x) {visualizar("f3(short) " ); }
          void f3(int x) {visualizar("f3(int) " ); }
          void f3(long x) {visualizar("f3(long) " ); }
          void f3(float x) {visualizar("f3(float) " ); }
          void f3(double x) {visualizar("f3(double) " ); }
          //metodos sobrecargados, reciben un parametro de tipo diferente e imprimen en pantalla el tipo de dato recibido
          void f4(int x) {visualizar("f4(int) " ); }
          void f4(long x) {visualizar("f4(long) " ); }
          void f4(float x) {visualizar("f4(float) " ); }
          void f4(double x) {visualizar("f4(double) " ); }
          //metodos sobrecargados, reciben un parametro de tipo diferente e imprimen en pantalla el tipo de dato recibido
          void f5(long x) {visualizar("f5(long) " ); }
          void f5(float x) {visualizar("f5(float) " ); }
          void f5(double x) {visualizar("f5(double) " ); }
          //metodos sobrecargados, reciben un parametro de tipo diferente e imprimen en pantalla el tipo de dato recibido
          void f6(float x) {visualizar("f6(float) " ); }
          void f6(double x) {visualizar("f6(double) " ); }
          //metodos sobrecargados, reciben un parametro de tipo diferente e imprimen en pantalla el tipo de dato recibido
          void f7(double x) {visualizar("f7(double) " ); }

          void pruebaValoresConstante() {
          	//imprimirá f1(int), f2(int), f3(int), f4(int)
            visualizar("Probando con el 5");
            f1(5);f2(5);f3(5);f4(5);f5(5);f7(5);
          }

          //imprime "parametro char: x", f1(char)
          void pruebaChar() {
            char x = 'x';
            visualizar("parametro char: " );
            f1(x);f2(x);f3(x);f4(x);f5(x);f7(x);
          }

          //imrpime "parametro byte: 0", f1(byte), f2(byte)
          void pruebaByte() {
            byte x = 0;
            visualizar ("parametro byte : ");
            f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
          }

          void pruebaShort() {
            short x = 0;
            visualizar("parametro short:");
            f1(x);f2(x);f3(x);f4(x);f5(x);f7(x);
          }

          void pruebaInt() {
            int x = 0;
            visualizar("parametro int: ");
            f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
          }

          void pruebaLong ( ) {
            long x = 0;
            visualizar("parametro long: " );
            f1(x);f2(x);f3(x);f4(x);f5(x);f7(x);
          }

          void pruebaFloat() {
            float x = 0;
            visualizar("parametro float:");
            f1(x);f2(x);f3(x);f4(x);f5(x);f7(x);
          }

          void pruebaDouble( ) {
            double x = 0;
            visualizar("parametro double:");
            f1(x);f2(x);f3(x);f4(x);f5(x);f7(x);
          }
          public static void main (String[] args) {
            SobrecargaPrimitiva p =
            new SobrecargaPrimitiva();
  
            p.pruebaValoresConstante();
            p.pruebaChar();
            p.pruebaByte();
            p.pruebaShort();
            p.pruebaInt();
            p.pruebaLong();
            p.pruebaFloat();
            p.pruebaDouble();
            /*
            TODO ESTO IMPRIME:
            Probando con el 5
            f1(int) 
            f2(int) 
            f3(int) 
            f4(int) 
            f5(long) 
            f7(double) 
            parametro char: 
            f1(char) 
            f2(int) 
            f3(int) 
            f4(int) 
            f5(long) 
            f7(double) 
            parametro byte : 
            f1(byte) 
            f2(byte) 
            f3(short) 
            f4(int) 
            f5(long) 
            f6(float) 
            f7(double) 
            parametro short:
            f1(short) 
            f2(short) 
            f3(short) 
            f4(int) 
            f5(long) 
            f7(double) 
            parametro int: 
            f1(int) 
            f2(int) 
            f3(int) 
            f4(int) 
            f5(long) 
            f6(float) 
            f7(double) 
            parametro long: 
            f1(long) 
            f2(long) 
            f3(long) 
            f4(long) 
            f5(long) 
            f7(double) 
            parametro float:
            f1(float) 
            f2(float) 
            f3(float) 
            f4(float) 
            f5(float) 
            f7(double) 
            parametro double:
            f1(double) 
            f2(double) 
            f3(double) 
            f4(double) 
            f5(double) 
            f7(double) 
            */
          }
        }
        


//PROGAMA 3

        public class Degradacion {
          static void visualizar(String s) {
            System.out.println(s);
          }
  
          void f1(char x) {visualizar("f1(char) " ); }
          void f1(byte x) {visualizar("f1(byte) " ); }
          void f1(short x) {visualizar("f1(short) " ); }
          void f1(int X) {visualizar("f1(int) " ); }
          void f1(long x) {visualizar("f1(long) " ); }
          void f1(float x) { visualizar("f1(float) " ); }
          void f1(double x) { visualizar("f1(double) " ); }

          void f2(byte x) { visualizar("f2(byte) " ); }
          void f2(short x) { visualizar("f2(short) " ); }
          void f2(int x) { visualizar("f2(int) " ); }
          void f2(long x) { visualizar("f2(long) " ); }
          void f2(float x) { visualizar("f2(float) " ); }
          void f2(double x) { visualizar("f2(double) " ); }

          void f3(short x) {visualizar("f3(short) " ); }
          void f3(int x) {visualizar("f3(int) " ); }
          void f3(long x) {visualizar("f3(long) " ); }
          void f3(float x) {visualizar("f3(float) " ); }
          void f3(double x) {visualizar("f3(double) " ); }

          void f4(int x) {visualizar("f4(int) " ); }
          void f4(long x) {visualizar("f4(long) " ); }
          void f4(float x) {visualizar("f4(float) " ); }
          void f4(double x) {visualizar("f4(double) " ); }

          void f5(long x) {visualizar("f5(long) " ); }
          void f5(float x) {visualizar("f5(float) " ); }
          void f5(double x) {visualizar("f5(double) " ); }

          void f6(float x) {visualizar("f6(float) " ); }
          void f6(double x) {visualizar("f6(double) " ); }

          void f7(double x) {visualizar("f7(double) " ); }

          void pruebaDouble() {
            double x = 0;
            visualizar("parametro double : " );
            f1(x);f2((float)x);f3((long)x);f4((int)x);
            f5((short)x);f6((byte)x);f7((char)x);
          }
          public static void main(String[] args) {
            Degradacion p = new Degradacion();
            p.pruebaDouble();

            //IMPRIME:
            /*
			parametro double : 
			f1(double) 
			f2(float) 
			f3(long) 
			f4(int) 
			f5(long) 
			f6(float) 
			f7(double) 
            */
          }
        }



//PROGRAMA 4

        public class Tiempo {
          //declaración de variable privada la cual no puede ser accesada por otras clases
          private int horas, minutos, segundos;
          //constructor que recibe 3 parametros de tipo entero que denotan una hora específica.
          public Tiempo(int h, int m, int s) {
            horas = h;
            minutos = m;
            segundos = s;
          }
         //imprime a pantalla el valor de la hora, utilizando solo los primeros dos digitos del valor entero ingresado.
          public void imprimirTiempo() {
            System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
          } // fin de imprimirTiempo

          public static void main(String[] args) {
          	//se crea una instancia de Tiempo llamada tiempo con 3 parametros.
            Tiempo tiempo = new Tiempo(3, 59, 0);
            //imprime a pantalla "03:59:00"
            tiempo.imprimirTiempo();
          } // fin de main
        } // fin de la clase tiempo



//PROGRAMA 5
public class PruebaMetodoSobrecargado {
         /** Metodo principal */
         public static void main(String[] args) {
           // Invoca el metodo max con paramatros int
           System.out.println("El maximo entre 3 y 4 es " + max(3,4));
           // Invoca el metodo max con paramatros double
           System.out.println("El maximo entre 3.0 y 5.4 es " + max(3.0, 5.4));
           // Invoca el metodo max con tres paramatros double
           System.out.println("El maximo entre 3.0, 5.4, y 10.14 es " + max(3.0, 5.4, 10.14));
         }
         /** Regresa el max entre dos valores int */
         public static int max(int num1, int num2) {
           if (num1 > num2)
             return num1;
           else
             return num2;
         }
         /** Encuentra el max entre dos valores double */
         public static double max(double num1, double num2) {
           if (num1 > num2)
             return num1;
         else
           return num2;
         }
         /** Regresa la cantidad max de tres valores double */
         public static double max(double num1, double num2, double num3) {
           return max(max(num1, num2), num3);
         }
       }



//PROGRAMA 6
       public class SobrecargaAmbigua {
       			//metodo principal
              public static void main(String[] args) {
                System.out.println(max(1, 2));
            }
            //metodo de tipo double  que encuentra el valor maximo entre un entero y un doble en ese orden
            public static double max(int num1, double num2) {
              if (num1 > num2)
                return num1;
              else
                return num2;
            }
            //encuentra el valor maximo entre un double y un entero en ese orden
            public static double max(double num1, int num2) {
              if (num1 > num2)
                return num1;
              else
                return num2;
            }
          }
             


//PROGRAMA 7
class CaracterAleatorio {
       /** Genera un caracter aleatorio entre ch1 y ch2 */
         public static char getCaracterAleatorio(char ch1, char ch2) {
           return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
         }
         /** Genera una letra minuscula aleatoria */
         public static char getMinusculaAleatorio() {
           return getCaracterAleatorio( 'a' , 'z' );
         }
         /** Genera una letra mayuscula aleatoria */
         public static char getMayusculaAleatorio() {
           return getCaracterAleatorio( 'A' , 'Z' );
         }
         /** Genera un digito caracter */
         public static char getCaracterDigitoAleatorio() {
           return getCaracterAleatorio( '0' , '9' );
         }
         /** Genera un caracter aleatorio */
         public static char getCaracterAleatorio() {
           return getCaracterAleatorio( '\u0000' , '\uFFFF' );
         }
       }
       public class CaracterAleatorioDriver {
         /** Metodo principal */
         public static void main(String[] args) {
         //declaracion de constantes tipo entero
         final int NUM_DE_CARACTERES = 175;
         final int CARACTERES_POR_LINEA = 25;
         // Imprime el caracter aleatorio entre 'a' y 'z', 25 chars por linea
         for (int i = 0; i < NUM_DE_CARACTERES; i++) {
           //char ch = CaracterAleatorio.getMinusculaAleatorio();
           char ch = CaracterAleatorio.getMayusculaAleatorio();
           if ((i + 1) % CARACTERES_POR_LINEA == 0)
             System.out.println(ch);
           else
             System.out.print(ch);
          }
        }
      }



//PROGRAMA 8
//clase etiqueta
class Etiqueta {
		 //constructor de clase etiqueta que recibe un entero como parametro
         Etiqueta(int marcador) {
           System.out.println("Etiqueta() " + marcador + " ");
         }
       }
       //clase tarjeta
       class Tarjeta {
       	//se inicializa un objeto tl de tipo etiqueta con marcador en 1
        Etiqueta tl = new Etiqueta(1); // Antes del constructor

        //constructor de la clase tarjeta que no recibe ningun parametro
         Tarjeta() {
         // Indicar que estamos en el constructor:
           System.out.println("Tarjeta() ");
           t3 = new Etiqueta(33); // Reiniciar t3
         }
         Etiqueta t2 = new Etiqueta(2); // Después del constructor
         void f() {
           System.out.println("f() ");
         }
         Etiqueta t3 = new Etiqueta(3); // Al final
       }
       public class OrdenDeInicializacion1 {
        //metodo principal
         public static void main (String[] args) {
           Tarjeta t = new Tarjeta();
           t.f(); // Muestra que se ha acabado la construcción
         }
       }