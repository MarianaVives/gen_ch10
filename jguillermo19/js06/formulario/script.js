console.log("Sesión Js06");

function obtenerFormulario(){
    let formulario = document.forms["formulario"];
    let concatenacion = "";
    for(let i of formulario){
        concatenacion = concatenacion + " " + i.value;
    }
    console.log(concatenacion);
}