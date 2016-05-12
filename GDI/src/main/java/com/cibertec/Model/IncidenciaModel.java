package com.cibertec.Model;

import java.sql.Date;

import com.cibertec.metodos.Metodos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IncidenciaModel {
	private String descripcion;
	private int idIncidencia;
	private Date fechaCreacion;
	private Date fechaObservacion;
	private Date fechaEnProceso;
	private Date fechaFinalizado;
	
	/*Puede almacenar uno o mas fotos*/
	private File foto;
	private int idUsuario;
	private String usuario;


	private int idTipoIncidencia;
	private String tipoIncidencia;

	private String fotoContentType;
	private String fotoFileName;

	public File getFoto() {
		return foto;
	}

	public void setFoto(File foto) {
		this.foto = foto;
	}

	public int getIdTipoIncidencia() {
		return idTipoIncidencia;
	}

	public void setIdTipoIncidencia(int idTipoIncidencia) {
		this.idTipoIncidencia = idTipoIncidencia;
	}

	public String getTipoIncidencia() {
		return tipoIncidencia;
	}

	public void setTipoIncidencia(String tipoIncidencia) {
		this.tipoIncidencia = tipoIncidencia;
	}

	public String getFotoContentType() {
		return fotoContentType;
	}

	public void setFotoContentType(String fotoContentType) {
		this.fotoContentType = fotoContentType;
	}

	public String getFotoFileName() {
		return fotoFileName;
	}

	public void setFotoFileName(String fotoFileName) {
		this.fotoFileName = fotoFileName;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdIncidencia() {
		return idIncidencia;
	}

	public void setIdIncidencia(int idIncidencia) {
		this.idIncidencia = idIncidencia;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaObservacion() {
		return fechaObservacion;
	}

	public void setFechaObservacion(Date fechaObservacion) {
		this.fechaObservacion = fechaObservacion;
	}

	public Date getFechaEnProceso() {
		return fechaEnProceso;
	}

	public void setFechaEnProceso(Date fechaEnProceso) {
		this.fechaEnProceso = fechaEnProceso;
	}

	public Date getFechaFinalizado() {
		return fechaFinalizado;
	}

	public void setFechaFinalizado(Date fechaFinalizado) {
		this.fechaFinalizado = fechaFinalizado;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}