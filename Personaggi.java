import java.util.Scanner;

public class Personaggi{   
        protected static void Videogiochi(int i){
            Scanner input = new Scanner(System.in);
            
            String[] red = {"E' un personaggio dei videogiochi","Combatte contro nemici marroni verdi e rossi", "Ha origini italiane", 
            "Nel suo viaggio attraversa 8 mondi", "Il suo acerrimo nemico è Bowser", "Ha una M sul cappello rosso"};
            
            String[] hunz = {"E' una persona reale famosa ", "E' una maniaca del controllo ", "Ha fatto una canzone trap ", "Ha una figlia che si chiama Aurora", 
            "Ha lavorato su Canale 5 ", "E' di nazionalità  svizzera"};
            
            String[] alan = {"E' un personaggio di un film ", "Una notte da leoni ", "E' doppiato da Alberto Stocchi", "Futuro cognato di uno dei protagonisti ", 
            "Mette droga dentro la bottiglia di vino ", "E' interpretato da Zach Galifianakis "};
            
            String[] jim = {"E' una persona reale famosa ","Il suo vero nome e' James Eugene Redmond", "Normalmente recita in film comici ma ha preso parte ad uno drammatico al fianco di Kate Winslet", 
            "Doveva interpretare Willy Wonka in Fabbrica di cioccolato ", "Ha recitato in Bugiardo Bugiardo", "Ha recitato in The Mask" };
            
            String[] blu = {"E' un personaggio dei videogiochi", "Fa parte di un gioco platform giapponese", "Ama correre", 
            "Nel suo gioco le monete da raccogliere si chiamano Ring e hanno la forma di anelli", "E' un porcospino", "E' blu"};
            
            String[] vega = {"E' un personaggio di un film", "Ha il codino", "E' un ballerino", "Salva la moglie di un boss da un'overdose", 
            "Fa parte di una famosa coppia di gangster", "E' in un film di Quentin Tarantino(Pulp Fiction)"};
            
            boolean end = false;
            int scelta = 0;
            if (i > 6){
                 scelta = 4;
                 end = true;
            }
            else{
                do{
                    System.out.println();
                    System.out.println("Personaggio " + i);
                    System.out.println();
                    switch(i){
                        case 1: System.out.println("Originariamente era noto come Jumpman"); break;
                        case 2: System.out.println("Negli anni novanta ha esordito nel mondo televisivo come modella per intimo femminile"); break;
                        case 3: System.out.println("Il personaggio in questione è presente nella saga di tre film famosi che ha inizio nel 2009"); break;
                        case 4: System.out.println("Al suo debutto a livello mondiale come attore ricevette una nomination come peggior attore esordiente"); break;
                        case 5: System.out.println("E' l'icona della casa di produzione SEGA"); break;
                        case 6: System.out.println("Il film di cui il personaggio fa parte è servito a rilanciare l'attore dopo alcuni anni in ombra"); break;
                    }
                    System.out.println();
                    System.out.println("1 - Inserisci risposta");
                    System.out.println("2 - Chiedi aiuto");
                    System.out.println("3 - Rivela personaggio");
                    System.out.println("4 - Esci");
                    scelta = input.nextInt();
                }while(scelta > 5);
            }
            
            switch(scelta){
                case 1: Check(i); break;
                case 2: Help(i,red,hunz,alan,jim,blu,vega); break;
                case 3: Reveal(i); break;
                case 4: if (end || scelta == 4)
                            System.exit(0);
                        else break;
                default: System.out.println("Scelta non valida"); break;  
            }
        }   
    
        private static void Check(int i){
                Scanner input = new Scanner(System.in);
                String risposta;
                risposta = input.nextLine();
                if (i == 1){
                    if (risposta.equals("Mario") || risposta.equals("Super Mario"))
                        System.out.println("Congratulazioni, hai indovinato");
                    else
                        System.out.println("Mi dispiace non hai indovinato");
                    Videogiochi(i+1);
                }
                else{
                    if(i == 2){
                        if (risposta.equals("Michelle Hunziker"))
                            System.out.println("Congratulazioni, hai indovinato");
                        else
                            System.out.println("Mi dispiace non hai indovinato");
                        Videogiochi(i+1);
                    }
                    else{
                        if(i == 3){
                            if (risposta.equals("Alan Garner"))
                                System.out.println("Congratulazioni, hai indovinato");
                            else
                                System.out.println("Mi dispiace non hai indovinato");
                            Videogiochi(i+1);
                        }
                        else{
                            if(i == 4){
                                if (risposta.equals("Jim Carrey"))
                                    System.out.println("Congratulazioni, hai indovinato");
                                else
                                    System.out.println("Mi dispiace non hai indovinato");
                                Videogiochi(i+1);
                            }
                            else{
                                if(i == 5){
                                    if (risposta.equals("Sonic"))
                                        System.out.println("Congratulazioni, hai indovinato");
                                    else
                                        System.out.println("Mi dispiace non hai indovinato");
                                    Videogiochi(i+1);
                                }
                                else{
                                    if(i == 6){
                                        if (risposta.equals("Vincent Vega"))
                                            System.out.println("Congratulazioni, hai indovinato");
                                        else
                                            System.out.println("Mi dispiace non hai indovinato");
                                        Videogiochi(i+1);
                                    }
                                }
                            }
                        }
                    }
                }   
            }   
    
