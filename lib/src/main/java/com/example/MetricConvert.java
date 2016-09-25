package com.example;

public class MetricConvert
{
    // declare constants
    public static final double meterToYardConversion = 1.09361, kmToMilesConversion = .62137, cmToInchesConversion = .39370, kmhToMphConversion = 1.609344, litersToGallonConversion = .26417, kgsToPoundsConversion = 2.2046;

    public static void main(String[] args)
    {

        // declare variables
        //double meterToYardConversion = 1.09361, kmToMilesConversion = .62137, cmToInchesConversion = .39370, kmhToMphConversion = 1.609344, litersToGallonConversion = .26417, kgsToPoundsConversion = 2.2046;
        int meters = 28, kilometers = 168, centimeters = 47, kilometersPerHour = 27, liters = 92, kilograms = 200;
        double miles, yard, inches, milesPerHour, gallons, pounds;

        // formulas that convert from one unit to another
        yard = meters * meterToYardConversion;
        miles = kilometers * kmToMilesConversion;
        inches = centimeters * cmToInchesConversion;
        milesPerHour = (kilometersPerHour / kmhToMphConversion);
        gallons = liters * litersToGallonConversion;
        pounds = kilograms * kgsToPoundsConversion;

        // Outputs converted English measurements
        System.out.println(meters + " meters = " + yard + " yards");
        System.out.println(kilometers + " kilometers = " + miles + " miles");
        System.out.println(centimeters + " centimeters = " + inches + " inches");
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mph");
        System.out.println(liters + " liters = " + gallons + " gallons");
        System.out.println(kilograms + " kg = " + pounds + " lb");
    }

}
