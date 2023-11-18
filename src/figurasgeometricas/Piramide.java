/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author Sebastián
 */
public class Piramide extends FiguraGeometrica {
    
    private double base; /* Atributo que identifica la base de una
    pirámide */
    private double altura; /* Atributo que identifica la altura de una
    pirámide */
    private double apotema; /* Atributo que identifica el apotema de
    una pirámide */
    
    public Piramide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        this.setVolumen(calcularVolumen()); /* Calcula el volumen y
        establece su atributo */
        this.setSuperficie(calcularSuperficie()); /* Calcula la superficie y
        establece su atributo */
    }
    
    public double calcularVolumen() {
        double volumen = (Math.pow(base, 2.0) * altura) / 3.0;
        return volumen;
    }
    
    public double calcularSuperficie() {
        double áreaBase = Math.pow(base, 2.0);
        double áreaLado = 2.0 * base * apotema;
        return áreaBase + áreaLado;
    }
    
}
