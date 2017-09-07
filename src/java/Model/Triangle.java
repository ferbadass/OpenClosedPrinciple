/**
 * Alumno: Miranda Sanchez Maria Fernanda
 * Grupo: 5IM8.
 * Version 1.0
 * Fecha: 06/09/2017
 */
package Model;

/**
 *
 * @author Fernanda
 */
public class Triangle extends Shape{
    /**
    *Constructor
    */
    public Triangle(double side) {
        super(side);
    }
    /**
     * 
     * @return Area
     */
    public double area(){
        return Math.sqrt(3) * Math.pow(side, 2)/4;
    }
    /**
     * 
     * @return Perimetro
     */
    public double perimeter()
    {
        return side*3;
    }
}
