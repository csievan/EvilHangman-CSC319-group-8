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
        int a = sc.nextInt();
        hangman h = new hangman();
        h.setWordlength(a);
        System.out.println(h.getWordlength());
        String  c = sc.next();
        h.setGuessLetter(c);
    }
    
}
