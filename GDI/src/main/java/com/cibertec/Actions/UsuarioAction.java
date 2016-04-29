package com.cibertec.Actions;

import java.util.List;

import com.cibertec.Model.UsuarioModel;
import com.cibertec.Service.UsuarioDao;
import com.cibertec.interceptor.UsuarioHabilitado;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class UsuarioAction extends ActionSupport implements UsuarioHabilitado,Preparable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsuarioModel usuario;
	private List<UsuarioModel> lUsuario;

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}
	
	public String registrar(){
		if(usuario!=null){
			return SUCCESS;
		}
		return ERROR;
	}

	@Override
	public void prepare() throws Exception {
		lUsuario = new UsuarioDao().ObtenerListado();
	}
}
