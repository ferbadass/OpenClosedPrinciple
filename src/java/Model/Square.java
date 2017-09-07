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
public class Square extends Shape {
    /**
    *Constructor
    */
    public Square(double side) {
        super(side);
    }
    /**
     * 
     * @return Area
     */
    public double area(){
        return side*side;
    }
    /**
     * 
     * @return Perimetro
     */
    public double perimeter()
    {
        return side*4;
    }
}
