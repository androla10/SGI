package com.cibertec.Model;

public class UsuarioModel {
	private int idUsuario;
	private String usuario;
	private String password;
	private int idTipo;
	private int idActivo;

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	public int getIdActivo() {
		return idActivo;
	}

	public void setIdActivo(int idActivo) {
		this.idActivo = idActivo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
