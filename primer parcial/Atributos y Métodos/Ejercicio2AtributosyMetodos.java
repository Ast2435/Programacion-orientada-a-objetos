//Ejercicio 1

public class Ejercicio2AtributosyMetodos{ 

	public static class Estudiante{
	private String nombre;
	private int boleta = 2017630081;
	private double promedio;

		public void estudiar(){
			System.out.println(nombre + " esta estudiando");
		}

		public void imprimirBoleta(){
			System.out.println("La boleta de " + nombre + " es: " + boleta);
		}

		public void setNombre(String nombre){
			this.nombre = nombre;
		}
	}

	public class Instructor{
	private String nombre;
	private int numeroEmpleado;
	}

	public class MiembroPersonal{
	private String nombre;
	private String ocupacion;
	}

	public class Curso{
	private String nombre;
	private int numeroCreditos;
	}

	public void main(String[] args){

		//Creacion e instanciación de las variables de las clases creadas.
		Estudiante arturo = new Estudiante();
		Instructor jose = new Instructor();
		MiembroPersonal maria = new MiembroPersonal();
		Curso algebraLineal = new Curso();

		arturo.setNombre("Arturo");
		arturo.estudiar();
		arturo.imprimirBoleta();
	}
}