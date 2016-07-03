$(document)
		.ready(
				function() {
					$('#Residencia').change(function() {
										var position = document.getElementById('Residencia').options.selectedIndex;
										var idResidencia = document.getElementById('Residencia').options[position].value;
										CargarAreas(idResidencia);
									});

					var CargarAreas = function(idResidencia) {
						var url = "../Area/listarAreaxResidencia"
						var data = {
							idResidencia : idResidencia
						};
						
						$.getJSON(url, data).done(function(json) {
							 var selectArea = $('#Area');
							 selectArea.find('option').remove();
							 $.each(json.listarArea, function(key,
							 value) {
								 selectArea.append("<option value="+value.idResidenciaArea+">"+value.sDescripcion+"</option>");
							 });							
						}).fail(function(jqxhr, textStatus, error) {
							var err = textStatus + ", " + error;
							console.log("Request Failed: " + err);
						});
					};
					
					var comboboxDefault = function(){
						
					};
				});