<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container-fluid">
	<h1 class="text-center">Seguimiento de Incidencia</h1>
	<br>
	<div class="panel-primary">
		<div class="panel-heading">
			<div class="row">
				<div class="col-xs-6 col-sm-6 col-md-9 col-lg-9">
					<h4>
						<i class="fa fa-user fa-1x"></i>&nbsp; Seguimiento de Incidencia
					</h4>
				</div>
				<div class="col-xs-6 col-sm-6 col-md-3 col-lg-3">
					<h4>
						Estado :
						<s:property value="atencion.sEstado" />
					</h4>
				</div>
			</div>
		</div>
		<div class="panel-body">
			<br>
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
					<div class="form-group">
						<label for="codIncidencia">C�digo de Incidencia</label> <input
							type="text" class="form-control"
							value='<s:property value="atencion.idIncidencia" />'
							id="codIncidencia" disabled="disabled">
					</div>
					<div class="form-group">
						<label for="Titulo">Titulo</label> <input type="text"
							class="form-control"
							value='<s:property value="atencion.titulo" />' id="Titulo"
							disabled="disabled">
					</div>
					<div class="form-group">
						<label for="TipoIncidencia">Tipo Incidencia</label> <select
							class="form-control" id="TipoIncidencia" disabled="disabled">
							<option value="1" selected="selected" />
							<s:property value="atencion.sTipoIncidencia" />
							</option>
						</select>
					</div>
					<div class="form-group">
						<label for="descripcion">Descripci�n</label>
						<textarea class="form-control" id="descripcion" rows="8" cols="9"
							disabled="disabled"><s:property
								value="atencion.sDescripcion" /></textarea>
					</div>
					<!-- 					<div class="form-group"> -->
					<!-- 						<label>Fotografia</label> -->
					<%-- 						<img src='<s:property value="upload/atencion.fotoFileName"/>' > --%>
					<!-- 					</div> -->
				</div>
				<div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
					<s:if test="!atencion.listaSeguimientos.isEmpty">
						<br>
						<h3>Seguimiento</h3>
						<hr>
						<br>
						<s:iterator value="atencion.listaSeguimientos">
							<div
								class="panel <s:if test="idTipoSeguimiento == 1">panel-primary</s:if><s:else>panel-success</s:else>">
								<div class="panel-heading">
									<s:property value="sTipoSeguimiento" />
								</div>
								<div class="panel-body">
									<s:property value="descripcion" />
									<s:date name="fecha" format="dd/MM/yyyy hh:mm:ss a" />
								</div>
							</div>
						</s:iterator>
						<div class="form-group">
							<form action="../Incidencia/AgregarComentario">
								<label for="descripcion">Agregar comentario:</label> <input
									type="hidden" value=<s:property value="atencion.idIncidencia"/>
									name="seguimiento.idIncidencia">
								<textarea class="form-control" name="seguimiento.descripcion"
									id="descripcion" rows="4" cols="4"
									<s:if test="atencion.idEstado == 1 || atencion.idEstado == 2 || atencion.idEstado == 4">
							disabled="disabled"
								</s:if>></textarea>
								<br>
								<button class="btn btn-info" type="submit"
									<s:if test="atencion.idEstado == 1 || atencion.idEstado == 2 || atencion.idEstado == 4">
							disabled="disabled"
								</s:if>>Agregar</button>
							</form>
						</div>
					</s:if>
				</div>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript" src="../js/Derivacion/validator.js"></script>
<script type="text/javascript" src="../js/Incidencia/query.js"></script>