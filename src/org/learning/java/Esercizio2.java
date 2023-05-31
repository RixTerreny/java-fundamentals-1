package org.learning.java;
import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        System.out.println("Inserisci un numero compreso tra 0 e 1000:\n");
        Scanner keyboardInput = new Scanner(System.in);
        int chosenNumber = keyboardInput.nextInt();

        while(chosenNumber < 0 || chosenNumber > 1000){
            System.out.println("il numero inserito non è valido, ritenta:\n");
            chosenNumber = keyboardInput.nextInt();
        }

        for (int i = 1; i < chosenNumber; i++) {
            if (i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            } else if (i%3 == 0) {
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
