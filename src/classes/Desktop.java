package classes;

public class Desktop extends Computador {
    private boolean isAllinOne;

    public Desktop(String nomeCPU, int tamRam, double valor, boolean isAllinOne){
        super(nomeCPU, tamRam, valor);
        this.isAllinOne = isAllinOne;
    }
    @Override
    public double calculaDesconto() {
        if(this.isAllinOne && getTamRam() > 4){
            return getValor() * 0.2;
        }else{
            return getValor() * 0.1;
        }
    }
    public boolean getIsAllinOne() {
        return this.isAllinOne;
      }
      public void setIsAllinOne(boolean isAllinOne){
        this.isAllinOne = isAllinOne;
      }

}