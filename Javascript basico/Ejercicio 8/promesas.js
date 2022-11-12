
// - Una función sin parámetros que devuelva siempre "true"
function hola(){
    return true;
}

//- Una función asíncrona que utilice un setTimeout y pase por consola un "Hola soy una promesa" 5 segundos después de haberse ejecutado



const miPromesa = new Promise((resolve, reject)=>{

    setTimeout(()=> {    
        if(true){
        resolve()
    }else{
        reject()
    }},5000)

})

miPromesa.then(()=> console.log("he tenido exito"));
miPromesa.catch(()=> console.log("he fracasado"));
miPromesa.finally(()=> console.log("Hola soy una promesa"));

//- Una función generadora de índices pares automáticos

function generadora (){
    let id=0;
    while(true){
        id+=2;
        if(id > 20){
            return
        }
        
    }
}

