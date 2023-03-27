
package Entidades;

/**
 *
 * @author AlejaDevelops
 */
public class E2Circunferencia {
    private double radio;
    double area;
    double perimetro;

    public E2Circunferencia() {
    }

    public E2Circunferencia(double radio, double area, double perimetro) {
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
    }
    
    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    

    @Override
    public String toString() {
        return "E2Circunferencia{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
