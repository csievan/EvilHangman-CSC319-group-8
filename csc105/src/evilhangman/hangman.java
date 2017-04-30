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
        this.guessLetters = new char[wordlength];
        this.dashLine = "_";
        this.guessCount = 0;
        this.Dic = new Dictionary("dictionary.txt");
        Dic.ReadWord();
        this.wordlength = Dic.word.length();
        this.showWords = Dic.getWord();
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
        return showWords;
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

    public void setGuessCount() {
        this.guessCount = 7;
    }

    public boolean setGameResult() {
        return gameResult;
    }

    public void setChosenWord() {
        this.showWords = Dic.getWord();
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
