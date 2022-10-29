
// factorial

function factorial(array) {
    
 let f = 1;

for (let i = array.length-1; i >= 0 ;i--) {

   f *= array[i];
}

return f;
}

let numeros = [1,2,3,4,5,6,7,8,9,10];

console.log(factorial(numeros));