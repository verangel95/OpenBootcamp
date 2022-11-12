let lista_compras= ["tomate","cebolla","repollo","zanahoria","tomate"];

lista_compras.push("Aceite de Girasol");

lista_compras.pop("Aceite de Girasol");

let peliculas= [{titulo: "Pulp fiction", director: "Quentin tarantino", fecha:new Date("12/12/1994")},
                {titulo: "origin", director: "Christopher Nolan", fecha:new Date("12/12/2012")},
                {titulo: "El viaje de Chihiro", director: "Hayao miyazaki", fecha:new Date("01/09/1999")}];


let mayor2010 = peliculas.filter(num => num.fecha.getFullYear() >= "2010");


let directores = peliculas.map(value => value.director);
let titulos = peliculas.map(value => value.titulo);

let concat = peliculas.map(value =>  `${value.director} es director de ${value.titulo}`);

let lista_concat1 = directores.concat(titulos);

let lista_concat2 = [[...directores],[...titulos]];


    console.log(lista_concat);