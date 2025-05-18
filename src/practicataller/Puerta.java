
package taller;

public class Puerta {
    // Atributos
    private Ventana ventana;
    private boolean abierta;
    
    
    // Constructores
    public Puerta() {
        this.ventana = new Ventana();
        this.abierta = false;
    }
    
    public Puerta(boolean abierta) {
        this();
        this.abierta = abierta;
    }
    
    public Puerta(Ventana ventana, boolean abierta) {
        this.ventana = ventana;
        this.abierta = abierta;
    }
    
    
    // Getters y setters
    public Ventana getVentana() {
        return this.ventana;
    }
    
    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }
    
    public boolean estaAbierta() {
        return this.abierta;
    }
    
    // Métodos de instancia
    public void abrir(int angulo) {
        this.abierta = true;
    }
    
    public void cerrar() {
        this.abierta = false;
    }
    
    
}
