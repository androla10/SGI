package com.cibertec.Actions;

import java.util.List;

import com.cibertec.Model.AreaModel;
import com.cibertec.Model.GeoModel;
import com.cibertec.Model.ResidenciaAreaModel;
import com.cibertec.Model.SedeModel;
import com.cibertec.Model.UsuarioModel;
import com.cibertec.Service.AreaDAO;
import com.cibertec.Service.GeoDAO;
import com.cibertec.interceptor.UsuarioHabilitado;
import com.opensymphony.xwork2.ActionSupport;

public class AreaAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idResidencia;
	private List<AreaModel> listarArea = null;
	private List<ResidenciaAreaModel> listarResidenciaDet = null;

	public List<ResidenciaAreaModel> getListarResidenciaDet() {
		return listarResidenciaDet;
	}

	public void setListarResidenciaDet(List<ResidenciaAreaModel> listarResidenciaDet) {
		this.listarResidenciaDet = listarResidenciaDet;
	}

	public List<AreaModel> getListarArea() {
		return listarArea;
	}

	public void setListarArea(List<AreaModel> listarArea) {
		this.listarArea = listarArea;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getIdResidencia() {
		return idResidencia;
	}

	public void setIdResidencia(int idResidencia) {
		this.idResidencia = idResidencia;
	}

	public String listarAreasxResidencia() {
		try {
			this.listarArea = new AreaDAO().listarAreasxResidencia(this.idResidencia);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (listarArea != null) {
			if (listarArea.size() >= 0) {
				return SUCCESS;
			} else {
				return NONE;
			}
		} else {
			return NONE;
		}
	}

	public String listarAreas() {
		try {
			this.listarArea = new AreaDAO().listarAreas();
			if (listarArea != null) {
				if (listarArea.size() >= 0) {
					return SUCCESS;
				} else {
					return NONE;
				}
			} else {
				return NONE;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return NONE;
	}

	public String listarAreaSucursal() {
		try {
			this.listarResidenciaDet = new AreaDAO().listarAreaSucursal();
			if (listarResidenciaDet != null) {
				if (listarResidenciaDet.size() >= 0) {
					return SUCCESS;
				} else {
					return NONE;
				}
			} else {
				return NONE;
			}

		} catch (Exception e) {

		}
		return NONE;
	}

}
