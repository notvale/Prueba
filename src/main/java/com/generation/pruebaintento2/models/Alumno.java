package com.generation.pruebaintento2.models;

import java.util.ArrayList;

public class Alumno extends Colegio {

//Atributos

//arrayList<Double> nota = new arrayList<Double>();

public String nombreAlumno;
public String curso;
public String materia;
ArrayList<Double> notasAlumnos = new ArrayList <Double>();


//public Alumno(String jornada) {
//    super(jornada);
//}


public Alumno(String jornada, String nombreAlumno, String curso, String materia, ArrayList<Double> notasAlumnos) {
    super(jornada);
    this.nombreAlumno = nombreAlumno;
    this.curso = curso;
    this.materia = materia;
    this.notasAlumnos = notasAlumnos;
}

//constructor que solo pide nombre de alumno para la funcion 2

public Alumno(String jornada, String nombreAlumno) {
    super(jornada);
    this.nombreAlumno = nombreAlumno;
}

//constructor nombre y jornada diurna

public Alumno(String nombreAlumno) {
    this.nombreAlumno = nombreAlumno;
}



public String getNombreAlumno() {
    return nombreAlumno;
}





public void setNombreAlumno(String nombreAlumno) {
    this.nombreAlumno = nombreAlumno;
}


public String getCurso() {
    return curso;
}


public void setCurso(String curso) {
    this.curso = curso;
}


public String getMateria() {
    return materia;
}


public void setMateria(String materia) {
    this.materia = materia;
}


public ArrayList<Double> getNotasAlumnos() {
    return notasAlumnos;
}


public void setNotasAlumnos(ArrayList<Double> notasAlumnos) {
    this.notasAlumnos = notasAlumnos;
}


@Override
public String toString() {
    return super.toString() + "Alumno [nombreAlumno=" + nombreAlumno + ", curso=" + curso + ", materia=" + materia + ", notasAlumnos="
            + notasAlumnos + "]";
}

public void desorden (){
    System.out.println("Me van a echar del colegio");
}






    
}
