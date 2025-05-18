
package taller;
    


public class Coche {
    // Atributos
    private final Motor motor;
    private Rueda ruedaDI;
    private Rueda ruedaDD;
    private Rueda ruedaTI;
    private Rueda ruedaTD;
    private Puerta puertaI;
    private Puerta puertaD;
    
    // Constructor
    public Coche() {
        this.motor = new Motor();
        this.ruedaDI = new Rueda();
        this.ruedaDD = new Rueda();
        this.ruedaTI = new Rueda();
        this.ruedaTD = new Rueda();
        this.puertaI = new Puerta();
        this.puertaD = new Puerta();
    }
    
    public Coche(Motor motor, Rueda ruedaDI, Rueda ruedaDD, Rueda ruedaTI, Rueda ruedaTD, Puerta puertaI, Puerta puertaD) {
        this.motor = motor;
        this.ruedaDI = ruedaDI;
        this.ruedaDD = ruedaDD;
        this.ruedaTI = ruedaTI;
        this.ruedaTD = ruedaTD;
        this.puertaI = puertaI;
        this.puertaD = puertaD;
    }
    
    
    // Getters y Setters
    public Motor getMotor() {
        return motor;
    }


    public Rueda getRuedaDI() {
        return ruedaDI;
    }

    public void setRuedaDI(Rueda ruedaDI) {
        this.ruedaDI = ruedaDI;
    }

    public Rueda getRuedaDD() {
        return ruedaDD;
    }

    public void setRuedaDD(Rueda ruedaDD) {
        this.ruedaDD = ruedaDD;
    }

    public Rueda getRuedaTI() {
        return ruedaTI;
    }

    public void setRuedaTI(Rueda ruedaTI) {
        this.ruedaTI = ruedaTI;
    }

    public Rueda getRuedaTD() {
        return ruedaTD;
    }

    public void setRuedaTD(Rueda ruedaTD) {
        this.ruedaTD = ruedaTD;
    }

    public Puerta getPuertaI() {
        return puertaI;
    }

    public void setPuertaI(Puerta puertaI) {
        this.puertaI = puertaI;
    }

    public Puerta getPuertaD() {
        return puertaD;
    }

    public void setPuertaD(Puerta puertaD) {
        this.puertaD = puertaD;
    }
    
    // Métodos de instancia
    public void abrirPuertaIzq() {
    }
        
}
