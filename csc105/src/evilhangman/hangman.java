/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evilhangman;

import java.util.Arrays;

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

    public char[] inputGuessLetter(char ch) {//ch : char
        return guessesLetters(ch);
    }

    public boolean isGuessletterRepeated() {
        boolean check = false;
        String re = ""+guessLetters[guessCount]; 
        for (int i = 0; i < guessLetters.length; i++) {
            String ch = ""+guessLetters[i];
            if(ch.equalsIgnoreCase(dashLine)) {
                check = false;
                guessCount--;
            } else {
                check = true;
            }
        }
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
        for(int j = 0;j<wordlength;j++){
           System.out.print(dashLine+" ");
        }
        System.out.println();
        return "";
    }

    public char[] guessesLetters(char ch) { //ch : char
        return guessLetters;
    }

    public String displayGuessesLetters() {
        //String a = guessLetters+"";
        //System.out.print(new String(guessLetters)+" ");
        for(int i =0;i<guessCount;i++){
            System.out.print(guessLetters[i]);
            System.out.print(" ");
        }
        return " ";
    }

    public int Remainningwords() {
        return wordlength;
    }

    public void setGuessLetter(char letter) {
         this.guessLetters[guessCount++] = letter;
    }
}
