package br.edu.fatecpg.LoginInterface.model;

public interface Autenticavel {
	public boolean login(String usuario, String senha);
	public void logout();

}
