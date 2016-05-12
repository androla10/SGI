package com.cibertec.Service;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cibertec.InterfaceMapper.IncidenciaModelMapper;
import com.cibertec.Model.IncidenciaModel;
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

}
