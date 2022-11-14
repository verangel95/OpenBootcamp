
function secuencia(num){
    let n = 1;
    let array =[1];
    for(let i = 1; i < num; i++){
        array.push(n)
       n = array[i-1] + n 
    }

    return array;
}


console.log(secuencia(6)); 