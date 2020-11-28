import classes.Computador;
import classes.Desktop;
import classes.Loja;
import classes.Notebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args)throws Exception{
        ArrayList<Computador> computadorLista = new ArrayList<Computador>();

        try {
            File fileDesktops = new File("src/files/desktops.txt");
            File fileNotebooks = new File("src/files/notebooks.txt");
            Scanner scanDesktops = new Scanner(fileDesktops);
            Scanner scanNotebooks = new Scanner(fileNotebooks);

            while (scanDesktops.hasNext()){
                String nomeCPU = scanDesktops.next();
                int tamRam = scanDesktops.nextInt();
                double valor = scanDesktops.nextDouble();
                boolean isAllinOne = scanDesktops.nextBoolean();

                computadorLista.add(new Desktop(nomeCPU, tamRam, valor, isAllinOne));
            }
            while (scanNotebooks.hasNext()){
                String nomeCPU = scanNotebooks.next();
                int tamRam = scanNotebooks.nextInt();
                double valor = scanNotebooks.nextDouble();
                boolean webCam = scanNotebooks.nextBoolean();

                computadorLista.add(new Notebook(nomeCPU, tamRam, valor, webCam));
            }
            scanNotebooks.close();
            scanDesktops.close();

        }
        catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        }
        File filewebCamAllinOne = new File("src/files/webCamAllinOne.txt");

        Loja loja = new Loja(computadorLista);

        try {
            if (filewebCamAllinOne.createNewFile()) 
              System.out.println("Criado!");
            else 
              System.out.println("Erro ao criar");
      
            FileWriter writer = new FileWriter(filewebCamAllinOne);
            
            for (int i = 0; i < loja.webCamAllinOne().size(); i++) {
              if (loja.webCamAllinOne().get(i) instanceof Desktop) {
                Desktop desk = (Desktop)loja.webCamAllinOne().get(i);
                writer.write(
                  desk.getNomeCPU() + " " +
                  desk.getTamRam() + " " +
                  desk.getValor() + " " +
                  desk.getIsAllinOne() + " " +
                  desk.calculaDesconto()+ "\n"
                );
              }
      
              if (loja.webCamAllinOne().get(i) instanceof Notebook) {
                Notebook note = (Notebook)loja.webCamAllinOne().get(i);
                writer.write(
                  note.getNomeCPU() + " " +
                  note.getTamRam() + " " +
                  note.getValor() + " " +
                  note.getWebCam() + " " +
                  note.calculaDesconto() + "\n" 
                );
              }
            }
            writer.close();
          } catch (IOException e) {
            System.out.println("Um erro ocorreu!");
          }

    }
}