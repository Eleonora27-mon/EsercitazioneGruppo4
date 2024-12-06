import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Richiamo lo scanner
        Scanner sc = new Scanner(System.in);

        // Dichiaro gli interi (quelli senza virgola)
        int euro, puntata, dadoPC, dadoG, dado1, dado2, punteggioG, punteggioPC;

        // Dichiaro i valori
        punteggioG = 0;
        punteggioPC = 0;
        euro = 100;

        // Dichiaro i Booleani
        Boolean risposta = true;

        System.out.println("Ti va di giocare?");

        // Inizio gioco con richiesta se vuoi giocare ancora e controllo del saldo
        do {
            System.out.println("Tira i tuoi dadi!");

            // Chiedo la puntata
            System.out.println("quanto vuoi puntare?");
            puntata = sc.nextInt();

            // Controllo la puntata
            if (puntata > 0 && puntata <= euro) {
                
                // Ciclo for per lanciare 3 volte i dadi
                for (int i = 0; i <= 2; i++) {

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

                // Controlliamo il vincitore e togliamo e aggiungiamo dal conto
                if (punteggioG < punteggioPC) {
                    System.out.println("Hai perso la partita!");
                    euro = euro - puntata;
                    System.out.println("Hai Perso " + puntata + " Il tuo conto è di " + euro);
                } else if (punteggioG == punteggioPC) {
                    System.out.println("Hai pareggiato la partita!");
                    System.out.println("Il tuo conto è di " + euro);
                } else {
                    euro = euro + puntata;
                    System.out.println("Hai vinto la partita!");
                    System.out.println("Hai Guadagnato " + puntata + " Il tuo conto è di " + euro);
                }

                // Controllo se ha i soldi per rigiocare
                if (euro <= 0) {
                    System.out.println("Hai perso tutti i soldi");
                } else {
                    // Chiediamo se vuole giocare ancora
                    System.out.println("Ti va di giocare ancora?");
                    risposta = sc.nextBoolean();
                }
            } else {

                // Se la puntata non + valida
                System.out.println("puntata non valido");
                System.out.println("Ti va di giocare ancora?");
                risposta = sc.nextBoolean();
            }
        } while (euro != 0 && risposta);
        sc.close();
    }
}
