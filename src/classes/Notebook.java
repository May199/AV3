package classes;

public class Notebook extends Computador {
    private boolean webCam;

    public Notebook(String nomeCPU, int tamRam, double valor, boolean webCam){
        super(nomeCPU, tamRam, valor);
        this.webCam = webCam;
    }

    public boolean getWebCam() {return webCam;}
    public void setWebCam(boolean webCam) { this.webCam = webCam;}

    public double calculaDesconto() {
        if (getTamRam() > 5) {
            return getValor() * 0.15;
        } else {
            return getValor() * 0.5;
        }
    }
}