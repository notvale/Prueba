package com.generation.pruebaintento2.models;

public class Profesor extends Colegio{
    
//atributos

public String nombreProfesor; 
public Integer sueldo;
public Integer horasPedagogicas;

//constructores

public Profesor() {
    super();
}



public Profesor(String jornada, String nombreProfesor, Integer sueldo, Integer horasPedagogicas) {
    super(jornada);
    this.nombreProfesor = nombreProfesor;
    this.sueldo = sueldo;
    this.horasPedagogicas = horasPedagogicas;
}




//Getter and setters



public String getNombreProfesor() {
    return nombreProfesor;
}

public void setNombreProfesor(String nombreProfesor) {
    this.nombreProfesor = nombreProfesor;
}

public Integer getSueldo() {
    return sueldo;
}

public void setSueldo(Integer sueldo) {
    this.sueldo = sueldo;
}

public Integer getHorasPedagogicas() {
    return horasPedagogicas;
}

public void setHorasPedagogicas(Integer horasPedagogicas) {
    this.horasPedagogicas = horasPedagogicas;
}


//métodos

@Override
public String toString() {
    return super.toString() + "Profesor [nombreProfesor=" + nombreProfesor + ", sueldo=" + sueldo + ", horasPedagogicas="
            + horasPedagogicas + "]";
}



}
