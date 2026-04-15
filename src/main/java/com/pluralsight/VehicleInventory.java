package com.pluralsight;

public class VehicleInventory {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[20];
        int count = 0;
        Vehicle vehicle1= new Vehicle(101121,"FordExplorer","Red",45000,13500);
        vehicles[count]= vehicle1;
        count++;
        Vehicle vehicle2= new Vehicle(101122,"Toyota Camry","Blue",60000,11000);
        vehicles[count]= vehicle2;
        count++;
        Vehicle vehicle3= new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700);
        vehicles[count]= vehicle3;
        count++;
        Vehicle vehicle4= new Vehicle(101124,"Honda Civic","White",70000,7500);
        vehicles[count]= vehicle4;
        count++;
        Vehicle vehicle5 = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        vehicles[count]= vehicle5;
        count++;
        Vehicle vehicle6 = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);
        vehicles[count]= vehicle6;
        count++;



        }


}
