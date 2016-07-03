package com.cibertec.Service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cibertec.InterfaceMapper.GeoModelMapper;
import com.cibertec.InterfaceMapper.ResidenciaModelMapper;
import com.cibertec.Model.GeoModel;
import com.cibertec.Model.ResidenciaModel;
import com.cibertec.conexion.MyBatisUtil;

public class ResidenciaDAO implements ResidenciaModelMapper {

	@Override
	public List<ResidenciaModel> listarResidencia() throws Exception {
		SqlSession sq = MyBatisUtil.getConeccion().openSession();
		return sq.getMapper(ResidenciaModelMapper.class).listarResidencia();
	}

	

}