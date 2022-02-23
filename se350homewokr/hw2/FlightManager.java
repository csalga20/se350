package se350homewokr.hw2;

import main.java.Exceptions.BadParameterException;
import main.java.Exceptions.NullParameterException;
import se350homewokr.hw1.Airline;
import se350homewokr.hw1.Airport;
import se350homewokr.hw1.Flights;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class FlightManager {

    private static List<Flights> flights;// = new ArrayList();

    public static List<Flights> getInstance() {
        if (flights == null)
        {
            flights = new ArrayList();
        }

        return flights;
    }

    private FlightManager()
    {
    }

    public static void createFlight(String type, String airline, String start, String end) throws BadParameterException, NullParameterException
    {
        Flights paassengerFlight = FlightFactory.createFLight(type,new Airline(airline), new Airport(start), new Airport(end), new Date(2022, 4, 17) );
        Flights commericalFlight = FlightFactory.createFLight(type,new Airline(airline), new Airport(start), new Airport(end), new Date(2022, 4, 17) );
        flights.add(commericalFlight);
        //flights.add(paassengerFlight);
        System.out.println(flights.get(0));
        //System.out.println(flights.get(1));
    }

    public static Flights getFlightByNumber(int flightNumber) throws BadParameterException, NullParameterException {
        if (flights.isEmpty()) {
            throw new NullParameterException("There is nothing in the flights list");
        }
        for (int i = 0; i < flights.size(); i++) {
            Flights cf = flights.get(i);
            if (cf.getFlightNumber().equals(flightNumber)) {
                return cf;
            }
        }
        return null;
    }


}



