package taller;

public class Motor {
    // Atributos
    private boolean arrancado;
    
    // Constructor
    public Motor() {
        this.arrancado = false;
    }
    
    public Motor(boolean arrancado) {
        this.arrancado = arrancado;
    }
    
    // Getters y Setters
    public boolean estaArrancado() {
        return this.arrancado;
    }
    
    // Métodos
    public void arrancar() {
        this.arrancado = true;
    }
    
    public void parar() {
        this.arrancado = false;
    }
    
    
}
