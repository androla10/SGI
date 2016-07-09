package com.cibertec.Service;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cibertec.InterfaceMapper.IncidenciaModelMapper;
import com.cibertec.Model.AtencionIncidenciaModel;
import com.cibertec.Model.IncidenciaModel;
import com.cibertec.Model.SeguimientoModel;
import com.cibertec.conexion.MyBatisUtil;

public class IncidenciaDAO implements IncidenciaModelMapper {

	@Override
	public int RegistrarIncidencia(IncidenciaModel incidencia) throws SQLException {
		SqlSession sq = MyBatisUtil.getConeccion().openSession();
		sq.commit(false);
		int resultado = sq.getMapper(IncidenciaModelMapper.class).RegistrarIncidencia(incidencia);
		sq.close();
		return resultado;
	}

	@Override
	public int ModificarIncidencia(IncidenciaModel incidencia) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<IncidenciaModel> ListarIncidencia() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int EliminarIncidencia(int codigoIncidencia) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<IncidenciaModel> ListarIncidenciasAsignadas(int idUsuario) throws SQLException {
		return MyBatisUtil.getConeccion().openSession().getMapper(IncidenciaModelMapper.class)
				.ListarIncidenciasAsignadas(idUsuario);
	}

	@Override
	public AtencionIncidenciaModel atencionIncidencia(int idIncidencia) throws SQLException {
		return MyBatisUtil.getConeccion().openSession().getMapper(IncidenciaModelMapper.class)
				.atencionIncidencia(idIncidencia);
	}

	@Override
	public int comenzarAtencionIncidencia(int idIncidencia) throws SQLException {
		return MyBatisUtil.getConeccion().openSession().getMapper(IncidenciaModelMapper.class)
				.comenzarAtencionIncidencia(idIncidencia);
	}

	@Override
	public int derivarIncidencia(IncidenciaModel incidencia) throws Exception {
		return MyBatisUtil.getConeccion().openSession().getMapper(IncidenciaModelMapper.class)
				.derivarIncidencia(incidencia);
	}

	@Override
	public int terminarIncidencia(IncidenciaModel incidencia) throws SQLException {
		return MyBatisUtil.getConeccion().openSession().getMapper(IncidenciaModelMapper.class)
				.terminarIncidencia(incidencia);
	}

	@Override
	public int AgregarComentario(SeguimientoModel comentario) throws SQLException {
		return MyBatisUtil.getConeccion().openSession().getMapper(IncidenciaModelMapper.class)
				.AgregarComentario(comentario);
	}

}
