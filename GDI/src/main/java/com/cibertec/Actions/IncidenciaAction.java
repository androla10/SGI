package com.cibertec.Actions;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.util.ServletContextAware;

import com.cibertec.Model.AtencionIncidenciaModel;
import com.cibertec.Model.IncidenciaModel;
import com.cibertec.Model.PrioridadModel;
import com.cibertec.Model.TipoIncidenciaModel;
import com.cibertec.Model.UrgenciaModel;
import com.cibertec.Model.UsuarioModel;
import com.cibertec.Service.IncidenciaDAO;
import com.cibertec.Service.PrioridadDAO;
import com.cibertec.Service.TipoIncidenciaDAO;
import com.cibertec.Service.UrgenciaDAO;
import com.cibertec.constantes.Constantes;
import com.cibertec.interceptor.UsuarioHabilitado;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class IncidenciaAction extends ActionSupport implements ServletContextAware, UsuarioHabilitado {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IncidenciaModel incidencia;
	private HttpServletRequest servletRequest;
	private String fileContentType;
	private String fileFileName;
	private String filesPath;
	private ServletContext context;
	private UsuarioModel usuario;
	private int codigoAutogenerado;
	private List<UrgenciaModel> listarUrgencia;
	private List<PrioridadModel> listarPrioridad;
	private List<TipoIncidenciaModel> listarTipoIncidencia;
	private Map session = ActionContext.getContext().getSession();
	private Map aplication = ActionContext.getContext().getApplication();
	IncidenciaDAO dao = new IncidenciaDAO();
	private List<IncidenciaModel> listaIncidenciaAsignadas;
	private int idIncidencia;
	private AtencionIncidenciaModel atencion = null;

	public AtencionIncidenciaModel getAtencion() {
		return atencion;
	}

	public void setAtencion(AtencionIncidenciaModel atencion) {
		this.atencion = atencion;
	}

	public int getIdIncidencia() {
		return idIncidencia;
	}

	public void setIdIncidencia(int idIncidencia) {
		this.idIncidencia = idIncidencia;
	}

	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	public Map getAplication() {
		return aplication;
	}

	public void setAplication(Map aplication) {
		this.aplication = aplication;
	}

	public List<IncidenciaModel> getListaIncidenciaAsignadas() {
		return listaIncidenciaAsignadas;
	}

	public void setListaIncidenciaAsignadas(List<IncidenciaModel> listaIncidenciaAsignadas) {
		this.listaIncidenciaAsignadas = listaIncidenciaAsignadas;
	}

	public List<UrgenciaModel> getListarUrgencia() {
		return listarUrgencia;
	}

	public void setListarUrgencia(List<UrgenciaModel> listarUrgencia) {
		this.listarUrgencia = listarUrgencia;
	}

	public List<PrioridadModel> getListarPrioridad() {
		return listarPrioridad;
	}

	public void setListarPrioridad(List<PrioridadModel> listarPrioridad) {
		this.listarPrioridad = listarPrioridad;
	}

	public IncidenciaDAO getDao() {
		return dao;
	}

	public void setDao(IncidenciaDAO dao) {
		this.dao = dao;
	}

	public int getCodigoAutogenerado() {
		return codigoAutogenerado;
	}

	public void setCodigoAutogenerado(int codigoAutogenerado) {
		this.codigoAutogenerado = codigoAutogenerado;
	}

	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}

	public void setContext(ServletContext context) {
		this.context = context;
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

	public IncidenciaModel getIncidencia() {
		return incidencia;
	}

	public void setIncidencia(IncidenciaModel incidencia) {
		this.incidencia = incidencia;
	}

	public List<TipoIncidenciaModel> getListarTipoIncidencia() {
		return listarTipoIncidencia;
	}

	public void setListarTipoIncidencia(List<TipoIncidenciaModel> listarTipoIncidencia) {
		this.listarTipoIncidencia = listarTipoIncidencia;
	}

	public String registrar() {

		System.out.println("File Name is:" + incidencia.getFotoContentType());
		System.out.println("File ContentType is:" + incidencia.getFotoFileName());
		System.out.println("Files Directory is:" + filesPath);
		System.out.println("S� registro la incidencia generada");

		UsuarioModel usu = (UsuarioModel) session.get("user");

		this.incidencia.setIdUsuario(usu.getIdUsuario());
		try {
			this.incidencia.setFotobinary(Constantes.getBytesFromFile(this.incidencia.getFoto()));
			int resultado = new IncidenciaDAO().RegistrarIncidencia(this.incidencia);
			if (resultado != -1) {
				setCodigoAutogenerado(resultado);
				return SUCCESS;
			} else {
				return ERROR;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Metodos.guardarArchivo(incidencia.getFoto(),
		// incidencia.getFotoFileName(),
		// context.getRealPath("") + File.separator + filesPath);
		// int resultado = dao.RegistrarIncidencia(getIncidencia());
		// if (resultado == -1) {
		// setCodigoAutogenerado(resultado);
		// return INPUT;
		// } else {
		// setCodigoAutogenerado(resultado);
		// }

		return ERROR;
	}

	public String cargarFormularioRegistrarIncidencia() {
		try {
			this.listarTipoIncidencia = new TipoIncidenciaDAO().listarTipoIncidencia();
			this.listarPrioridad = new PrioridadDAO().listarPrioridad();
			this.listarUrgencia = new UrgenciaDAO().listarUrgencia();

			if (listarPrioridad != null && listarUrgencia != null && listarTipoIncidencia != null) {
				for (PrioridadModel prioridadModel : listarPrioridad) {
					System.out.println(prioridadModel.getsDescripcion());
				}
				return SUCCESS;
			} else
				return LOGIN;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return LOGIN;

	}

	public String cargarFormularioListarIncidencia() {
		try {
			UsuarioModel usu = (UsuarioModel) session.get("user");
			this.listaIncidenciaAsignadas = new IncidenciaDAO().ListarIncidenciasAsignadas(usu.getIdUsuario());
			if (listaIncidenciaAsignadas != null) {
				return SUCCESS;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return LOGIN;
	}

	public String cargarFormularioAtencionIncidencia() {
		try {
			this.atencion = new IncidenciaDAO().atencionIncidencia(this.idIncidencia);
			if (this.atencion != null) {
				return SUCCESS;
			} else
				return LOGIN;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return LOGIN;
	}

	public String comenzarAtencionIncidencia() {
		try {
			this.atencion = new IncidenciaDAO().atencionIncidencia(this.idIncidencia);
			if (this.atencion != null) {
				return SUCCESS;
			} else {
				return NONE;
			}
		} catch (Exception e) {
			return LOGIN;
		}
	}
	public String DerivarIncidencia(){
		try {
			int resultado = new IncidenciaDAO().derivarIncidencia(this.incidencia);
			if (resultado != -1) {
				return SUCCESS;
			} else {
				return NONE;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return LOGIN;
		}
	}

	public HttpServletRequest getServletRequest() {
		return servletRequest;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String getFilesPath() {
		return filesPath;
	}

	public void setFilesPath(String filesPath) {
		this.filesPath = filesPath;
	}

	public ServletContext getContext() {
		return context;
	}

	@Override
	public void setServletContext(ServletContext context) {
		// TODO Auto-generated method stub
		this.context = context;
	}

}
