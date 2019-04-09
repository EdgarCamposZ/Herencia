package declaracion;

import java.util.Scanner; 


public class Declaracion { 

private final static String laChicaQueMeGusta = "Mirna"; //escribe el nombre de tu chica dentro de las comillas 
private final static String miNombre = "Edgar"; //escribe tu nombre dentro de las comillas 

public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
String opc = ""; 

try { 
System.out.println("Hola :D"); 

do { 
System.out.println("Como te llamas? n_n"); 
opc = sc.next(); 


if(!opc.toLowerCase().equals( laChicaQueMeGusta.toLowerCase() )) { 
System.out.println("No me mientas e_e"); 
Thread.sleep(2000); 
} 

}while(!opc.toLowerCase().equals( laChicaQueMeGusta.toLowerCase() )); 

for(int i = 0; i < 5; i++) { 
Thread.sleep(200); 
System.out.print("."); 
} 

System.out.println("Ya lo sabia xD"); 
opc = ""; 
Thread.sleep(2000); 

do { 
System.out.println("Adivina quien soy :D"); 
opc = sc.next(); 

if(!opc.toLowerCase().equals( miNombre.toLowerCase() )) { 
System.out.println("No, ese no es mi nombre, adivina otra vez ¬¬"); 
Thread.sleep(2000); 
} 
}while(!opc.toLowerCase().equals( miNombre.toLowerCase() )); 

for(int i = 0; i < 5; i++) { 
Thread.sleep(200); 
System.out.print("."); 
} 

System.out.println("Adivinaste :D"); 

Thread.sleep(2000); 

System.out.println(laChicaQueMeGusta + ": Soy " + miNombre + " y quiero decirte lo siguiente:"); 

for(int i = 0; i < 5; i++) { 
Thread.sleep(200); 
System.out.print("."); 
} 

System.out.println(); 
Thread.sleep(2000); 

System.out.println(""); //Escribe toda tu declaracion en las comillas 

} catch(Exception e) {} 
} 
}
