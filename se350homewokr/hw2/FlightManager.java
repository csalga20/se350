package se350homewokr.hw2;

import main.java.Exceptions.BadParameterException;
import main.java.Exceptions.NullParameterException;
import se350homewokr.hw1.Airline;
import se350homewokr.hw1.Airport;
import se350homewokr.hw1.CommericalFlight;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class FlightManager {

    private static List<CommericalFlight> flights = new ArrayList();

    public static List<CommericalFlight> getInstance() throws Exception {
        if (flights == null)
        {
            flights = new ArrayList();
        }

        return flights;
    }

    private FlightManager()
    {
    }

    public static void createFlight() throws BadParameterException, NullParameterException
    {
        FlightFactory flightFactory = new FlightFactory();
        CommericalFlight commericalFlight = flightFactory.createFLight(new Airline("United"), new Airport("CHI"), new Airport("DEN"), new Date(2022, 4, 17) );
        flights.add(commericalFlight);
    }

    public static CommericalFlight getFlightByNumber(int flightNumber) throws BadParameterException, NullParameterException {
        if (flights.isEmpty()) {
            throw new NullParameterException("There is nothing in the flights list");
        }
        for (int i = 0; i < flights.size(); i++) {
            CommericalFlight cf = flights.get(i);
            if (cf.getFlightNumber().equals(flightNumber)) {
                return cf;
            }
        }
        return null;
    }


}



