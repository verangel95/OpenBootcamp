
// A continuacion la sintaxis:

// Array.array.forEach((item,index,array) => {contenido de la funcion flecha});
    




const letras = ["a","b","c","a","a","c"]

let b = {}

letras.forEach(item =>{
    if (b[item]){
        b[item]++
    }else{
        b[item]=1;
    }
})

console.log(b);


const numeros = [1,2,4,6,8,13,15,18,24];
let par = 0;
let impar = 0;

numeros.forEach(item => {
    if (item % 2 === 0){
        par++;
    } else{
        impar++;
    }
})

console.log("Los numeros pares son "+ par, "\n" + "los numeros impares son " + impar)