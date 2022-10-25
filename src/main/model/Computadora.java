package main.model;

public class Computadora extends Object{

    private int ram;
    private int disco;

    public Computadora() {
    }

    public Computadora(int ram, int disco) {
        this.ram = ram;
        this.disco = disco;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDisco() {
        return disco;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }


    //Método que devuelve una cadena de texto.
    // Se sobreescribe del Object (No es necesario
    // ponerla en la clase "extends Object" porque es redundante)
    @Override
    public String toString() {
        return "Computadora{" +
                "ram=" + this.ram +
                ", disco=" + this.disco +
                '}';
    }
}




