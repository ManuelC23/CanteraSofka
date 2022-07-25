package com.manuel.songlibrary;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/**
 * Representación de una Biblioteca de canciones, se crea con 5 canciones por defecto y con la funcionalidad de crear
 * una nueva playlist, filtrar las canciones y ordenar las canciones.
 * @author Manuel Cervantes
 */
public class MainLibrary{

    public static void main(String[] args) {
       
       ArrayList<Songs> SongsArray = new ArrayList(); // ArrayList que contendrá las canciones.
       SongsArray.add(new Songs("Bohemian Rhapsody","Rock","1",5.54,1975,"/BohemianCover.jpg","Song about Freddie Mercurie's life could have been."));
       SongsArray.add(new Songs("Smells like teen Spirit","Rock","2",5.02,1991,"/SmellsCover.jpg","Song named after Kurt Cobain's girlfriend suggested he smelled like Teen Spirit."));
       SongsArray.add(new Songs("Bilie Jean","Pop","3",4.53,1982,"/BillieCover.jpg","Blends post-disco, rhythm and blues, funk and dance-pop."));
       SongsArray.add(new Songs("Beat it","Pop","4",4.18,1982,"/BeatItCover.jpg","Mainly focuses on avoiding violence by deliberately walking away from a fight."));
       SongsArray.add(new Songs("You are my Best Friend","Rock","5",2.50,1975,"/BestFriendCover.jpg","Written by the band's bass player, John Deacon, who wrote it for and about his wife."));
       
       System.out.println("Welcome to your Music Library. \nYou have " + SongsArray.size() + " songs which are the following: " );
   
       for(int i=0; i<SongsArray.size(); i++) { // Bucle for utilizado para mostrar las canciones que se encuentran en la biblioteca.
            System.out.println(
                    "ID: " + SongsArray.get(i).getID()
                    + " - Title: " +  SongsArray.get(i).getTitle() 
                    + " - Genre: " + SongsArray.get(i).getGenre() 
                    + " - Length: " + SongsArray.get(i).getLength() 
                    + " - Year: " + SongsArray.get(i).getDate() 
                    + " - Description: " + SongsArray.get(i).getDescription() 
                    + " - Cover: " + SongsArray.get(i).getCover()); 
       }
      
       System.out.println("Please select: \n1. Create a new Playlist. \n2. Filter Songs. \n3. Sort songs. \n4. Exit.");
       int num = 1;
       /*
       Bucle utilizado para conocer qué función desea realizar el usuario y hasta cuando desea realizarla.
       Se utiliza un Scanner para solicitarle al usuario qué realizar y posteriormente un bucle switch para definir qué hacer
       en base a lo que el usuario decide.
       */
       do{
           Scanner userInput = new Scanner(System.in);
           int userInt = userInput.nextInt();
           
            switch(userInt){
                case 1: // Código para crear una Nueva Playlist.
                    int j = 1;
                    List<String> playlist = new ArrayList<>();
                    do{
                    System.out.println("Please write down the Song ID to add it to the playlist: ");
                    Scanner idInput = new Scanner(System.in);
                    String songsID = idInput.nextLine();
                     for(int k=0; k<SongsArray.size(); k++){
                        if(SongsArray.get(k).getID().equals(songsID)){
                            playlist.add(SongsArray.get(k).getTitle());
                        } 
                    }
                    System.out.println("Do you want to add another song?\n1- Yes 2- No");
                    Scanner continueInput = new Scanner(System.in); 
                    j = continueInput.nextInt();
                    } while (j == 1);
                    System.out.println("Your playlist order is the next: ");
                    int l = 0;
                    for (l=0; l<playlist.size(); l++){
                        System.out.println(l+1 +". "+ playlist.get(l));
                    }
                    break;
                case 2: // Código para filtrar canciones.
                    System.out.println("Do you want to filter by Genre or Year? \n1- Genre 2- Year ");
                    Scanner filterInput = new Scanner(System.in);
                    int filter = filterInput.nextInt();        
                    switch(filter){
                        case 1:
                             System.out.println("Please write down the Song genre to filter: ");
                             Scanner genreInput = new Scanner(System.in);
                             String songsGenre = genreInput.nextLine();
                             for(int k=0; k<SongsArray.size(); k++){
                                 SongsArray.get(k).filterGenre(songsGenre);
                             }
                             break;
                        case 2:
                            System.out.println("Please write down the Song Year to filter: ");
                            Scanner yearInput = new Scanner(System.in);
                            int songsYear = yearInput.nextInt();
                            for(int k=0; k<SongsArray.size(); k++){
                                 SongsArray.get(k).filterYear(songsYear);
                             }
                            break;
                    }
                    break;
                case 3: // Código para Ordenar canciones.
                     System.out.println("Do you want to sort by Length or Date? \n1- Length 2- Date");
                     Scanner sortInput = new Scanner(System.in);
                     int sort = sortInput.nextInt();
                     switch(sort){
                         case 1:
                             System.out.println("The songs in your library ordered by Length from shorter to larger are: ");
                             Collections.sort(SongsArray, new Comparator<Songs>(){
                                 @Override
                                 public int compare(Songs s1, Songs s2){
                                     return Double.valueOf(s1.getLength()).compareTo(s2.getLength());
                                 }
                             });
                             for(int k=0; k<5; k++){
                                 System.out.println( k+1 + ". " + SongsArray.get(k).getTitle() + " - " + SongsArray.get(k).getLength() + " minutes.");
                             }                   
                             break;
                             case 2:
                             System.out.println("The songs in your library ordered by Year from oldest to newest are: ");
                             Collections.sort(SongsArray, new Comparator<Songs>(){
                                 @Override
                                 public int compare(Songs s1, Songs s2){
                                     return Integer.valueOf(s1.getDate()).compareTo(s2.getDate());
                                 }
                             });
                             for(int k=0; k<5; k++){
                                 System.out.println( k+1 + ". " + SongsArray.get(k).getTitle() + " - " + SongsArray.get(k).getDate());
                             }
                             break;
                     }
                  break;
                case 4: // Código para terminar la ejecución del programa
                    case 5:
                    System.out.println("See you next time!");
                    num = 0;
                    break;
                
                default:
                    System.out.println("Sorry, you pressed a wrong number. Please try again.");
                    
                    System.out.println("Please select: \n1. Create a new Playlist. \n2. Filter Songs. \n3. Sort songs. \n4. Exit.");
            }
       
        System.out.println("Please select: \n1. Create a new Playlist. \n2. Filter Songs. \n3. Sort songs. \n4. Exit.");
       }while(num == 1);
    }
}
