package com.company;
import java.util.*;

class SimpleInterest {
    double principal;
    double rate;
    int year;

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        this.principal = scan.nextDouble();
        System.out.println("Enter the rate of interest: ");
        this.rate = scan.nextDouble();
        System.out.println("Enter the number of years: ");
        this.year = scan.nextInt();
    }
    public void output() {
        int value = (int) Math.round(principal * (1 + rate * year * 0.01));
        System.out.println("After " +year+ " years at " +rate+ "%, the investment will be worth $" +value);
    }
}

public class Main {

    public static void main(String[] args) {
	SimpleInterest ca = new SimpleInterest();
    ca.input();
    ca.output();
    }
}
