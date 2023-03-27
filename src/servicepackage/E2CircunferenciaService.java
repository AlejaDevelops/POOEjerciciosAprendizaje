
package servicepackage;

import Entidades.E2Circunferencia;
import java.util.Scanner;

/**
 *
 * @author AlejaDevelops
 */
public class E2CircunferenciaService {
    
    public E2Circunferencia crearCircunferencia(){
        E2Circunferencia circunf1 = new E2Circunferencia();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el radio de la circunferencia");
        circunf1.setRadio(leer.nextDouble());
        
        return circunf1;
        
    }
    
    public void calcularArea(E2Circunferencia c){
        
        c.setArea(Math.PI*(Math.pow(c.getRadio(), 2)));
        System.out.println("El área de la circunferencia  de perimetro " + c.getRadio() + " es " + c.getArea());
        
    }
    
    public void calcularPerimetro(E2Circunferencia c){
        
        c.setPerimetro(2*Math.PI*c.getRadio());
        System.out.println("El perímtro de la circunferencia de radio " + c.getRadio()+ " es: " + c.getPerimetro());
    }
}
