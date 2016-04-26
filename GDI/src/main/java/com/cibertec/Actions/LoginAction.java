package com.cibertec.Actions;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.cibertec.Model.UsuarioModel;
import com.cibertec.interceptor.UsuarioHabilitado;
import com.opensymphony.xwork2.Action;
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
			if (usuario.getUsuario().equalsIgnoreCase("Admin") && usuario.getPassword().equalsIgnoreCase("123")) {
				session.put("user", usuario);
				return SUCCESS;
			} else {
				msjError = "Usuario Incorrecto";
				return LOGIN;
			}
		} else {
			return LOGIN;
		}
	}

	public String outLogin() {
		((SessionMap<String, Object>) session).invalidate();
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
