class CirculoC {
  private static double radio;
  //static double r = 0;
  public CirculoC(double radio) {
    this.radio = radio;
  }
  public CirculoC() {
    this(1.0);
  }
  public double getArea() {
    return this.radio * this.radio * Math.PI;
  }
  static void setRadio(double radio) {
    CirculoC.radio = radio;
  }
}
class DemoCirculoC {
  public static void main(String[] args) {
    CirculoC c1 = new CirculoC();
    System.out.println("EL area del cirulo es " + c1.getArea());

    CirculoC c2 = new CirculoC(2.0);
    System.out.println("EL area del cirulo es " + c2.getArea());

    c2.setRadio(3.0);
    System.out.println("EL area del cirulo es " + c2.getArea());

     c2.setRadio(4.0);
    System.out.println("EL area del cirulo es " + c2.getArea());

    CirculoC c3 = new CirculoC();
    System.out.println("EL area del cirulo es " + c3.getArea());
  }
}
