package calculadoraNotas;

public class App {

	
	public static void main(String[] args) {
		//PROGRAMACION
		double[] notasExamenesProgramacion = {10};
		double[] notasPracticasProgramacion = {10, 10, 10, 10, 10, 10, 9.75, 9.5, 9.5, 10, 9.65, 9, 10, 10, 8};
		int notaActitudProgramacion = 5;
		Asignatura programacion = new Asignatura("Programacion", notasExamenesProgramacion, notasPracticasProgramacion, notaActitudProgramacion, 0.70, 0.20, 0.10);
		
		System.out.println(programacion.toString());
		
		//LENGUAJES DE MARCAS
		
		double[] notasExamenesLenguajes = {10};
		double[] notasPracticasLenguajes = {5};
		int notaActitudLenguajes = 5;
		
		Asignatura lenguajes = new Asignatura("Lenguajes de marcas", notasExamenesLenguajes, notasPracticasLenguajes, notaActitudLenguajes, 0.60, 0.30, 0.10);
		
		System.out.println(lenguajes.toString());
		
		//SISTEMAS INFORMATICOS
		
		double[] notasExamenesSistemas = {10};
		double[] notasPracticasSistemas = {10, 10, 10, 10, 10, 10, 10, 10, 10};
		int notaActitudSistemas = 5;
		
		Asignatura sistemas = new Asignatura("Sistemas informaticos", notasExamenesSistemas, notasPracticasSistemas, notaActitudSistemas, 0.70, 0.20, 0.10);
		
		System.out.println(sistemas.toString());
		
		//INGLES
		
		double[] notasExamenesIngles = { 7, 7.17, 7.77, 7.95};
		double[] notasPracticasIngles = {5};
		int notaActitudIngles = 5;
		
		Asignatura ingles = new Asignatura("Ingles", notasExamenesIngles, notasPracticasIngles, notaActitudIngles, 0.90, 0.00, 0.10);
		
		System.out.println(ingles.toString());
		
		//BASES DE DATOS
		
		double[] notasExamenesBases = {10};
		double[] notasPracticasBases = {8.75, 8.56, 8.4, 6.9, 10, 10, 10};
		int notaActitudBases = 5;
		
		Asignatura bases = new Asignatura("Bases de datos", notasExamenesBases, notasPracticasBases, notaActitudBases, 0.80, 0.15, 0.05);
		
		System.out.println(bases.toString());
		
		//ENTORNOS DE DESARROLLO
		
		double[] notasExamenesEntornos = {7.6};
		double[] notasPracticasEntornos = {10, 8.43, 10, 9.5, 8, 10, 10, 10, 10};
		notaActitudBases = 5;
		
		Asignatura entornos = new Asignatura("Entornos de desarollo", notasExamenesEntornos, notasPracticasEntornos, notaActitudBases, 0.65, 0.30, 0.05);
		
		System.out.println(entornos.toString());
	}
	
	
}
