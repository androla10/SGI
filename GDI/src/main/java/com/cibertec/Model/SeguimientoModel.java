package com.cibertec.Model;

import java.util.*;

public class SeguimientoModel {
	private String descripcion;
	private String estado;
	private int idEstado;
	private int idIncidencia;
	private int sUsuario;
	private Date fecha;
	private int idTipoSeguimiento;
	

	public int getIdTipoSeguimiento() {
		return idTipoSeguimiento;
	}

	public void setIdTipoSeguimiento(int idTipoSeguimiento) {
		this.idTipoSeguimiento = idTipoSeguimiento;
	}

	public int getsUsuario() {
		return sUsuario;
	}

	public void setsUsuario(int sUsuario) {
		this.sUsuario = sUsuario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}

	public int getIdIncidencia() {
		return idIncidencia;
	}

	public void setIdIncidencia(int idIncidencia) {
		this.idIncidencia = idIncidencia;
	}

}
