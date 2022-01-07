package calculadoraNotas;

public class App {

	
	public static void main(String[] args) {
		//PROGRAMACION
		double[] notasExamenesProgramacion = {5, 9, 7, 8, 10};
		double[] notasPracticasProgramacion = {5, 10, 9, 10, 8, 9, 7, 8, 9};
		
		Asignatura programacion = new Asignatura("Programacion", notasExamenesProgramacion, notasPracticasProgramacion, 0.70, 0.20, 0.10);
		
		System.out.println(programacion.toString());
		
		//LENGUAJES DE MARCAS
		
		double[] notasExamenesLenguajes = {5, 9, 7, 8, 10};
		double[] notasPracticasLenguajes = {5, 10, 9, 10, 8, 9, 7, 8, 9};
		
		Asignatura lenguajes = new Asignatura("Lenguajes de marcas", notasExamenesLenguajes, notasPracticasLenguajes, 0.70, 0.20, 0.10);
		
		System.out.println(lenguajes.toString());
		
		//SISTEMAS INFORMATICOS
		
		double[] notasExamenesSistemas = {5, 9, 7, 8, 10};
		double[] notasPracticasSistemas = {5, 10, 9, 10, 8, 9, 7, 8, 9};
		
		Asignatura sistemas = new Asignatura("Sistemas informaticos", notasExamenesSistemas, notasPracticasSistemas, 0.70, 0.20, 0.10);
		
		System.out.println(sistemas.toString());
		
		//INGLES
		
		double[] notasExamenesIngles = {5, 9, 7, 8, 10};
		double[] notasPracticasIngles = {5, 10, 9, 10, 8, 9, 7, 8, 9};
		
		Asignatura ingles = new Asignatura("Ingles", notasExamenesIngles, notasPracticasIngles, 0.70, 0.20, 0.10);
		
		System.out.println(ingles.toString());
		
		//BASES DE DATOS
		
		double[] notasExamenesBases = {5, 9, 7, 8, 10};
		double[] notasPracticasBases = {5, 10, 9, 10, 8, 9, 7, 8, 9};
		
		Asignatura bases = new Asignatura("Bases de datos", notasExamenesBases, notasPracticasBases, 0.70, 0.20, 0.10);
		
		System.out.println(bases.toString());
		
		//ENTORNOS DE DESARROLLO
		
		double[] notasExamenesEntornos = {5, 9, 7, 8, 10};
		double[] notasPracticasEntornos = {5, 10, 9, 10, 8, 9, 7, 8, 9};
		
		Asignatura entornos = new Asignatura("Entornos de desarollo", notasExamenesEntornos, notasPracticasEntornos, 0.70, 0.20, 0.10);
		
		System.out.println(entornos.toString());
	}
	
	
}
