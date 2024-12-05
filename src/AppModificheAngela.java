import java.util.Scanner;

public class AppModificheAngela {
    public static void main(String[] args) throws Exception {
        // Richiamo lo scanner
        Scanner sc = new Scanner(System.in);

        // Dichiaro gli interi (quelli senza virgola)
        int euro, puntata, dadoPC, dadoG, dado1, dado2, punteggioG, punteggioPC;

        punteggioG = 0;
        punteggioPC = 0;
        euro = 100;

        // Dichiaro i Booleani
        Boolean risposta;

        System.out.println("Ti va di giocare?");
        System.out.println("Tira i tuoi dadi!");

        // Ciclo for per lanciare 3 volte i dadi
            //+ : ho notato un bug, il for scritto i = 0, ripeteva il loop 4 volte invece di 3
        for (int i = 1; i <= 3; i++) {

            //+: comunico i soldi disponibili e chiedo quanto si vuole puntare
            System.out.println("Hai a disposizione " +euro +" euro.");
            System.out.println("Quanto vuoi puntare?");
            puntata = sc.nextInt();

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
                //+: aggiungo o sottraggo la puntata dagli euro in base al risultato
            if (dadoG == dadoPC) {
                System.out.println("Hai pareggiato!");
            } else if (dadoG > dadoPC) {
                System.out.println("Hai vinto!");
                punteggioG++;
                euro= euro+puntata;
            } else {
                System.out.println("Hai perso!");
                punteggioPC++;
                euro= euro-puntata;
            }
        }

        // Controlliamo il vincitore
        if (punteggioG < punteggioPC) {
            System.out.println("Hai perso la partita!");
        } else if (punteggioG == punteggioPC) {
            System.out.println("Hai pareggiato la partita!");
        } else {
            System.out.println("Hai vinto la partita!");
        }
    }
}
