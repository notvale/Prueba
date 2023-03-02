package com.generation.pruebaintento2.models;

public class Colegio {

//atributos
public String jornada;


//constructores
public Colegio() {
}

public Colegio(String jornada) {
    this.jornada = jornada;
}

//getter and setters

public String getJornada() {
    return jornada;
}

public void setJornada(String jornada) {
    this.jornada = jornada;
}

//métodos

@Override
public String toString() {
    return "Colegio [jornada=" + jornada + "]";
}

public void mision(){
    System.out.print("La misión del colegio es educar a personas de bien");
}

}
