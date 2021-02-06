 public class ADriver{ 
    //CLASE 1
    private static class A {
      String a;
      public String A() {
        return "Hola";
      }
      public void setPalabra(String b) {
        a = b;
      }
      public String getPalabra() {
        return a;
      }
      public void metodo1() {
        System.out.println("Metodo 1");
      }
      public void metodo2() {
        System.out.println("Metodo 2");
      }
    }
    //CLASE 2
    public static void main(String[] args) {
      A obj = new A();
      obj.metodo1();
      obj.metodo2();
      A obj1 = new A();
      System.out.println(obj1.A());
      A obj2 = new A();
      obj2.setPalabra("Mundo");
      System.out.println(obj2.getPalabra());
    }
}