    private static void Help(int i,String[] red, String[] hunz, String[] alan, String[] jim, String[] blu, String[] vega){
                 Scanner input = new Scanner(System.in);
                 String scelta;
                 if(i == 1){
                    for(int j = 0; j < 6; j++){
                        System.out.println();
                        System.out.println(red[j]);
                        System.out.println();
                        if (j == 5)
                            Videogiochi(i);
                        else{
                            System.out.println("Vuoi un altro indizio? [y/n]");
                            scelta = input.nextLine();
                            while(scelta != "y" || scelta != "n"){
                                if(scelta.equals("y")) break;
                                else Videogiochi(i);
                            }
                        }
                    }
                 }
                 else{
                    if(i == 2){
                        for(int j = 0; j < 6; j++){
                            System.out.println();
                            System.out.println(hunz[j]);
                            System.out.println();
                            if (j == 5)
                                Videogiochi(i);
                            else{
                                System.out.println("Vuoi un altro indizio? [y/n]");
                                scelta = input.nextLine();
                                while(scelta != "y" || scelta != "n"){
                                    if(scelta.equals("y")) break;
                                    else Videogiochi(i);
                                }
                            }
                        }
                    }
                    else{
                        if(i == 3){
                            for(int j = 0; j < 6; j++){
                                System.out.println();
                                System.out.println(alan[j]);
                                System.out.println();
                                if (j == 5)
                                    Videogiochi(i);
                                else{
                                    System.out.println("Vuoi un altro indizio? [y/n]");
                                    scelta = input.nextLine();
                                    while(scelta != "y" || scelta != "n"){
                                        if(scelta.equals("y")) break;
                                        else Videogiochi(i);
                                    }
                                }
                            }
                        }
                        else{
                            if(i == 4){
                                for(int j = 0; j < 6; j++){
                                    System.out.println();
                                    System.out.println(jim[j]);
                                    System.out.println();
                                    if (j == 5)
                                        Videogiochi(i);
                                    else{
                                        System.out.println("Vuoi un altro indizio? [y/n]");
                                        scelta = input.nextLine();
                                        while(scelta != "y" || scelta != "n"){
                                            if(scelta.equals("y")) break;
                                            else Videogiochi(i);
                                        }
                                    }
                                }
                            }
                            else{
                                if(i == 5){
                                    for(int j = 0; j < 6; j++){
                                        System.out.println();
                                        System.out.println(blu[j]); 
                                        System.out.println();
                                        if (j == 5)
                                            Videogiochi(i);
                                        else{
                                            System.out.println("Vuoi un altro indizio? [y/n]");
                                            scelta = input.nextLine();
                                            while(scelta != "y" || scelta != "n"){
                                                if(scelta.equals("y")) break;
                                                else Videogiochi(i);
                                            }
                                        }
                                    }
                                }
                                else{
                                    if(i == 6){
                                        for(int j = 0; j < 6; j++){
                                            System.out.println();
                                            System.out.println(vega[j]);
                                            System.out.println();
                                            if (j == 5)
                                                Videogiochi(i);
                                            else{
                                                System.out.println("Vuoi un altro indizio? [y/n]");
                                                scelta = input.nextLine();
                                                while(scelta != "y" || scelta != "n"){
                                                    if(scelta.equals("y")) break;
                                                    else Videogiochi(i);
                                                }
                                            }
                                        }
                                    }   
                                }
                            }
                        }
                    }
                 }
    }
    
    private static void Reveal(int i){
        switch(i){
            case 1: System.out.println("La risposta esatta è Super Mario"); Videogiochi(i+1); break;
            case 2: System.out.println("La risposta esatta è Michelle Hunziker"); Videogiochi(i+1); break;
            case 3: System.out.println("La risposta esatta è Alan Garner"); Videogiochi(i+1); break;
            case 4: System.out.println("La risposta esatta è Jim Carrey"); Videogiochi(i+1); break;
            case 5: System.out.println("La risposta esatta è Sonic"); Videogiochi(i+1); break;
            case 6: System.out.println("La risposta esatta è Vincent Vega"); Videogiochi(i+1); break;
        }
    }
 }      
