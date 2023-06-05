





$(function() {
  $("#contactForm").submit(function(event) {
    event.preventDefault();

    var name = $("#name").val();
    var email = $("#email").val();
    var subject = $("#subject").val();
    var message = $("#message").val();

    $this = $("#sendMessageButton");
    $this.prop("disabled", true);

    // Aquí puedes realizar acciones con los valores ingresados en el formulario
    // Por ejemplo, mostrarlos en una alerta
    alert("Nombre: " + name + "\nEmail: " + email + "\nSujeto: " + subject + "\nMensaje: " + message);

    // Luego puedes restablecer el formulario
    $("#contactForm")[0].reset();

    // Habilitar el botón de enviar después de un tiempo
    setTimeout(function() {
      $this.prop("disabled", false);
    }, 1000);
  });




});

$("#name").focus(function() {
  $("#success").html("");
});

/*
$(function() {
  $("#contactForm").submit(function(event) {
    event.preventDefault();

    var name = $("#name").val();
    var email = $("#email").val();
    var subject = $("#subject").val();
    var message = $("#message").val();

    $.ajax({
      url: "https://api.emailjs.com/api/v1.0/email/send",
      type: "POST",
      data: JSON.stringify({
        service_id: "YOUR_SERVICE_ID",
        template_id: "YOUR_TEMPLATE_ID",
        user_id: "YOUR_USER_ID",
        template_params: {
          name: name,
          email: email,
          subject: subject,
          message: message
        }
      }),
      contentType: "application/json",
      dataType: "json",
      success: function(response) {
        $("#success").html('<div class="alert alert-success"><button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>Your message has been sent.</div>');
        $("#contactForm")[0].reset();
      },
      error: function(error) {
        $("#success").html('<div class="alert alert-danger"><button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>Sorry, there was an error sending your message. Please try again later.</div>');
      }
    });
  });

  $("#name, #email, #subject, #message").focus(function() {
    $("#success").html("");
  });
});

*/
