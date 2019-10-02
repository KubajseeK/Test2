package sk.itsovy.currencyconverter;

import java.text.DecimalFormat;
import java.util.Scanner;

 public class Converter {
    public static void main(String[] args) {

        double code, amount, eur, dollar, pound, jpy, convert;
        DecimalFormat f = new DecimalFormat("##.##");

        Scanner firstCurrency = new Scanner(System.in);
        System.out.println("Hello, what currency do you want to convert?: ");
        System.out.println("1:Euro \t2:Dollar \t3:Pound \t4:Yen ");
        code = firstCurrency.nextInt();
        System.out.println("How much Money you want to convert ?");
        amount = firstCurrency.nextFloat();
        System.out.println("What do you want to convert into?");
        System.out.println("5:Euro \t6:Dollar \t7:Pound \t8:Yen");
        convert = firstCurrency.nextFloat();


        if (code == 1) {
            if (convert == 5) {
                System.out.println("Unnecessary.");
            } else if (convert == 6) {
                dollar = amount * 1.105;
                System.out.println(amount + " EUR is: " + f.format(dollar) + " dollars.");
            } else if (convert == 7) {
                pound = amount * 0.887;
                System.out.println(amount + "EUR is: " + f.format(pound) + " pounds.");
            } else if (convert == 8) {
                jpy = amount * 119.076;
                System.out.println(amount + "EUR is: " + f.format(jpy) + " yens.");
            }
        }
        if (code == 2) {
            if (convert == 5) {
                eur = amount * 0.905;
                System.out.println(amount + "Dollars is: " + f.format(eur) + " euro.");
            } else if (convert == 6) {
                System.out.println("Unnecessary");
            } else if (convert == 7) {
                pound = amount * 0.803;
                System.out.println(amount + "Dollars is: " + f.format(pound) + " pounds.");
            } else if (convert == 8) {
                jpy = amount * 107.772;
                System.out.println(amount + "Dollars is: " + f.format(jpy) + " yens.");

            }


        }
        if (code == 3) {
            if (convert == 5) {
                eur = amount * 1.127;
                System.out.println(amount + "Pounds is: " + f.format(eur) + " euro.");
            } else if (convert == 6) {
                dollar = amount * 1.245;
                System.out.println(amount + "Pounds is:" + f.format(dollar) + " dollars");
            } else if (convert == 7) {
                System.out.println("Unnecessary");
            } else if (convert == 8) {
                jpy = amount * 134.167;
                System.out.println(amount + "Pounds is: " + f.format(jpy) + " yens.");

            }


        }
        if (code == 4) {
            if (convert == 5) {
                eur = amount * 0.00840;
                System.out.println(amount + "Yens is: " + f.format(eur) + " euro.");
            } else if (convert == 6) {
                dollar = amount * 0.00928;
                System.out.println(amount + "Yens is: " + f.format(dollar) + " dollars");
            } else if (convert == 7) {
                pound = amount * 0.00745;
                System.out.println(amount + "Yens is: " + f.format(pound) + "pounds");
            } else if (convert == 8) {
                System.out.println("Unnecessary");

            }


        }


    }
}

