/**
 * Write a description of class Biblioteca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Biblioteca
{
   public static void main ( String argv[]){
       
       Collection<Libro> disponibles = new ArrayList<Libro>();
       Collection<Libro> prestados = new ArrayList<Libro>();
       try (Scanner sc = new Scanner(System.in)) {
		// Rellenar las listas con valores de prueba
		   Libro nuevo = new Libro(19,"El Quijote"," Cervantes", Genero.NOVELA, 2012);
		   
		   disponibles.add(nuevo);
		   disponibles.add(new Libro(20,"El Buscón","Quevedo",Genero.NOVELA,1997));
		   disponibles.add(new Libro(21,"Romeo y Julieta","Shakespeare ",Genero.TEATRO,1997));
		   disponibles.add(new Libro(22,"Mio Cid","Anónimo",Genero.POESIA,1989));
   
		   prestados.add( new Libro(30,"Harry Potter I", "J. K. Rowling", Genero.NOVELA,1998));
		   prestados.add( new Libro(34,"Guerra y Paz","León Tolstói",Genero.NOVELA,1975));
		   prestados.add( new Libro(49,"El Decamerón","Giovanni Boccaccio",Genero.CUENTOS,1992));
		  
		   * Write a description of class Biblioteca here.

import java.util.ArrayList;

public class Biblioteca
{
   public static void main ( String argv[]){
       
       Collection<Libro> disponibles = new ArrayList<Libro>();
       Collection<Libro> prestados = new ArrayList<Libro>();
       try (Scanner sc = new Scanner(System.in)) {
		// Rellenar las listas con valores de prueba
		   Libro nuevo = new Libro(19,"El Quijote"," Cervantes", Genero.NOVELA, 2012);
		   
		   disponibles.add(nuevo);
		   disponibles.add(new Libro(20,"El Buscón","Quevedo",Genero.NOVELA,1997));
		   disponibles.add(new Libro(21,"Romeo y Julieta","Shakespeare ",Genero.TEATRO,1997));
		   disponibles.add(new Libro(22,"Mio Cid","Anónimo",Genero.POESIA,1989));
   
		   prestados.add( new Libro(30,"Harry Potter I", "J. K. Rowling", Genero.NOVELA,1998));
		   prestados.add( new Libro(34,"Guerra y Paz","León Tolstói",Genero.NOVELA,1975));
		   prestados.add( new Libro(49,"El Decamerón","Giovanni Boccaccio",Genero.CUENTOS,1992));
		  
		  
		   // Pedir datos al usuarios y probar el método prestarLibro
		   System.out.println(" ¿Que libro desea?:");
		   String titulo = sc.nextLine();
		   int resu = prestarLibro(titulo,prestados,disponibles);
		   if ( resu == 0) System.out.println("El libro no está en el catalogo");
		      else if ( resu == -1) System.out.println("El libro está prestado");
		        else System.out.println("Su pestamo ha sido anotado");
	}
       
    }
   
   public static Libro buscarId(Collection <Libro> ar, String titulo) {
	
	   for ( Libro libro: ar) {
		    if ( libro.titulo.equals(titulo)){
		    	return libro;
		    }
	   }
	   return null;
   }
   
   public static void verCatalogo (ArrayList <Libro> lista) {
	   for (int i=0; i < lista.size();i++) {
		   System.out.println((i+1) + ":" + lista.get(i));
	   }
   }
   
   /*
    * Devuelve:
    * 0 si no existe el libro en niguna de la listas
    * 1 Si puede prestarlo, el libro pasa de ldisponibles a lprestados
    * -1 Si ya esta prestado.
    * 
    * 
    */
   public static int prestarLibro ( String titulo, Collection<Libro> prestados, Collection<Libro> disponibles){
   
      Libro idprestado    = buscarId(prestados,titulo);
      Libro iddisponible  = buscarId(disponibles,titulo);
      
      if ( idprestado == null && iddisponible == null) return 0; // No esta en catalogo
      if ( idprestado !=  null)  return -1; // Esta prestado
      
      Libro libroencontrado = iddisponible;
      disponibles.remove(libroencontrado);
      prestados.add(libroencontrado);
      return 1;
    }
      
 } 
    
		   // Pedir datos al usuarios y probar el método prestarLibro
		   System.out.println(" ¿Que libro desea?:");
		   String titulo = sc.nextLine();
		   int resu = prestarLibro(titulo,prestados,disponibles);
		   if ( resu == 0) System.out.println("El libro no está en el catalogo");
		      else if ( resu == -1) System.out.println("El libro está prestado");
		        else System.out.println("Su pestamo ha sido anotado");
	}
       
    }
   
   public static Libro buscarId(Collection <Libro> ar, String titulo) {
	
	   for ( Libro libro: ar) {
		    if ( libro.titulo.equals(titulo)){
		    	return libro;
		    }
	   }
	   return null;
   }
   
   public static void verCatalogo (ArrayList <Libro> lista) {
	   for (int i=0; i < lista.size();i++) {
		   System.out.println((i+1) + ":" + lista.get(i));
	   }
   }
   
   /*
    * Devuelve:
    * 0 si no existe el libro en niguna de la listas
    * 1 Si puede prestarlo, el libro pasa de ldisponibles a lprestados
    * -1 Si ya esta prestado.
    * 
    * 
    */
   public static int prestarLibro ( String titulo, Collection<Libro> prestados, Collection<Libro> disponibles){
   
      Libro idprestado    = buscarId(prestados,titulo);
      Libro iddisponible  = buscarId(disponibles,titulo);
      
      if ( idprestado == null && iddisponible == null) return 0; // No esta en catalogo
      if ( idprestado !=  null)  return -1; // Esta prestado
      
      Libro libroencontrado = iddisponible;
      disponibles.remove(libroencontrado);
      prestados.add(libroencontrado);
      return 1;
    }
      
 } 
    
