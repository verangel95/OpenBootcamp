let datos= {
    nombre:"jose", 
    apellido: "vergara", 
    edad: "27", 
    altura: "184cm", 
    eresDesarrollador: "si"
}



let edad = datos.edad;

let lista = [
    datos,

    {    nombre:"ed", 
    apellido: "montes", 
    edad: "28", 
    altura: "180cm", 
    eresDesarrollador: "no"},

    {    nombre:"luijo", 
    apellido: "serpa", 
    edad: "25", 
    altura: "175cm", 
    eresDesarrollador: "no"}
]


let ordenado = lista.sort((a,b) => a.edad - b.edad)


console.log(ordenado);