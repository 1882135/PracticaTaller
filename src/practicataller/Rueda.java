
package taller;

public class Rueda {
    // Atributos
    private double presion;
    
    // Constructores
    public Rueda() {
        this.presion = 0.0;
    }
    
    public Rueda(double presion) {
        this.presion = presion;
    }
        
    // Getters y setters
    public double getPresion() {
        return this.presion;
    }
    
    public void setPresion(double valor) {
        this.presion = valor;
    }
    
    // Métodos
    public void inflar() {
        this.presion += 0.5;    
    }
    
    public boolean desinflar() {
        if (this.presion - 0.5 <= 0) {
            this.presion = 0;
            return false;
        } else {
            this.presion -= 0.5;
            return true;
        }
    }
    
}
