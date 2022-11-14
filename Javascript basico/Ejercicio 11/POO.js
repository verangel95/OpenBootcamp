

class Estudiante{

    _nombre;
    _asignaturas = ["Javascript", "HTML", "CSS"];

     obtenDatos(){
        console.log(this._asignaturas,this._nombre);
    }

    setnombre(nombre){
this._nombre = nombre;
    }
}


const alumno = new Estudiante;

alumno.setnombre("Juan");

alumno.obtenDatos();