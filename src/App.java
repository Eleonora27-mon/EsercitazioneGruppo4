import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner (System.in);
       int euro, puntata, dadoPC, dadoG, dado1, dado2, turno;
       Boolean risposta; 
       System.out.println("Ti va di giocare?");
       System.out.println("Tira i tuoi dadi!");
       dado1 = (int)(Math.random ()*6 +1);
       System.out.println(dado1);
       dado2 = (int)(Math.random ()*6 +1);
       System.out.println(dado2);
       dadoG = dado1 + dado2;
       System.out.println("Il tuo punteggio è:" + dadoG);
       dado1 = (int)(Math.random ()*6 +1);
       System.out.println(dado1);
       dado2 = (int)(Math.random ()*6 +1);
       System.out.println(dado2);
       dadoPC = dado1 + dado2;
       System.out.println("Il punteggio del PC è:" + dadoPC);
       if (dadoG==dadoPC) {
        System.out.println("Hai pareggiato!");

        }
        else if (dadoG>dadoPC) {
        System.out.println("Hai vinto!");
        }
        else  {
        System.out.println("Hai perso!");
        
 
       }







       


    }
}
