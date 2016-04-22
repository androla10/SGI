<div class="container-fluid">
	</hr>
	<div class="panel-primary">
		<div class="panel-heading">
			<i class="fa fa-user fa-1x"></i>&nbsp;Registrar Usuario
		</div>
		<div class="panel-body">
			<form action="" id="formRegistroUsuario">
				<div class="row">
					<div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
						<div class="form-group">
							<label for="nombre">Nombre</label> <input type="text"
								class="form-control" name="usuario.nombre" id="Nombre" />
						</div>
						<div class="form-group">
							<label for="Apellido">Apellido</label> <input type="text"
								class="form-control" name="usuario.apellido" id="Apellido" />
						</div>
						<div class="form-group">
							<label for="Correo" class="control-label">Correo</label>
							<div class="input-group">
								<span class="input-group-addon">@</span> <input type="email"
									class="form-control" name="usuario.correo" id="Correo" />
							</div>
						</div>
						<button type="submit" class="btn btn-primary">Registrar</button>
					</div>
					<div class="col-xs-12 col-sm-12 col-sm-6 col-lg-6">
						<h4>Usuario</h4>
						<p>Usuario encargado de ingresar las incidencias dependiendo de los perfiles por cada usuario
						3: Tipo
							<ol>
								<li>Administrativo</li>
								<li>Cliente</li>
								<li>Supervisor</li>
							</ol>
						</p>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>