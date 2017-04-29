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
        Dictionary d = new Dictionary("dictionary.txt");
        Dictionary.read();
        /*h.setWordlength(sc.nextInt());
        h.displayDashLine();
        h.inputGuessLetter(sc.next().charAt(0));        
        System.out.println((h.displayGuessesLetters()));
        h.inputGuessLetter(sc.next().charAt(0));
        System.out.println(h.displayGuessesLetters());
        h.inputGuessLetter(sc.next().charAt(0));
        System.out.println(h.displayGuessesLetters());
        h.inputGuessLetter(sc.next().charAt(0));
        System.out.println(h.displayGuessesLetters());
        h.inputGuessLetter(sc.next().charAt(0));
        System.out.println(h.displayGuessesLetters());*/
    }

}
