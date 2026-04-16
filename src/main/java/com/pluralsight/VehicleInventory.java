package com.pluralsight;

import java.util.Scanner;

public class VehicleInventory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[20];
        int count = 0;
        Vehicle vehicle1 = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
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
        while (command >= 1 && command <= 6) {
            if (command == 1) {
                listVehicle(vehicles, count);
            } else if (command == 2) {
                findVehicleModelMake(input, vehicles, count);
            } else if (command == 3) {
                findVehiclesByPrice(input, vehicles, count);
            } else if (command == 4) {
                findVehicleByColor(input, vehicles, count);
            } else if (command == 5) {
                addVehicle(input, vehicles, count);
                count++;
            } else {
                System.out.println("\nThank you for using!");
                break;
            }
            command = getCommand(input);
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

    public static void listVehicle(Vehicle[] vehicles, int count) {
        for (int i = 0; i < count; i++) {
            printVehicles(vehicles[i]);
        }
    }

    private static void printVehicles(Vehicle vehicles) {
        System.out.printf("%d| %s |%s |%d |$%.2f%n", vehicles.getVehicleID(),
                vehicles.getMakeModel(),
                vehicles.getColor(),
                vehicles.getOdometerReading(),
                vehicles.getPrice());
    }

    public static void findVehicleModelMake(Scanner input, Vehicle[] vehicles, int count) {
        System.out.println("What model/make are you looking for?");
        input.nextLine();
        String model = input.nextLine();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if ((vehicles[i].getMakeModel().toLowerCase()).contains(model.toLowerCase())) {
                printVehicles(vehicles[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Sorry we don't have that car in the inventory!");
        }

    }

    public static void findVehiclesByPrice(Scanner input, Vehicle[] vehicles, int count) {
        System.out.println("How much is your price range you can afford?");
        input.nextLine();
        float min = input.nextFloat();
        float max = input.nextFloat();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (vehicles[i].getPrice() > min && vehicles[i].getPrice() < max) {
                printVehicles(vehicles[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Sorry we don't have that car in the inventory!");
        }
    }

    public static void findVehicleByColor(Scanner input, Vehicle[] vehicles, int count) {
        System.out.println("What color are you looking for?");
        String color = input.nextLine();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if ((vehicles[i].getColor().toLowerCase()).contains(color.toLowerCase())) {
                printVehicles(vehicles[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Sorry we don't have that car in the inventory!");
        }

    }

    public static void addVehicle(Scanner input, Vehicle[] vehicles, int count) {
        if (count == vehicles.length) {
            System.out.println("\nThe inventory is full. We can't add more vehicles.");
            return;
        }
        System.out.println("\nPlease enter the vehicle's ID: ");
        long vehicleID = input.nextLong();
        input.nextLine();
        System.out.println("Please enter the vehicle's make/model: ");
        String make = input.nextLine();
        System.out.println("Please enter the vehicle's color: ");
        String color = input.nextLine();
        System.out.println("Please enter the vehicle's odometer: ");
        int odometer = input.nextInt();
        input.nextLine();
        System.out.print("\nPlease enter the vehicle's price: ");
        float price = input.nextFloat();

        Vehicle newVehicle = new Vehicle(vehicleID, make, color, odometer, price);
        vehicles[count] = newVehicle;
    }
}


