package main.java;

import main.java.Classes.Airline;
import main.java.Classes.Airport;
import main.java.Classes.Flight;
import main.java.Exceptions.BadParameterException;
import main.java.Exceptions.NullParameterException;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws BadParameterException, NullParameterException {
	// write your code here
        System.out.println("test");

        //Valid Test Cases
        Airport chicago = new Airport("CHI");
        Airport denver = new Airport("den");
        Airport newyorkcity = new Airport("nyc");

        Airline united = new Airline("United");
        Airline spirit = new Airline("Spirit");

        Date afterHw = new Date(2022, 04, 17);
        Date afterHw2 = new Date(2022, 07, 19);

        //Invalid Test Cases
        /*
        Airport invalid = new Airport("pa");


        Airline invalidLine = new Airline("American Airlines");

        Date backInTime = new Date(2019, 01, 18);
        */
        //Valid Tests
        Flight test1 = new Flight(united, chicago, denver, afterHw);
        Flight test2 = new Flight(spirit, newyorkcity, chicago, afterHw2);

        //Invalid Tests
        /*
        Flight test3 = new Flight(invalidLine, invalid, newyorkcity, afterHw);
        Flight test4 = new Flight(united, denver, chicago, backInTime);
         */

        System.out.println(test1);
        System.out.println(test2);


        //System.out.println(test3);
        //System.out.println(test4);

    }
}
