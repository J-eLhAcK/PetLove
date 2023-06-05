$(document).ready(function() {
  // Escucha el evento submit del formulario
  $('#agregarProductoForm').submit(function(event) {
    event.preventDefault(); // Evita la recarga de la página

    // Obtiene los valores de los campos del formulario
    var idProducto = $('#id_producto').val();
    var nombreProducto = $('#nombre').val();
    var descripcionProducto = $('#descripcion').val();

    // Crea un objeto con los datos del producto
    var producto = {
      id_producto: idProducto,
      nombre: nombreProducto,
      descripcion: descripcionProducto
    };

    // Realiza la petición AJAX para agregar el producto
    $.ajax({
      type: 'POST',
      url: '/agregarProducto',
      contentType: 'application/json',
      data: JSON.stringify(producto),
      success: function(response) {
        // Maneja la respuesta del servidor
        alert(response); // Muestra un mensaje de éxito o error
        $('#agregarProductoForm')[0].reset(); // Limpia el formulario
      },
      error: function(error) {
        // Maneja los errores de la petición
        alert('Error al agregar el producto');
      }
    });
  });
});
