console.log("js07 apiFetch");

function busquedaUsuarios (page = 1){
    //console.log("Se activó el botón de búsqueda de usuarios");

    fetch(`https://reqres.in/api/users?page=${page}`)
    .then(response => response.json())
    .then (users => {
        console.log(users)
    }) 
    .catch( error => {
        console.log("la solicitud causó un error ", error);
    })
}