package org.learning.java;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int pathLength = keyboardInput.nextInt();
        int age = keyboardInput.nextInt();

        double costPerKm = 0.21;
        double grossCostOfTheTicket = costPerKm * pathLength;
        double finalCostOfTheTicket = grossCostOfTheTicket;

        if (age<18){
            finalCostOfTheTicket = grossCostOfTheTicket * 0.8;
        }else if (age>65){
            finalCostOfTheTicket = grossCostOfTheTicket * 0.6;
        }

        /*Bonus:
          ho usato il pattern 0.00 invece di #.## per ottenere uno 0 al posto
          delle unità dei centesimi quando scatta la decina successiva (2.1€ -> 2.10€)*/
        String formattedCost = new DecimalFormat("0.00").format(finalCostOfTheTicket);

        System.out.println("il costo del tuo biglietto sarà: "+ formattedCost +"€");
    }
}
