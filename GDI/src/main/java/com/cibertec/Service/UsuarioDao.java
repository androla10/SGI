package com.cibertec.Service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cibertec.InterfaceMapper.UsuarioModelMapper;
import com.cibertec.Model.UsuarioModel;
import com.cibertec.conexion.MyBatisUtil;

public class UsuarioDao implements UsuarioModelMapper {

	public int Registrar() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public int Modificar() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public int Eliminar() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public UsuarioModel Obtener(int idUsuario) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UsuarioModel> Obtener() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioModel ValidarUsuario(String usuario, String clave) throws Exception {
		SqlSession sq = MyBatisUtil.getConeccion().openSession();
		UsuarioModel usu = sq.getMapper(UsuarioModelMapper.class).ValidarUsuario(usuario, clave);
		return usu;
	}

}
