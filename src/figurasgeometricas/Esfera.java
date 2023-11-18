/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author Sebastián
 */
public class Esfera extends FiguraGeometrica {
    
    private double radio; // Atributo que identifica el radio de una esfera
    
    public Esfera(double radio) {
        this.radio = radio;
        this.setVolumen(calcularVolumen()); /* Calcula el volumen y
        establece su atributo */
        this.setSuperficie(calcularSuperficie()); /* Calcula la superficie y
        establece su atributo */
    }
    
    public double calcularVolumen() {
        double volumen = 1.333 * Math.PI * Math.pow(this.radio, 3.0);
        return volumen;
    }
    
    public double calcularSuperficie() {
        double superficie = 4.0 * Math.PI * Math.pow(this.radio, 2.0);
        return superficie;
    }
}
