package br.com.vainaweb.backendt3.classes;

public class EmpregadoExercicio {
		
		String nome;
		String cpf;
		double salario;
		
		// Construtor
		public EmpregadoExercicio(String nome, String cpf, double salario) {
			this.nome = nome;
			this.cpf = cpf;
			this.salario = salario;
		}

		public double salarioAnual() {
			return salario * 12;
		}
		
		public void aumentoSalario() {
			salario = salario * 1.1;
			System.out.printf("\nSalário anual do(a) senhor(a) %s com acréscimo de 10%% ao salário é: %.2f", nome, salarioAnual());
		}
		
		public void printarSalarioAnual() {
			System.out.printf("\nSalário anual do(a) senhor(a) %s é: %.2f", nome, salarioAnual());
		}
		
	}
