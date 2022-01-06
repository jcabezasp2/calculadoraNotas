package calculadoraNotas;

public class App {

	
	public static void main(String[] args) {
		
		double[] notasExamenesProgramacion = {5, 9, 7, 8, 10};
		double[] notasPracticasProgramacion = {5, 10, 9, 10, 8, 9, 7, 8, 9};
		
		Asignatura programacion = new Asignatura("Programacion", notasExamenesProgramacion, notasPracticasProgramacion, 0.70, 0.20, 0.10);
		
		System.out.println(programacion.toString());
	}
	
	
}
