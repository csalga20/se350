package se350homewokr.hw2;

import main.java.Exceptions.BadParameterException;
import main.java.Exceptions.NullParameterException;
import se350homewokr.hw1.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FlightFactory {

    private static Map <String, Airline> airlineCache = new HashMap<>();
    private static Map <String, Airport> airportCache = new HashMap<>();

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
        else if (type.equals("Passenger"))
        {
            return new PassengerFlight(line, airStart, airEnd);
        }
        else
            return null;
    }
    public static Airline getAirline(String airlineName)
    {
        return airlineCache.computeIfAbsent(airlineName, name -> {
            try {
                return new Airline(airlineName);
            } catch (BadParameterException e) {
                e.printStackTrace();
            } catch (NullParameterException e) {
                e.printStackTrace();
            }
            return null;
        });
    }
    public static Airport getAirport(String airportName)
    {
        return airportCache.computeIfAbsent(airportName, name -> {
            try {
                return new Airport(airportName);
            } catch (BadParameterException e) {
                e.printStackTrace();
            } catch (NullParameterException e) {
                e.printStackTrace();
            }
            return null;
        });
    }


}
