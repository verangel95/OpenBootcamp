
function factorial(array){

let i = array.length - 1;
let f = 1;

while (i >= 0){ 

    f *= array[i];

    i--;

}

return f;

}

let numeros = [1,2,3,4,5,6,7,8,9,10];

console.log(factorial(numeros));