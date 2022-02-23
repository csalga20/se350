package se350homewokr.hw2;

import main.java.Exceptions.BadParameterException;
import main.java.Exceptions.NullParameterException;
import se350homewokr.hw1.Airline;
import se350homewokr.hw1.Airport;
import se350homewokr.hw1.CommericalFlight;
import se350homewokr.hw1.Flights;

import java.util.Date;

public class FlightFactory {

    private FlightFactory()
    {
    }
    public static Flights createFLight(String type, Airline line, Airport airStart, Airport airEnd, Date date) throws BadParameterException, NullParameterException
    {
        if(line == null || airStart == null || airEnd == null || date == null)
        {
            throw new NullParameterException("There are empty values that are required.");
        }
        if (type.equals("Commercial"))
        {
            return new CommericalFlight(line, airStart, airEnd, date);
        }
        else if (type.equals("passengerFlight"))
        {
            return null;
        }
        else
            return null;
    }

}
