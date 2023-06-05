$(document).ready(function() {
  //LISTAR PRODUCTOS
  $.ajax({
    url: 'http://localhost:8080/ListarProducto',
    type: 'GET',
    dataType: 'json',
    success: function(data) {
      var productosTable = $('#productosTable tbody');

      // Limpiar la tabla antes de agregar los nuevos productos
      productosTable.empty();

      // Iterar sobre los productos y agregar filas a la tabla
      $.each(data, function(index, producto) {
        var row = $('<tr></tr>');
        row.append('<td>' + producto.id_producto + '</td>');
        row.append('<td>' + producto.nombre_producto + '</td>');
        row.append('<td>' + producto.descripcion_producto + '</td>');

        productosTable.append(row);
      });
    },
    error: function() {
      alert('Error al obtener los productos.');
    }
  });

    //Agregar proximamente...
    $('#formularioAgregarProducto').submit(function(e) {
        e.preventDefault(); // Evita que el formulario se envíe de forma convencional

        var idUsuario = $('input[name="idUsuario"]').val();
        var idInventario = $('input[name="idInventario"]').val();
        var producto = {
            id_producto: $('input[name="id_producto"]').val(),
            nombre: $('input[name="nombre"]').val(),
            // Otros campos del producto
        };

        $.ajax({
            url: "http://localhost:8080/agregarProducto/"+idUsuario+"/"+idInventario+"?id_producto="+id_producto+"&nombre="+nombre,
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(producto),
            success: function(response) {
                // Manejar la respuesta del servidor
                alert(response);
            },
            error: function(xhr, status, error) {
                // Manejar el error
                console.error(error);
            }
        });
    });


});
