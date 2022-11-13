function suma (a,b){

    if(typeof a !== "number" || typeof b !== "number"){
        throw new Error("El valor debe ser numerico")
    }else{
        
        return a+b;
    }
}


try {

    console.log("Esta bien");
    console.log(suma(2,4));
} catch (e) {
    console.log(e)
}