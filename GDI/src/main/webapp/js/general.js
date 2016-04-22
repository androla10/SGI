$(function() {

	// var dispositivo = navigator.userAgent.toLowerCase();
	// console.log(dispositivo.search(/iphone|ipod|ipad|android/));
	// if (dispositivo.search(/iphone|ipod|ipad|android/) === -1) {
	// $('.aside').hover(function() {
	// $('.palabra').css('display', 'inline-block');
	// $(this).css('width', '180px');
	// $('body').css('padding-left', '180px');
	// }, function() {
	// // vuelve a dejar el <div> como estaba al hacer el "mouseout"
	// $('.palabra').css('display', 'none');
	// $(this).css('width', '50px');
	// $('body').css('padding-left', '50px');
	// });
	// }
	
	 $('#formRegistroUsuario').formValidation({
	        framework: 'bootstrap',
	        icon: {
	            valid: 'glyphicon glyphicon-ok',
	            invalid: 'glyphicon glyphicon-remove',
	            validating: 'glyphicon glyphicon-refresh'
	        },
	        fields: {
	            'usuario.nombre': {
	                validators: {
	                    notEmpty: {
	                        message: 'El campo nombre es requerido'
	                    },
	                    stringLength: {
	                        min: 2,
	                        max: 35,
	                        message: 'Solo puede aceptar nombres desde 2 a 30 caracteres'
	                    },
	                    regexp: {
	                        regexp: /^[a-zA-Z\s]+$/,
	                        message: 'El nombre solo debe contener letras'
	                    }
	                }
	            },
	            'usuario.apellido': {
	            	validators: {
	                    notEmpty: {
	                        message: 'El campo apellido es requerido es requerido'
	                    },
	                    stringLength: {
	                        min: 6,
	                        max: 35,
	                        message: 'Solo puede aceptar apellidos desde 6 a 30 caracteres'
	                    },
	                    regexp: {
	                        regexp: /^[a-zA-Z\s]+$/,
	                        message: 'El nombre solo debe contener letras'
	                    }
	                }
	            },
	            'size[]': {
	                validators: {
	                    notEmpty: {
	                        message: 'The size is required'
	                    }
	                }
	            },
	            availability: {
	                validators: {
	                    notEmpty: {
	                        message: 'The availability option is required'
	                    }
	                }
	            }
	        }
	    });

});