// script.js

function verificarResposta() {
    const resposta = document.getElementById("resposta").value;
    const resultado = document.getElementById("resultado");

    // Vamos considerar 2 litros por dia como resposta correta
    if (resposta == 2) {
        resultado.textContent = "Correto! 💧 Uma pessoa deve beber cerca de 2 litros de água por dia.";
        resultado.style.color = "green";
    } else {
        resultado.textContent = "Tente novamente! A resposta correta é cerca de 2 litros.";
        resultado.style.color = "red";
    }
}
