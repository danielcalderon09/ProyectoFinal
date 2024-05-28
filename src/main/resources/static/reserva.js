


const reserva = document.getElementById("reserva-1");
const habitaciones = document.getElementById("habitaciones");
const tarjetaReserva = document.getElementById("tarjeta-reserva");
const habitacion2camas = document.getElementById("habitacion-2-camas")
const habitacion1cama = document.getElementById("habitacion-1-cama")


const cantidadPersonas = document.getElementById("cantidad-personas");
const checkIn = document.getElementById("check-in");
const checkOut = document.getElementById("check-out");
const alertCheckIn = document.getElementById("alert-check-in");
const alertCheckOut = document.getElementById("alert-check-out");
const alertPersonas = document.getElementById("alert-personas");
const alertCheckInText = "Por favor seleccione una fecha de check-in";
const alertCheckOutText = "Por favor seleccione una fecha de check-out";
const alertPersonasText = "Por favor seleccione el número de personas";


const tarjeta1 = document.getElementById("tarjeta-1");
const tarjeta2 = document.getElementById("tarjeta-2");
const tarjeta3 = document.getElementById("tarjeta-3");

const btnReserva = document.getElementById("btn-reserva-1");
const btnSeleccionar = document.getElementById("btn-seleccionar");
const btnSeleccionar2 = document.getElementById("btn-seleccionar-2");
const btnTarjeta1 = document.getElementById("btn-tarjeta-1");
const btnTarjeta2 = document.getElementById("btn-tarjeta-2");
const btnTarjeta3 = document.getElementById("btn-tarjeta-3");


checkIn.addEventListener("input", () => {
  const minDate = new Date(checkIn.value);
  minDate.setDate(minDate.getDate() + 1);
  checkOut.min = minDate.toISOString().split("T")[0];
});


checkOut.disabled = true;
checkIn.addEventListener("change", () => {
  if (checkIn.value !== "") {
    checkOut.disabled = false;
  } else {
    checkOut.disabled = true;
  }
});



btnReserva.addEventListener("click", (e) => {
  e.preventDefault();

  if (checkIn.value === "") {
    alertCheckIn.textContent = alertCheckInText;
  } else {
    alertCheckIn.textContent = "";
  }


  if (checkOut.value === "") {
    alertCheckOut.textContent = alertCheckOutText;
  } else {
    alertCheckOut.textContent = "";
  }

  if (cantidadPersonas.selectedIndex === 0) {
    alertPersonas.textContent = alertPersonasText;
  } else {
    alertPersonas.textContent = "";
  }

  if (checkIn.value !== "" && checkOut.value !== "" && cantidadPersonas.selectedIndex !== 0) {
    habitaciones.classList.add("active");
  }
});

btnSeleccionar.addEventListener("click", () => {
  tarjetaReserva.classList.add("active");
});


btnSeleccionar2.addEventListener("click", () => {
  
tarjetaReserva.classList.add("active");
});


btnSeleccionar.addEventListener('click', () => {
  btnSeleccionar.textContent = 'Seleccionado';
  btnSeleccionar.style.backgroundColor = 'orange';
  btnSeleccionar.style.color = 'white';
  habitacion2camas.classList.add('seleccionado');
  playSound();
});

btnSeleccionar2.addEventListener('click', () => {
  btnSeleccionar2.textContent = 'Seleccionado';
  btnSeleccionar2.style.backgroundColor = 'orange';
  btnSeleccionar2.style.color = 'white';
  habitacion1cama.classList.add('seleccionado');
  playSound();
});

function playSound() {
  const audio = new Audio('./audio/sonido-seleccion.mp3');
  audio.play();
}

btnTarjeta1.addEventListener('click', () => {
  btnTarjeta1.textContent = 'Seleccionado';
  btnTarjeta1.style.backgroundColor = 'orange';
  btnTarjeta1.style.color = 'white';
  tarjeta1.classList.add('seleccionado');
  playSound();
});

btnTarjeta2.addEventListener('click', () => {
  btnTarjeta2.textContent = 'Seleccionado';
  btnTarjeta2.style.backgroundColor = 'orange';
  btnTarjeta2.style.color = 'white';
  tarjeta2.classList.add('seleccionado');
  playSound();
});

btnTarjeta3.addEventListener('click', () => {
  btnTarjeta3.textContent = 'Seleccionado';
  btnTarjeta3.style.backgroundColor = 'orange';
  btnTarjeta3.style.color = 'white';
  tarjeta3.classList.add('seleccionado');
  playSound();
});
