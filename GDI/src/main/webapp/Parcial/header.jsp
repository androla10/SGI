<%@ taglib uri="/struts-tags" prefix="s" %>
<nav class="navbar navbar-default navbar-fixed-top navcabecera">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Sistema GDI</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="glyphicon glyphicon-user"></span> Alex Urbina <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><s:a href="#"><i class="fa fa-wrench fa-ws"></i> Configuración</s:a></li>
            <li role="separator" class="divider"></li>
            <li><s:a href="../Login/LoginOut"><i class="fa fa-sign-out fa-ws"></i> Cerrar Sesión</s:a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>