<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
   // Obtén los datos del formulario
   $nombre = $_POST['nombre'];
   $correo = $_POST['correo'];
   $fecha = $_POST['fecha'];
   $tiempo = $_POST['tiempo'];
   $servicio = $_POST['servicio'];

   // Construye el cuerpo del mensaje de correo
   $mensaje = "Nombre: $nombre\n";
   $mensaje .= "Correo: $correo\n";
   $mensaje .= "Fecha: $fecha\n";
   $mensaje .= "Tiempo: $tiempo\n";
   $mensaje .= "Servicio: $servicio\n";

   // Envía el correo electrónico
   $to = 'juandavidque123@gmail.com'; // Cambia esta dirección por el correo del empleado
   $subject = 'Nueva reserva de cita';
   $headers = "From: $correo\r\n" .
              "Reply-To: $correo\r\n" .
              "X-Mailer: PHP/" . phpversion();

   if (mail($to, $subject, $mensaje, $headers)) {
      // Envío de correo exitoso
      echo 'OK';
   } else {
      // Error al enviar el correo
      echo 'Error al enviar el correo';
   }
} else {
   // Acceso directo al archivo PHP, redirige a otra página o muestra un mensaje de error
   echo 'Acceso no autorizado';
}
?>
