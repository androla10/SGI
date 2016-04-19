package com.cibertec.Actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.cibertec.Bean.UsuarioBean;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction implements SessionAware {
	private UsuarioBean usuario;
	private String msjError;
	Map<String, Object> session = ActionContext.getContext().getSession();

	public UsuarioBean getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioBean usuario) {
		this.usuario = usuario;
	}

	public String login() {
//		UsuarioBean us = (UsuarioBean) session.get("usuario");
//		if (us != null) {
//			if (us.getUsuario().equalsIgnoreCase("Admin") && us.getPassword().equalsIgnoreCase("123")) {
//				return "ok";
//			} else
//				return "no";
//		} else {
			if (usuario.getUsuario().equalsIgnoreCase("Admin") && usuario.getPassword().equalsIgnoreCase("123")) {
				session.put("usuario", usuario);
				return "ok";
			}
			msjError = "Usuario Incorrecto";
			return "no";
//		}
	}

	// @Override
	// public void setSession(Map<String, Object> arg0) {
	// this.session = arg0;
	// }

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
