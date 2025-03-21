package br.edu.fatecpg.javafila.model;

public class Fila {
	private int pacientesNaFila = 0;
	private int pacientesChamados = 0;
	
	public Fila(int numPacientesFila) {
		this.pacientesNaFila = numPacientesFila;
	}
	
	public int getPacientesNaFila() {
		return this.pacientesNaFila;
	}
	
	public int getPacientesChamados() {
		return this.pacientesChamados;
	}
	
	public void entrarPacienteNaFila() {
		this.pacientesNaFila++;
	}
	
	public void chamarPacientes(int numPacientes) {
		if(numPacientes < 3 && numPacientes > 0 && (this.pacientesNaFila - numPacientes) >= 0) {
			this.pacientesNaFila = this.pacientesNaFila - numPacientes;
			this.pacientesChamados = this.pacientesChamados + numPacientes;
			System.out.println(numPacientes + " Paciente(s) atendido(s)! | Pacientes na fila: " + getPacientesNaFila() + " | Pacientes chamados: " + getPacientesChamados());
		} else {
			System.out.println("Número inválido!");
		}
	}
}



