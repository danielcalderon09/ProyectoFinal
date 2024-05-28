const nombre = document.getElementById("nombre-reserva");
const apellido = document.getElementById("apellido-reserva");
const telefono = document.getElementById("telefono-reserva");
const email = document.getElementById("email-reserva");
const checkbox = document.getElementById("privacidad-reserva");

const alertNombre = document.getElementById("alert-reserva-nombre");
const alertTelefono = document.getElementById("alert-reserva-telefono");
const alertEmail = document.getElementById("alert-reserva-email");
const alertCheckbox = document.getElementById("alert-checkbox");

const alertNombreText = "Por favor ingresar nombre";
const alertTelefonoText = "Por favor ingresar telefono";
const alertEmailText = "Por favor ingresar email";
const alertCheckboxlText = "Por favor aceptar los terminos";

const btnReservaFinal = document.getElementById("btn-reserva-final");


btnReservaFinal.addEventListener("click", (e) => {
    e.preventDefault();
  
    if (nombre.value === "") {
      alertNombre.textContent = alertNombreText;
    } else {
      alertNombre.textContent = "";
    }
  
    if (telefono.value === "") {
      alertTelefono.textContent = alertTelefonoText;
    } else {
      alertTelefono.textContent = "";
    }
  
    if (email.value === "") {
      alertEmail.textContent = alertEmailText;
    } else {
      alertEmail.textContent = "";
    }
  
    if (!checkbox.checked) {
      alertCheckbox.textContent = alertCheckboxText;
    } else {
      alertCheckbox.textContent = "";
    }
  
    if (nombre.value !== "" && telefono.value !== "" && email.value !== "" && checkbox.checked) {
      
    }
  });



