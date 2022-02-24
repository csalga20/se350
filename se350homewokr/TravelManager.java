package se350homewokr;

import main.java.Exceptions.NullParameterException;
import se350homewokr.hw1.Airline;
import se350homewokr.hw1.Airport;
import se350homewokr.hw2.FlightFactory;
import se350homewokr.hw2.FlightManager;

public class TravelManager {

    public static void main(String[] args) throws Exception, NullParameterException {
        // write your code here
        /*
            //Valid Test Cases
            Airport chicago = new Airport("CHI");
            Airport denver = new Airport("den");
            Airport newyorkcity = new Airport("nyc");

            Airline united = new Airline("United");
            Airline spirit = new Airline("Spirit");

            Date afterHw = new Date(2022, 04, 17);
            Date afterHw2 = new Date(2022, 07, 19);

            //Invalid Test Cases

            //Airport invalid = new Airport("pa");

            //Airline invalidLine = new Airline("American Airlines");

            Date backInTime = new Date(2019, 01, 18);
        */
        /*
            //Valid Tests
            //CommericalFlight test1 = new CommericalFlight(united, chicago, denver, afterHw);
            //CommericalFlight test2 = new CommericalFlight(spirit, newyorkcity, chicago, afterHw2);

            //Invalid Tests
            //Flight test3 = new Flight(invalidLine, invalid, newyorkcity, afterHw);
            //Flight test4 = new Flight(united, denver, chicago, backInTime);

            //System.out.println(test1 + "\n");
            //System.out.println(test2);

            //System.out.println(test3);
            //System.out.println(test4);
        */
        FlightManager.getInstance();
        FlightManager.createFlight("Commercial", "United", "CHI", "DEN");
        FlightManager.createFlight("Passenger", "Spirit", "NYC", "MIN");
        
        System.out.println(FlightManager.getInstance());
        System.out.println();
        //Airport tests
        Airport test1 = FlightFactory.getAirport("CHI");
        Airport test2 = FlightFactory.getAirport("CHI");
        Airport test3 = FlightFactory.getAirport("DEN");

        //Airline tests
        Airline test4 = FlightFactory.getAirline("Spirit");
        Airline test5 = FlightFactory.getAirline("United");
        Airline test6 = FlightFactory.getAirline("United");

        System.out.println("Test 1 Airport: " + test1 + " Hash code: " + test1.hashCode());
        System.out.println("Test 2 Airport: " + test2 + " Hash code: " + test2.hashCode());
        System.out.println("Test 3 Airport: " + test3 + " Hash code: " + test3.hashCode());
        System.out.println();
        System.out.println("Test 4 Airline: " + test4 + " Hash code: " + test4.hashCode());
        System.out.println("Test 5 Airline: " + test5 + " Hash code: " + test5.hashCode());
        System.out.println("Test 6 Airline: " + test6 + " Hash code: " + test6.hashCode());


    }
}
