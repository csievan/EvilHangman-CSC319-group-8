/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evilhangman;
import java.util.Scanner;
/**
 *
 * @author redninjasir
 */
public class Evilhangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length");
        hangman h = new hangman();
        h.setWordlength(sc.nextInt());
        h.displayDashLine();
        if(h.isGuessletterRepeated()==true){
        h.setGuessLetter(sc.next().charAt(0));
        System.out.println((h.displayGuessesLetters()));
        h.setGuessLetter(sc.next().charAt(0));
        System.out.println(h.displayGuessesLetters());
        h.setGuessLetter(sc.next().charAt(0));
        h.setGuessLetter(sc.next().charAt(0));
            System.out.println("Error enter letter again");
            h.setGuessLetter(sc.next().charAt(0));            
        }
                
        System.out.println(h.displayGuessesLetters());
    }
    
}
