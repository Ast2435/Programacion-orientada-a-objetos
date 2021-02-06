 public class Persona {
         String nombre;
         int edad;
         String direccion;
         public void setNombre(String b) {
           nombre = b;
         }
         public void setEdad(int b) {
           edad = b;
         }
         public String getNombre() {
           return nombre;
         }
         public int getEdad() {
           return edad;
         }
         public void setDireccion(String b) {
          direccion = b;
         }
         public String getDireccion() {
          return direccion;
         }
         public static void main(String[] args) {
           Persona per = new Persona();
           per.setNombre("Juan "); //lo cambié de "setPersona" a "setNombre" para que compilara sin problemas
           per.setEdad(25);
           per.setDireccion("Av. Juan de Dios Batiz 2000");
           System.out.println(per.getNombre() + "tiene " + per.getEdad() + " años y vive en: " + per.getDireccion());
         }
       }
       
