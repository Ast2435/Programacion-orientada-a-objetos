       class Arbol {
         int altura;
         Arbol() {
           visualizar("Plantando un retoño");
           altura = 0;
         }
         Arbol(int i) {
           visualizar("Creando un nuevo arbol que tiene "
             + i + " metros de alto");
           altura = i;
         }
         /*METODO PARA CREAR DE ARBOL PINO*/
         Arbol(String s, int i) {
            visualizar("Creando un nuevo arbol de tipo PINO que tiene "
             + i + " metros de alto");
            altura = i;
         }
         void info() {
           visualizar("E1 arbol tiene " + altura
             + " metros de alto");
         }
         /*METODO PARA OBTENER LA ALTURA DEL PINO (lo cambié por preferencia personal, no era necesario cambiar para 
         el funcionamiento correcto del programa */ 
         void info(String s) {
           visualizar(s + " : El pino tiene "
             + altura + " metros de alto");
         }
         static void visualizar(String s) {
           System.out.println(s);
         }
       }

      public class ArbolSobrecarga {
        public static void main(String[] args) {

          for(int i = 0; i < 5; i++) {
            Arbol t = new Arbol("pino", i); //Llama al metodo constructor que planta un retoño de PINO
            t.info("pino");
           // t.info("metodo sobrecargado");
          }
          new Arbol();
        }
      }
       
