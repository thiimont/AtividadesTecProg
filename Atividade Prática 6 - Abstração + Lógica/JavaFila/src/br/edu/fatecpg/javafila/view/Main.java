package br.edu.fatecpg.javafila.view;
import br.edu.fatecpg.javafila.model.Fila;

public class Main {

	public static void main(String[] args) {
		Fila fila = new Fila(20);
		
		fila.entrarPacienteNaFila();
		fila.entrarPacienteNaFila();
		fila.entrarPacienteNaFila();
		
		System.out.println("Pacientes na fila: " + fila.getPacientesNaFila());
		System.out.println("Pacientes chamados: " + fila.getPacientesChamados());
		
		fila.chamarPacientes(3); // retorna um erro pois você só pode chamar até 2 pacientes
		fila.chamarPacientes(0); // retorna um erro pois você não pode chamar um número menor que 1
		fila.chamarPacientes(2);
		fila.chamarPacientes(2);
		fila.chamarPacientes(2);
		
		System.out.println("Pacientes na fila: " + fila.getPacientesNaFila());
		System.out.println("Pacientes chamados: " + fila.getPacientesChamados());

	}

}
