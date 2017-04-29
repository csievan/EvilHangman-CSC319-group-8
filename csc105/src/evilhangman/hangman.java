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
    String dashLine;
    int guessCount;
    boolean gameResult;
    String ChosenWord;
    Scanner sc = new Scanner(System.in);

    public hangman() {
        this.guessLetters = new char[5];
        this.dashLine = "_";
        this.guessCount = 0;
    }

    public void setWordlength(int wordlength) {
        this.wordlength = wordlength;
    }

    public int getWordlength() {
        return wordlength;
    }

    public int getGuessCount() {
        return guessCount;
    }

    public boolean getGameResult() {
        return gameResult;
    }

    public String getChosenWord() {
        return ChosenWord;
    }

    public void inputGuessLetter(char ch) {//char[]
        if (!new String(guessLetters).contains(String.valueOf(ch))) {
            this.guessLetters[guessCount] = ch;
            guessCount++;
        } else {
            System.out.println("Error pls enter again");
            inputGuessLetter(sc.next().charAt(0));
            this.guessLetters[guessCount] = ch;
            guessCount--;
            guessCount++;
        }
    }

    public boolean isGuessletterRepeated(char guess) {
        boolean check = false;
        inputGuessLetter(sc.next().charAt(0));
        guessCount++;
        /*if (guessCount != 0) {
            String re = "" + guessLetters[guessCount];
            for (int i = 0; i < guessLetters.length; i++) {
                String ch = "" + guessLetters[i];
                if (new String(guessLetters).contains(String.valueOf(guess))) {
                    check = false;
                    System.out.println("Error enter letter again");
                    guessCount--;
                    inputGuessLetter(sc.next().charAt(0));
                } else {
                    check = true;
                }
            }
        }*/
        return check;
    }

    public boolean isLetterRightGuess() {
        return true;
    }

    public boolean selectWords() {
        return false;
    }

    public Dictionary WordListEliminating(Dictionary Dic) {//Dic : Dictionary
        return Dic;
    }

    public int setGuessCount() {

        return guessCount;
    }

    public boolean setGameResult() {
        return gameResult;
    }

    public String setChosenWord() {
        return ChosenWord;
    }

    public String displayDashLine() {
        for (int j = 0; j < wordlength; j++) {
            System.out.print(dashLine + " ");
        }
        System.out.println();
        return "";
    }

    public char[] guessesLetters(char ch) { //ch : char
        return guessLetters;
    }

    public String displayGuessesLetters() {
        for (int i = 0; i < guessCount; i++) {
            System.out.print(guessLetters[i] + " ");
        }
        return " ";
    }

    public int Remainningwords() {
        return wordlength;
    }
}
