package com.pluralsight;

import java.util.Scanner;

public class VehicleInventory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[20];
        int count = 0;
        Vehicle vehicle1 = new Vehicle(101121, "FordExplorer", "Red", 45000, 13500);
        vehicles[count] = vehicle1;
        count++;
        Vehicle vehicle2 = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[count] = vehicle2;
        count++;
        Vehicle vehicle3 = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[count] = vehicle3;
        count++;
        Vehicle vehicle4 = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[count] = vehicle4;
        count++;
        Vehicle vehicle5 = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicles[count] = vehicle5;
        count++;
        Vehicle vehicle6 = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
        vehicles[count] = vehicle6;
        count++;

        int command = getCommand(input);
        while (command <= 0 || command > 6) {
            System.out.print("Please enter number 1 to 6 for your options!\n");
            command = getCommand(input);
        }
        if (command == 1){
            listVehicle();
        } else if (command == 2) {
            findVehicleModelMake();
        } else if (command == 3) {
            findVehiclesByPrice();

        } else if (command == 4) {
            findVehicleByColor();
        } else if (command == 5) {
            addVehicle();
        }else{
            System.out.println("\nThank you for using!");
        }


    }

    private static int getCommand(Scanner input) {
        System.out.println("What do you want to do?");
        System.out.println(" 1 - List all vehicles");
        System.out.println(" 2 - Search by make/model");
        System.out.println(" 3 - Search by price range");
        System.out.println(" 4 - Search by color");
        System.out.println(" 5 - Add a vehicle");
        System.out.println(" 6 - Quit");
        System.out.print("Enter your command: ");
        return input.nextInt();
    }

    public static void listVehicle(){
      //  while (vehicles. )

    }

    public static void findVehicleModelMake(){

    }
    public static void findVehiclesByPrice(){

    }
    public static void findVehicleByColor(){

    }
    public static void addVehicle(){

    }

}
