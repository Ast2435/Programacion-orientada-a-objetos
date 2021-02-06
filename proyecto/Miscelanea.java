import java.util.*;

public class Miscelanea{
    public static class Producto{

        //Atributos//
        private String nombre;
        private int codigo;
        private double precio;
        private String seccion;

        //Constructor que le asigna un valor a seccion.
        Producto(String nombre, int codigo, double precio, String seccion) {
            this.nombre = nombre;
            this.codigo = codigo;
            this.precio = precio;
            this.seccion = seccion;
        }
        Producto(String seccion) {
            this.seccion = seccion;
        }

        //Metodo get que regresa el nombre como String
        public String getNombre() {
            return this.nombre;
        }
        //Metodo get que regresa el codigo como Int
        public int getCodigo() {
            return this.codigo;
        }
        //Metodo get que regresa el precio como Double
        public double getPrecio() {
            return this.precio;
        }
        //Metodo get que regresa el precio como Double
        public String getSeccion() {
            return this.seccion;
        }
        //Metodo set que le asigna un valor al atributo nombre
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        //Metodo set que le asigna un valor al atributo codigo
        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }
        //Metodo set que le asigna un valor al atributo precio
        public void setPrecio(double precio) {
            this.precio = precio;
        }
    }

    //Metodo principal Main
    public static void main(String[] args) {
        //Lista de productos
        LinkedList<Producto> productoll = new LinkedList<Producto>();
        Producto p1 = new Producto(" Leche lala", 123456, 10.50, "Lacteos");
        Producto p2 = new Producto(" Crema Alpura", 6465465, 15.20, "Lacteos");
        Producto p3 = new Producto(" Queso Juan", 56448641, 259.50, "Lacteos");
        Producto p4 = new Producto(" Papas fritas", 8946159, 12.39, "Dulces");
        Producto p5 = new Producto(" Mazapan", 8947159, 6, "Dulces");
        Producto p6 = new Producto(" Chocolate", 8986159, 22.31, "Dulces");
        Producto p7 = new Producto(" Vino", 8923159, 12.39, "Vinos y Bebidas");
        Producto p8 = new Producto(" Jugo de uva", 6746159, 17.39, "Vinos y Bebidas");
        Producto p9 = new Producto(" Cerveza", 246159, 38.49, "Vinos y Bebidas");

        productoll.add(p1);
        productoll.add(p2);
        productoll.add(p3);
        productoll.add(p4);
        productoll.add(p5);
        productoll.add(p6);
        productoll.add(p7);
        productoll.add(p8);
        productoll.add(p9);

        //imprime todos los productos
        for(Producto p : productoll){
            System.out.println(" Producto:" + p.getNombre()+ " - codigo de barras " + p.getCodigo() + " - precio: " + p.getPrecio() + " pesos ");
        }

        //Separa todos los productos por seccion
        LinkedList<String> Dulces = new LinkedList<String>();
        LinkedList<String> Lacteos = new LinkedList<String>();
        LinkedList<String> VinosBebidas = new LinkedList<String>();
        LinkedList<String> sinSeccion = new LinkedList<String>();
        for(Producto p : productoll){
            if(p.seccion == "Dulces"){
                Dulces.add(p.nombre);
            }
            else if(p.seccion == "Lacteos"){
                Lacteos.add(p.nombre);
            }
            else if(p.seccion == "Vinos y Bebidas"){
                VinosBebidas.add(p.nombre);
            }
            else{
                sinSeccion.add(p.nombre);
            }
        }

        //imprime los productos separados por seccion
        System.out.println("\nLos productos de la seccion de DULCES son:");
        for(int i=0; i<Dulces.size(); i++)
        {
            System.out.println(Dulces.get(i));
        }
        System.out.println("Los productos de la seccion de LACTEOS son:");
        for(int i=0; i<Lacteos.size(); i++)
        {
            System.out.println(Lacteos.get(i));
        }
        System.out.println("Los productos de la seccion de VINOS Y BEBIDAS son:");
        for(int i=0; i<VinosBebidas.size(); i++)
        {
            System.out.println(VinosBebidas.get(i));
        }
        System.out.println("Los siguientes productos no tienen seccion:");
        for(int i=0; i<sinSeccion.size(); i++)
        {
            System.out.println(sinSeccion.get(i));
        }

    }
}