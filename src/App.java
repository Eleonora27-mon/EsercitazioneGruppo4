import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Richiamo lo scanner
        Scanner sc = new Scanner(System.in);

        // Dichiaro gli interi (quelli senza virgola)
        int euro, puntata, dadoPC, dadoG, dado1, dado2, punteggioG, punteggioPC;

        punteggioG = 0;
        punteggioPC = 0;

        // Dichiaro i Booleani
        Boolean risposta=true;

        System.out.println("Ti va di giocare?");
    do {System.out.println("Tira i tuoi dadi!");
        euro=100;
        System.out.println("quanto vuoi puntare?");
        puntata=sc.nextInt();
        if (puntata>0 && puntata<100) {// Ciclo for per lanciare 3 volte i dadi
            for (int i = 0; i <= 3; i++) {
    
                // Lancio dado 1 e salvo
                dado1 = (int) (Math.random() * 6 + 1);
                System.out.println(dado1);
    
                // Lancio dado 2 e salvo
                dado2 = (int) (Math.random() * 6 + 1);
                System.out.println(dado2);
    
                // Sommo i risultati dell'utente/giocatore
                dadoG = dado1 + dado2;
                System.out.println("Il tuo punteggio è:" + dadoG);
    
                // Rilancio i dadi per il Pc
                dado1 = (int) (Math.random() * 6 + 1);
                System.out.println(dado1);
                dado2 = (int) (Math.random() * 6 + 1);
                System.out.println(dado2);
    
                // Sommo i risultati per il PC e mostro
                dadoPC = dado1 + dado2;
                System.out.println("Il punteggio del PC è:" + dadoPC);
    
                // Controllo il risultato
                if (dadoG == dadoPC) {
                    System.out.println("Hai pareggiato!");
                } else if (dadoG > dadoPC) {
                    System.out.println("Hai vinto!");
                    punteggioG++;
                } else {
                    System.out.println("Hai perso!");
                    punteggioPC++;
                }
            }
    
            // Controlliamo il vincitore
            if (punteggioG < punteggioPC) {
                System.out.println("Hai perso la partita!");
                System.out.println("Hai Perso " + puntata + " Il tuo conto è di " + (euro - puntata));
            } else if (punteggioG == punteggioPC) {
                System.out.println("Hai pareggiato la partita!");
                System.out.println("Hai Guadagnato " + puntata + " Il tuo conto è di " + (euro + puntata));
            } else {
                System.out.println("Hai Guadagnato " + puntata + " Il tuo conto è di " + (euro + puntata));                
                System.out.println("Hai vinto la partita!");
            }
            System.out.println("Ti va di giocare ancora?");
            risposta=sc.nextBoolean();
         }
         else{
        System.out.println("puntata non valido");
        System.out.println("Ti va di giocare ancora?");
            risposta=sc.nextBoolean();
        }
} while (risposta);
sc.close();
}
}
