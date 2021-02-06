 
/*********************************************************
*                     EJERCICIO 1                        *
*********************************************************/ 

//PROGRAMA 1
 class Arbol {
          int altura;
          //constructor de clase Arbol que no recibe parametros.
          Arbol() {
            //llama a la clase visualizar para imprimir en pantalla
            visualizar ("Plantando un retoño");
            //inicializa la altura de una instancia de arbol con altura 0
            altura = 0;
          }

          //constructor de clase Arbol que recibe un parametro entero
          Arbol(int i) {
            //imprime en pantalla la cantidad de metros con la cual se inicializará una instancia arbol
            visualizar("Creando un nuevo arbol que tiene "
              + i + " metros de alto");
            //establece la altura del árbol al parametro que nos proporciona el constructor
            altura = i;
          }

          //Imprime a pantalla la altura actual del arbol
          void info() {
            visualizar("E1 arbol tiene " + altura
              + " metros de alto");
          }

          //metodo sobrecargado que recibe un parametro String seguido de la altura del árbol.
          void info(String s) {
            visualizar(s + " : El arbol tiene "
              + altura + " metros de alto");
          }

          //metodo para imprimir a pantalla un parametro String
          static void visualizar(String s) {
            System.out.println(s);
          }
       }

      //clase principal del programa
       public class ArbolDriver {
         public static void main(String[] args) {


           for(int i = 0; i < 5; i++) {
            //crea un arbol con "i" metros de altura
             Arbol t = new Arbol(i);
              //llama al metodo info que no recibe parametros
               t.info();
               //llama al metodo info sobrecargado con un string, esto imprimirá en pantalla
               //" metodo sobrecargado: El arbol tiene i metros de alto"
               t.info("metodo sobrecargado");
           }
           //planta un retoño de altura 0
           new Arbol();
         }
      }



//PROGRAMA 2
public class OrdenSobrecarga {
          //en este caso el orden en el que se pasen los parametros a la lista de parametros influye sobre que metodo se va a llamar

          //crea un metodo de clase o estático, imprime en pantalla una cadena y un entero que recibe en su lsita de parametros
          static void imprimir(String s, int i) {
             System.out.println("Cadena: " + s +
               ", entero: " + i);
          }

          //crea un metodo de clase o estátitco, imprime en pantalla un entero y una cadena que recibe en su lista de parametros, en ese orden.
          static void imprimir(int i, String s) {
            System.out.println("Entero: " + i +
              ", cadena: " + s);
          }

          //metodo principal mail
          public static void main(String[] args) {

            //imprime "Cadena: Primero cadena, entero: 11"
            imprimir("Primero cadena", 11);
            //imprime "Entero: 99, cadena: primero entero"
            imprimir(99, "Primero entero");
          }
        }

//PROGRAMA 3
      public class Hoja1 {
          int i = 0;

          //es un método llamado incrementar que regresa un objeto de tipo "Hoja1", en este caso sobre el cual estamos incrementando 
          //un contador
          Hoja1 incrementar() {
            i++;
            return this;
          }

          //imprime el valor del contador del objeto
          void imprimir() {
            System.out.println("i = " + i);
          }

          public static void main (String[] args) {
            //se crea una instancia tipo Hoja1
            Hoja1 x = new Hoja1();
            //esto imprime a pantalla el valor "i = 3", ya que se llama 3 veces el valor del método incrementar, el cual incrementa
            //la variable i del objeto que la llama, al final imprime el valor de esta variable. 
            x.incrementar().incrementar().incrementar().imprimir();
          }
        }

/*********************************************************
*                     EJERCICIO 2                        *
*********************************************************/ 

//PROGRAMA 4
    public class Flor1 {
          int numeroPetalos = 0;
          String s = new String("null");

          //constructor que inicializa la variable numeroPetalos a un valor entero que recibe en sus parametros
          Flor1(int petalos) {
            numeroPetalos = petalos;
            System.out.println("Constructor w/ parametro entero solo , Numero de petalos " + numeroPetalos);
          }

          //constructor que le asigna lo que reciba en el parametro String ss a la variable de instancia String s.
          Flor1(String ss) {
            System.out.println("Constructor w/ parametro cadera solo, s = " + ss);
            s = ss;
          }

          //constructor que inicializa el string y el entero.
          Flor1(String s, int petalos) {
            this(petalos); //utiliza this para asignar el valor entero, pero solo se puede elegir un parametro.
            //this(s); // ¡No se puede invocar dos constructores!
            this.s = s; // Otro uso de "this"
            System.out.println("cadena y entero Parámetros");
          }

          //constructor que no recibe parametros y asigna la cadena "Hola" y el entero 47, es el que se usa por defecto
          Flor1() {
            this("Hola", 47) ;
            System.out.println("constructor por defecto (sin parametros) " );
          }

          //imprime a pantalla el numero de petalos que contiene el objeto
          void imprimir() {
            //this(11); // ;No hacer dentro de un no-constructor!
            System.out.println("Numero de petalos = " + numeroPetalos + " petalos ");
          }

          public static void main (String[] args) {
            //se crea una instancia X de tipo Flor1, se utiliza el constructor por defecto
            Flor1 x = new Flor1();
            //envia a pantalla "Numero de petalos = 47 petalos "
            x.imprimir();
          }
        }

//PROGRAMA 5
class Pajaro {
          int i;
        }

        public class ConstructorPorDefecto {

          public static void main(String[] args) {
            //se inicializa una instancia de Pajaro llamada nc usando el constructor conocido como vacio, sin parametros o por defecto
            Pajaro nc = new Pajaro(); // ¡por defecto!
            //imprime a pantalla "0"
            System.out.println(nc.i);
          }
        }