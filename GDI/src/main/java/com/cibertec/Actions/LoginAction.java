package com.cibertec.Actions;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.cibertec.Model.UsuarioModel;
import com.cibertec.Service.UsuarioDao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsuarioModel usuario;
	private String msjError;
	private Map session = ActionContext.getContext().getSession();
	private Map aplication = ActionContext.getContext().getApplication();

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

	public String validarSession() {
		UsuarioModel usu = (UsuarioModel) session.get("user");
		if (usu != null) {
			return SUCCESS;
		}
		return LOGIN;
	}

	public String login() {
		UsuarioModel usu = (UsuarioModel) session.get("user");
		if (usu != null) {
			return SUCCESS;
		} else if (usuario != null) {
			UsuarioModel us;
			try {
				us = new UsuarioDao().ValidarUsuario(usuario.getUsuario(), usuario.getPassword());
				if (us != null) {
					session.put("user", usuario);
					aplication.put("user",usuario);
					return SUCCESS;
				} else {
					msjError = "Usuario Incorrecto";
					return LOGIN;
				}
			} catch (Exception e) {
				e.printStackTrace();
				return LOGIN;
			}

		} else {
			return LOGIN;
		}
	}

	public String outLogin() {
		((SessionMap<String, Object>) session).invalidate();
		aplication.remove("user");
		return LOGIN;
	}

	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	public String getMsjError() {
		return msjError;
	}

	public void setMsjError(String msjError) {
		this.msjError = msjError;
	}

}
