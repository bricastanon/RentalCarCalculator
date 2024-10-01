package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Hello world!");
        // INFO
        final double basicCarRental = 29.99;
        final double tollRate = 3.95;
        final double gpsRate = 2.95;
        final double roadsideRate = 3.95;
        final double underage = 0.30;
        final int ageRequirement = 25;

        // Input
        System.out.println("What is your pick up date? ");
        String pickupDate = reader.nextLine();

        System.out.println("Number of days of rental: ");
        int rentalDays = reader.nextInt();

        System.out.println("Toll tag is $3.95/day ");
        System.out.println("Do you want an electric toll tag? yes/no ");
        reader.nextLine();
        boolean wantsTag = reader.nextLine().equals("yes");

        System.out.println("GPS is at $2.95/day ");
        System.out.println("Do you want a GPS? yes/no ");
       // reader.nextLine();
        boolean wantsGPS = reader.nextLine().equals("yes");

        System.out.println("Roadside assistance is at $3.95/day ");
        System.out.println("Do you want to add roadside assistance? yes/no ");
        // reader.nextLine();
        boolean wantsRoadside = reader.nextLine().equals("yes");

        System.out.println("What is your age?: ");
        int age = reader.nextInt();

        // Calculate costs:
       double baseCost = basicCarRental * rentalDays;
       double optionsCost = 0;
       if (wantsTag) optionsCost += tollRate * rentalDays;
       if (wantsGPS) optionsCost += gpsRate * rentalDays;
       if (wantsRoadside) optionsCost += roadsideRate * rentalDays;

       double underageSurcharge = 0;
       if (age < ageRequirement) {
           underageSurcharge = baseCost + underage;
       }
       double totalcost = baseCost + optionsCost + underageSurcharge;

        // System.out.printf("Rental Car Info:" );
       // System.out.printf(" Pickup Date: %s%n", pickupDate);
       // System.out.printf("Number of Days: %d%n", rentalDays);
        System.out.printf("Basic Car Rental: $%.2f%n", baseCost);
        System.out.printf("Options Cost: $%.2f%n", optionsCost);
        System.out.printf("Underage Surcharge: $%.2f%n", underageSurcharge);
        System.out.printf("Total Cost: $%.2f%n", totalcost);

        reader.close();
        }

    }
