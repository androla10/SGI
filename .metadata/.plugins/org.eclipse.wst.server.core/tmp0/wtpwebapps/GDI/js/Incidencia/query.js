$(document).ready(function() {
	function comenzar(idIncidencia) {
		var url = "../Area/comenzarAtencionIncidencia"
		var data = {
			idIncidencia : idIncidencia
		};

		$.getJSON(url, data).done(function(json) {
			console.log(json.listarResidenciaDet);
			console.log()
		}).fail(function(jqxhr, textStatus, error) {
			var err = textStatus + ", " + error;
			console.log("Request Failed: " + err);
		});
	};
	
	$('#areaderivar').change(function() {
		var position = document.getElementById('areaderivar').options.selectedIndex;
		var idArea = document.getElementById('areaderivar').options[position].value;
		cargarOperativo(idArea);
	});
	
	var cargarOperativo = function(idArea){
		var url = "../Usuario/ObtenerUsuarioOperativoxArea"
			var data = {
				idResidenciaArea : idArea
			};

			$.getJSON(url, data).done(function(json) {
				console.log(json.lUsuario);
				var selectOperativo = $('#Operativoderivar');
				selectOperativo.find('option').remove();
				$.each(json.lUsuario,function(key,value){
					selectOperativo.append("<option value='"+value.idUsuario+"'>"+value.nombre+" "+value.apellido+"</option>");
				});
				
			}).fail(function(jqxhr, textStatus, error) {
				var err = textStatus + ", " + error;
				console.log("Request Failed: " + err);
			});
	};
	
	
	$("#derivar").click(function() {
		var url = "../Area/listarAreaSucursal"
		var data = {
		// idIncidencia : idIncidencia
		};

		$.getJSON(url, data).done(function(json) {
			console.log(json.listarResidenciaDet);

			var selectAreaADerivar = $('#areaderivar');
			selectAreaADerivar.children().remove("optgroup");
			selectAreaADerivar.find('option').remove();

			$.each(json.listarResidenciaDet, function(key, value) {

				var optgroup = $('<optgroup>');
				optgroup.attr('label', value.residencia);
				$.each(value.listaDetalle, function(key1, value1) {
					var option = $('<option></option');
					option.val(value1.idResidenciaArea);
					option.text(value1.sDescripcion);
					optgroup.append(option);
				});
				selectAreaADerivar.append(optgroup);
			});

			// console.log();
		}).fail(function(jqxhr, textStatus, error) {
			var err = textStatus + ", " + error;
			console.log("Request Failed: " + err);
		});
	});

});

// var comenzar=function(idIncidencia){
// alert(idIncidencia);
// }
