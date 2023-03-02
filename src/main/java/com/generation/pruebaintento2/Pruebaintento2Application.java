package com.generation.pruebaintento2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.pruebaintento2.models.Alumno;
import com.generation.pruebaintento2.models.Colegio;
import com.generation.pruebaintento2.models.Profesor;

@SpringBootApplication
public class Pruebaintento2Application {

/*
 * ************************MENSAJE PAME ALE: *****************************************
 * ****NO PUDE TERMINAR PERO DEJE COMENTARIOS CON MIS IDEAS NO RESUELTAS**************
 */

//1. Función promedio

	public static void fxpromedio(ArrayList<Double> notasAlumnos){
	Double suma = 0.0;
	Double resultado = 0.0;

	for (int i= 0; i<= notasAlumnos.size()-1; i++){
		suma = suma + notasAlumnos.get(i);
		resultado = suma/notasAlumnos.size();
	}
	
	System.out.println("El promedio es: " + resultado);
}

//2. Fx que permita guardar un arreglo de una cierta cantidad de alumnos por curso y que luego los muestre.

//tendría que haber puesto el atributo nombre como array (en el objeto alumno) para poder hacer una funcion
//con el parametro ArrayList<String> y así poder guardar los datos de los nombres en un array y mostrarlo.

//3. Fx que que dado un arreglo de notas obtenga la mejor nota, la peor nota y el promedio de notas.

//Puedo recorrer el array creado para la función 1 y comparar indice por indice.

/* 
for(int i=1; i<= arrayNotas.size()-1; i++){
	if((arrayNotas.get(i))<(arrayNotas.get(i-1))){
	peornota= arrayNotas.get(i);
	}else{
		mejornota=arrayNotas.get(i);
	}	
}
System.out.print("La peor nota es: " + peornota);
System.out.println("La mejor nota es: "+mejornota);
*/

 



	public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);
	
//Creación de objetos

//objeto 1: colegio

Colegio colegioDefault = new Colegio();
Colegio colegioDatos = new Colegio(null);

//objeto 2: profesor

Profesor profesorDefault = new Profesor();
Profesor profesorDatos = new Profesor(null, null, null, null);


//objeto 3: alumno

Alumno alumnoDefault = new Alumno(null);
Alumno alumnoDatos = new Alumno(null, null, null, null, null);
Alumno alumnoNombre = new Alumno(null, null);

//alumno con solo datos da nombre
Alumno alumnoNombreDiurno = new Alumno(null, null);



//solicitar datos al usuario

int condicion =0;
int inQAlumnos =0;
int inQNotas =0;

System.out.println("******Bienvenidos al sistema Libro de clases digital******");
System.out.println(" ");


do{
System.out.print("Por favor, ingrese cantidad de alumnos que desea registrar: ");
inQAlumnos = teclado.nextInt();

if(inQAlumnos <= 0 ){
	System.out.print("La cantidad de alumnos no puede ser 0. Ingrese otro número, por favor. ");
}
}while(inQAlumnos <=0);

do{
System.out.print("Ingrese cantidad de notas que asignará a cada alumno: ");
inQNotas =teclado.nextInt();
if(inQNotas <= 0){
	System.out.print("La cantidad de notas debe ser mayor a 0. Ingrese otro número, por favor.");
}
}while(inQNotas<=0);

//se realiza ciclos for para ingresar los datos de la cantidad de alumnos que indique el usuario.

ArrayList <Double> arrayNotas = new ArrayList<Double>();

for(int i=1; i<=inQAlumnos; i++){
	System.out.println("Por favor, ingrese datos del alumno "+i);

//DUDA: no se porque no me guarda el dato de materia. Si lo comento, no me guarda el dato de curso, como si hubiera un limite de teclados en el for (?)

	System.out.println("Materia: ");
	String inmateria = teclado.nextLine();
	
	System.out.print("Curso: ");
	String incurso = teclado.nextLine();

	System.out.print("Nombre de alumno: ");
	String inNombreAlumno = teclado.nextLine();

//agregar datos al objeto
	alumnoDatos.setMateria(inmateria);
	alumnoDatos.setCurso(incurso);
	alumnoDatos.setNombreAlumno(inNombreAlumno);
	
for(int x=1; x<=inQNotas; x++){
		System.out.print("Ingrese nota " + x +" de " +inQNotas  +" (valor entero) al alumno "+inNombreAlumno+ ": " );
		Double inNotasAlumno = teclado.nextDouble();	
		arrayNotas.add(inNotasAlumno);

      
}

System.out.println("");
fxpromedio(arrayNotas);
System.out.println("");
alumnoDatos.setNotasAlumnos(arrayNotas);
System.out.println(alumnoDatos);
System.out.println("");
arrayNotas.clear();
}//cierre de ambos for.


//fx dos : Fx que permita guardar un arreglo de una cierta cantidad de alumnos por curso y que luego los muestre.
//quería completar dos objetos de alumnos del mismo curso, uno con jornada diruna y otro vespertino. pero el for 
//no me está funcionando porque me solicita algunas jornadas juntas.


System.out.println("");
System.out.println("Por favor, ingrese la cantidad de alumnos de un mismo curso que quiere ingresar");
int inAlumnos2 = teclado.nextInt();

for( int i=1 ; i<= inAlumnos2; i++){
	
System.out.println("Ingrese jornada del alumno( diurna o vespertina)");
String inJornada = teclado.nextLine();
System.out.println("Ingrese el nombre del alumno");

if(inJornada.equals("diurna")){
	
	System.out.println("Ingrese el nombre del alumno");
	String inNombre2 = teclado.nextLine();
	alumnoNombreDiurno.setNombreAlumno(inNombre2);
	alumnoNombreDiurno.setJornada(inJornada);

}else if (inJornada.equals("vespertina")){
System.out.println("Ingrese el nombre del alumno");
String inNombreVespertino =teclado.nextLine();
alumnoNombre.setNombreAlumno(inNombreVespertino);
alumnoNombre.setJornada(inJornada);
}

}//cierre del for
System.out.println(alumnoNombreDiurno);
System.out.println(alumnoNombre);


// FX 3

//ArrayList <Double> arrayFx3 = new ArrayList<Double>();
System.out.println("Por favor ingrese la cantidad de notas");
int inNotasFx3 = teclado.nextInt();
Double arrayFx3 [] = new Double [inNotasFx3];


for(int i=1; i<inNotasFx3; i++){
	System.out.println("Ingrese nota" + i + ": ");
	arrayFx3 [i] =teclado.nextDouble();

}

Double mayor=0.0;
Double menor = 0.0;

mayor =menor = arrayFx3[0];

for (int i= 0; i <= inNotasFx3; i++){
	if ((arrayFx3 [i]) > mayor){
		mayor = arrayFx3 [i];
	}else if((arrayFx3[i]<menor)){
		menor = arrayFx3[i];
	}
	System.out.println("La nota más alta es: " +mayor);
	System.out.println("La nota más baja es: "+menor);

}


	}
}









	

