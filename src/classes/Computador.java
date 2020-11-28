package classes;

public abstract class Computador {
    private String nomeCPU;
    private int tamRam;
    private double valor;

    public Computador(String nomeCPU, int tamRam, double valor){
        this.nomeCPU = nomeCPU;
        this.tamRam = tamRam;
        this.valor = valor;
    }

    public String getNomeCPU() {
        return nomeCPU;
    }

    public void setNomeCPU(String nomeCPU) {
        this.nomeCPU = nomeCPU;
    }

    public int getTamRam() {
        return tamRam;
    }

    public void setTamRam(int tamRam) {
        this.tamRam = tamRam;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract double calculaDesconto();
}
