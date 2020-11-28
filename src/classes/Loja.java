package classes;
import java.util.ArrayList;

public class Loja {
    private ArrayList<Computador> computadorLista;

    public Loja(ArrayList<Computador> computadorLista){
        this.computadorLista = computadorLista;
    }

    public ArrayList<Computador> webCamAllinOne(){
        
        ArrayList<Computador> auxLista = new ArrayList<Computador>();

        for(int i = 0; i < this.computadorLista.size(); i++){
            if(computadorLista.get(i) instanceof Desktop){
                Desktop pcAllinOne = (Desktop)computadorLista.get(i);
                if(pcAllinOne.getIsAllinOne())
                    auxLista.add(pcAllinOne);
            }
            if(computadorLista.get(i) instanceof Notebook){
                Notebook noteWebCam = (Notebook)computadorLista.get(i);
                if(noteWebCam.getWebCam())
                    auxLista.add(noteWebCam);
            }
        }
        return auxLista;
    }
    public ArrayList<Computador> getComputadorLista(){
        return this.computadorLista;
    }
    public void setComputadorLista(ArrayList<Computador> computadorLista){
        this.computadorLista = computadorLista;
    }
}