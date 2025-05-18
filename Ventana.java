package taller;

public class Ventana {
    // Atributos
    private boolean abierta;
    private boolean rota;  // Nuevo atributo

    // Constructores
    public Ventana() {
        this.abierta = false;
        this.rota = false;
    }

    public Ventana(boolean abierta, boolean rota) {
        this.abierta = abierta;
        this.rota = rota;
    }

    // Getters y setters
    public boolean estaAbierta() {
        return this.abierta;
    }

    public boolean estaRota() {
        return this.rota;
    }

    // Métodos
    public void abrir() {
        if (!rota) {
            this.abierta = true;
        } else {
            System.out.println("No se puede abrir una ventana rota.");
        }
    }

    public void cerrar() {
        this.abierta = false;
    }

  
  
}
