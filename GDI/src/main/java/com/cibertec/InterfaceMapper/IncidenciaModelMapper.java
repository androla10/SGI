package com.cibertec.InterfaceMapper;

import java.sql.SQLException;

import com.cibertec.Model.AtencionIncidenciaModel;
import com.cibertec.Model.IncidenciaModel;
import com.cibertec.Model.SeguimientoModel;

import java.util.*;

import org.apache.ibatis.annotations.Param;

public interface IncidenciaModelMapper {

	public int RegistrarIncidencia(IncidenciaModel incidencia) throws SQLException;

	public int ModificarIncidencia(IncidenciaModel incidencia) throws SQLException;

	public List<IncidenciaModel> ListarIncidencia() throws SQLException;

	public int EliminarIncidencia(int codigoIncidencia) throws SQLException;

	public List<IncidenciaModel> ListarIncidenciasAsignadas(@Param("idUsuario") int idUsuario) throws SQLException;

	public AtencionIncidenciaModel atencionIncidencia(@Param("idIncidencia") int idIncidencia) throws SQLException;

	public int comenzarAtencionIncidencia(@Param("idIncidencia") int idIncidencia)
			throws SQLException;

	public int derivarIncidencia(IncidenciaModel incidencia) throws Exception;
	
	public int terminarIncidencia(IncidenciaModel incidencia) throws SQLException;
	
	public int AgregarComentario(SeguimientoModel comentario) throws SQLException;
	

}
