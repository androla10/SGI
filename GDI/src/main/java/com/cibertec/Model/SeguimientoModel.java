package com.cibertec.Model;

import java.util.*;

public class SeguimientoModel {
	private String descripcion;
	private String estado;
	private int idEstado;
	private int idIncidencia;
	private int idUsuario;
	private String sUsuario;
	private Date fecha;
	private int idTipoSeguimiento;
	private String sTipoSeguimiento;

	public String getsTipoSeguimiento() {
		return sTipoSeguimiento;
	}

	public void setsTipoSeguimiento(String sTipoSeguimiento) {
		this.sTipoSeguimiento = sTipoSeguimiento;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public void setsUsuario(String sUsuario) {
		this.sUsuario = sUsuario;
	}

	public int getIdTipoSeguimiento() {
		return idTipoSeguimiento;
	}

	public void setIdTipoSeguimiento(int idTipoSeguimiento) {
		this.idTipoSeguimiento = idTipoSeguimiento;
	}

	public String getsUsuario() {
		return sUsuario;
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
