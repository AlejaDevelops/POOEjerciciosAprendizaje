
package E12EdadPersona;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author AlejaDevelops
 */
public class PersonaService {
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        Persona persona1 = new Persona();
        System.out.println("¿Cuál es tu nombre?");
        persona1.setNombre(leer.nextLine());
        System.out.println("Ingresa tu día de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingresa tu mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingresa tu año de nacimiento");
        int anio = leer.nextInt();
        Date fechaNac = new Date(anio-1900,mes-1,dia);
        persona1.setFechaNacimiento(fechaNac);
        
        return persona1;
    }
    
    public void calcularEdad(Persona a){
        Date hoy = new Date ();
        int edad;
        
        if (true) {
            
        } else {
        }
        
        //System.out.println("La edad de "+a.getNombre()+" es "+hoy.getYear()- a.getFechaNacimiento().getYear());
    }
    
}
