package calculadoraNotas;

public class Asignatura {


	private static final int MEDIA_EXAMENES = 0;
	private static final int MEDIA_PRACTICAS = 1;
	private static final int NOTA_ACTITUD = 2;
	private String nombre;
	private double[] notasExamenes;
	private double[] notasPracticas;
	private double notaActitud;
	private double[] formaDeHacerMedia = new double[3];
	
	
	public Asignatura(String nombre, double[] notasExamenes, double[] notasPracticas, double valorExamenes,double valorPracticas, double valorActitud ) {
		this.nombre = nombre;
		this.notasExamenes = notasExamenes;
		this.notasPracticas = notasPracticas;
		this.notaActitud = 10;
		this.formaDeHacerMedia[MEDIA_EXAMENES] = valorExamenes;
		this.formaDeHacerMedia[MEDIA_PRACTICAS] = valorPracticas;
		this.formaDeHacerMedia[NOTA_ACTITUD] = valorActitud;
	}
	
	
	public double getMediaExamenes() {
		
		double resultado = calcularMedia(notasExamenes);
		
		
		
		return resultado;
		
	}
	
	public double getMediaPracticas() {
		
		double resultado = calcularMedia(notasPracticas);
		
		return resultado;
	}
	
	private double calcularMedia(double[] notas) {
		
		double resultado;
		double sumaNotas = 0;
		
		for(int i = 0;
				i < notas.length;
				i++) {
			sumaNotas += notas[i];	
		}
			
		resultado = sumaNotas / notas.length;	
		
		return resultado;
		
	}
	
	private double calcularNotaFinal() {
		double resultado;
		double valorExamenes = getMediaExamenes() * formaDeHacerMedia[MEDIA_EXAMENES];
		double valorPracticas = getMediaPracticas() * formaDeHacerMedia[MEDIA_PRACTICAS];
		double valorActitud = notaActitud * formaDeHacerMedia[NOTA_ACTITUD];
		
		resultado = valorExamenes + valorPracticas + valorActitud;
		
		return resultado;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.nombre);
		sb.append("\n Notas Examenes");
		for(int i = 0;
				i < this.notasExamenes.length;
				i++) {
			sb.append(this.notasExamenes[i]);
			sb.append("\t");
		}
		sb.append("\nMedia examenes");
		sb.append(getMediaExamenes());
		
		sb.append("\n Notas practicas");
		for(int i = 0;
				i < this.notasPracticas.length;
				i++) {
			sb.append(this.notasPracticas[i]);
			sb.append("\t");
			if(i % 6 == 0) {
				sb.append("\n");
			}
		}
		sb.append("\nMedia Practicas");
		sb.append(getMediaPracticas());
		
		sb.append("\nNota final");
		sb.append(calcularNotaFinal());
			
		
		
		
		
		return sb.toString();
	}
	
}
