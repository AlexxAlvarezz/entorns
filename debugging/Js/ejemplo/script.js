// Declaración del contador
let contador = 0;

// Función para incrementar el contador
function incrementar() {
    contador = contador + 1; // Incrementa en 1
    document.getElementById('contador').innerText = contador;
}

function reiniciar() {
    const contador = 0; 
    document.getElementById('contador').innerText = contador;
}
