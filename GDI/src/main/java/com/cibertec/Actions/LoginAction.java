package com.cibertec.Actions;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.cibertec.Bean.UsuarioBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class LoginAction extends ActionSupport implements SessionAware, Preparable {
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

		if (usuario.getUsuario().equalsIgnoreCase("Admin") && usuario.getPassword().equalsIgnoreCase("123")) {
			session.put("usuario", usuario);
			return SUCCESS;
		}
		msjError = "Usuario Incorrecto";
		return LOGIN;
	}

	public String outLogin() {
		session.remove("usuario");
		session.clear();
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

	@Override
	public void prepare() throws Exception {
		// UsuarioBean us = (UsuarioBean) session.get("usuario");

	}

}
