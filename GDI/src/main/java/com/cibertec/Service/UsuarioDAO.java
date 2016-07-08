package com.cibertec.Service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cibertec.InterfaceMapper.UsuarioModelMapper;
import com.cibertec.Model.UsuarioModel;
import com.cibertec.conexion.MyBatisUtil;

public class UsuarioDAO implements UsuarioModelMapper {

	@Override
	public int Registrar(UsuarioModel usuario) throws Exception {
		SqlSession sq = MyBatisUtil.getConeccion().openSession();
		return sq.getMapper(UsuarioModelMapper.class).Registrar(usuario);
	}

	@Override
	public int Modificar() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Eliminar() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UsuarioModel Obtener(int idUsuario) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuarioModel> ObtenerListado() throws Exception {
		SqlSession sq = MyBatisUtil.getConeccion().openSession();
		return sq.getMapper(UsuarioModelMapper.class).ObtenerListado();
	}

	@Override
	public UsuarioModel ValidarUsuario(String usuario, String clave) throws Exception {
		SqlSession sq = MyBatisUtil.getConeccion().openSession();
		UsuarioModel usu = sq.getMapper(UsuarioModelMapper.class).ValidarUsuario(usuario, clave);
		return usu;
	}

	@Override
	public List<UsuarioModel> ObtenerUsuarioOperativoxArea(int idResidenciaArea) throws Exception {
		SqlSession sq = MyBatisUtil.getConeccion().openSession();
		return sq.getMapper(UsuarioModelMapper.class).ObtenerUsuarioOperativoxArea(idResidenciaArea);
	}

}
