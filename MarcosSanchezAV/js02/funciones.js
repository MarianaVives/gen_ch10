function suma() {
   let x = document.getElementById("input1").value, y = document.getElementById("input2").value;
   let result = parseInt(x) + parseInt(y);
   document.getElementById("Resultado").innerHTML = result;
}

function resta() {
   let x = document.getElementById("input1").value, y = document.getElementById("input2").value;
   let result = parseInt(x) - parseInt(y);
   document.getElementById("Resultado").innerHTML = result;
}

function multiplicacion() {
   let x = document.getElementById("input1").value, y = document.getElementById("input2").value;
   let result = parseInt(x)*parseInt(y);
   document.getElementById("Resultado").innerHTML = result;
}

function division() {
      let x = document.getElementById("input1").value, y = document.getElementById("input2").value;
      let result = parseInt(x)/parseInt(y);
      document.getElementById("Resultado").innerHTML = result;
}

