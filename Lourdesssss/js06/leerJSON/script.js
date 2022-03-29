console.log("JS 06 Leer JSON");
/**
 * simple sintaxis of fetch =
 * Here we are fetching a JSON file across the network and printing it to the console
 */
fetch("colors.json")
.then((response) => response.json())
.then((data) => {
    console.log(data);
    console.log(Array.isArray(data.colors));

    let tBody = document.getElementById("tBody");
    tBody.innerHTML = "";
/**
 * 
 */
    for(let color of data.colors){
        console.log(color.color);
        tBody.innerHTML += `
        <tr>
          <td>${color.color}</td>
          <td>${color.category}</td>
          <td>${color.type ? color.type : "sin tipo"}</td>
          <td>${color.code.hex}</td>
        </tr>
        `;
    }
});