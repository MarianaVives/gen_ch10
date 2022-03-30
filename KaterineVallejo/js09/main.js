//const { default: axios } = require("axios");

const { default: axios } = require("axios");

console.log("Estoy en js09 con NPM");

/* fetch("https://reqres.in/api/users?page=2")
.then ( (data) =>{ data.json()})
.then (dataJson => console.log)*/

//Para coparar fetch
fetch("https://reqres.in/api/users", {
  method: "POST",
  body: {
    name: "Manuel",
    job: "Torres",
  },
})
  .then((response) => response.json())
  .then((data) => {
    console.log("Success: ", data);
  })
  .catch((error) => {
    console.error("Error: ", error);
  });
//Para coparar fetch

axios.get("https://reqres.in/api/users?page=2")
.then (res => console.log(res))

axios.post("https://reqres.in/api/users",
{
    name: "Manuel",
    job: "Torres",
  }
)
.then(response => console.log(response))
.catch ((error) => console.log(error));