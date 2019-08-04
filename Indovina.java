import java.util.Scanner;
/** 
 * @author (Zancan Federico VR429667, Dalla Benetta Gaia VR439308,
 * Vivian Gaia VR429595, Foscarin Giovanni VR437127) 
 * 
 */
public class Indovina extends Personaggi
{
    public static void main (String [] args)
    {
        int scelta = 0;
        int i = 1;
        Scanner input = new Scanner(System.in);
        
        System.out.println("<INDOVINA CHI>");
        System.out.println("Il gioco consiste nell'indovinare una serie di 6 personaggi appartenenti a 3 categorie diverse in sequenza ");
        System.out.println();
        System.out.println("-_-_-_-_-_REGOLE_-_-_-_-_-");
        System.out.println("1) Si possono guardare gli indizi quante volte si vuole");
        System.out.println("2) !!Si può effettuare un solo tentativo per indovinare il personaggio poi si passerà al personaggio successivo!!");
        System.out.println("3) Per scrivere il nome del personaggio bisogna scrivere le iniziali in maiuscolo per esempio: Mario Rossi");
        System.out.println("4) Le categorie di appartenenza di ogni personaggio verranno specificate al primo indizio poi ne seguiranno 5 che aiuteranno ad individuare il nome nascosto");
        System.out.println("Ultima cosa...BUON DIVERTIMENTO");
        System.out.println();
        
        while(scelta != 2){
            System.out.println("----------MENU'----------");
            System.out.println("1 - Inizia a giocare");
            System.out.println("2 - Esci");
            scelta = input.nextInt();
            switch(scelta){
                case 1: Videogiochi(i); break;
                case 2: break;
                default : System.out.println("Valore non valido");break; 
            }
        }
    }
}
