class Circulo {
    double radio = 1.0;
    Circulo() {
    }
    Circulo(double radioNuevo) {
      radio = radioNuevo;
    }
    double getArea() {
      return radio * radio * Math.PI;
    }

    public static void main(String args[]){
      //inicializa un objeto con el constructor por defecto, en este caso un círculo unitario
      Circulo circulo1 = new Circulo();
      //inicializa un objeto con un radio específico de 4
      Circulo circulo2 = new Circulo(4.0);

      double area1 = circulo1.getArea();
      double area2 = circulo2.getArea();
      System.out.println("El area del circulo 1 es: " + area1);
      System.out.println("El area del circulo 2 es: " + area2);
    }
  }

