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
public class hangman {

    Dictionary Dic;
    String showWords;
    int wordlength;
    char[] guessLetters;
    char[] dashLine;
    int guessCount;
    boolean gameResult;
    String ChosenWord;
    Scanner sc = new Scanner(System.in);
    int guessRight;

    public hangman() {
        this.Dic = new Dictionary("dictionary.txt");
        Dic.ReadWord();
        this.wordlength = Dic.word.length();
        this.showWords = Dic.getWord();
        this.guessLetters = new char[20];
        this.dashLine = new char[wordlength];
        this.guessCount = 0;
        this.guessRight = 0;
    }

    public void setWordlength(int wordlength) {
        this.wordlength = wordlength;
    }

    public String getChosenWord() {
        return showWords;
    }

    public void inputGuessLetter(char ch) {//char[]
        if (!new String(guessLetters).contains(String.valueOf(ch))) {
            isLetterRightGuess(ch);
            this.guessLetters[guessCount] = ch;
            guessCount++;
            isLetterRightGuess(ch);
            displayDashLine();
        } else {
            System.out.println("Error pls enter again");
            inputGuessLetter(sc.next().charAt(0));
            this.guessLetters[guessCount] = ch;
            guessCount--;
            guessCount++;
        }
    }

    public boolean win() {
        boolean win = true;
        for (int i = 0; i < dashLine.length; i++) {
            if (dashLine.equals("_")) {
                win = false;
            }
        }
        return win;
    }

    public boolean isLetterRightGuess(char ch) {
        boolean check = false;
        for (int j = 0; j < showWords.length(); j++) {
            if ((ch) == showWords.charAt(j)) {
                dashLine[j] = ch;
            }
        }
        return check;
    }

    public void setChosenWord() {
        this.showWords = Dic.getWord();
    }

    public void setDashLine() {
        for (int j = 0; j < dashLine.length; j++) {
            dashLine[j] = '_';
        }
    }

    public void displayDashLine() {
        for (int j = 0; j < dashLine.length; j++) {
            System.out.print(dashLine[j] + " ");
        }
        System.out.println();
    }

    public char[] guessesLetters(char ch) { //ch : char
        return guessLetters;
    }

    public void displayGuessesLetters() {
        for (int i = 0; i < guessCount; i++) {
            System.out.print(guessLetters[i] + " ");
        }
        System.out.println();
    }

    public void play() {
        System.out.println("Welcome to evil hangman");
        setDashLine();
        displayDashLine();
        System.out.println("Wordlength is " + wordlength);
        while (guessCount < 15) {
            char ch = sc.next().toLowerCase().charAt(0);
            inputGuessLetter(ch);
            System.out.print("Guessed letter: ");
            displayGuessesLetters();
            if (win() == false) {
                System.out.println("--------------Win----------------");
                break;
            } else {
                
                if (guessCount == 14) {
                    System.out.println("--------------Lose---------------");
                    System.out.println(getChosenWord());
                    break;
                }
            }
        }
    }
}
