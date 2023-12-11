package br.com.vainaweb.backendt3.classes;

public class Application {
	
	public static void main(String[] args) {
		
		EmpregadoExercicio empregado1 = new EmpregadoExercicio("Bárbara", "753951485", 3000);
		EmpregadoExercicio empregado2 = new EmpregadoExercicio("Sofia", "7894561230", 2000);
		
		empregado1.printarSalarioAnual();
		empregado1.aumentoSalario();
		
		
		empregado2.printarSalarioAnual();
		empregado2.aumentoSalario();
		
	}
}
