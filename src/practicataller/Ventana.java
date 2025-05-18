
package taller;


public class Ventana {
    // Atributos
    private boolean abierta;
    
    // Constructores
    public Ventana() {
        this.abierta = false;
    }
    
    public Ventana(boolean abierta) {
        this.abierta = abierta;
    }
    
    // Getters y setters
    public boolean estaAbierta() {
        return this.abierta;
    }
    
    
    // Métodos
    public void abrir() {
        this.abierta = true;
    }
    
    public void cerrar() {
        this.abierta = false;
    }
    
}
