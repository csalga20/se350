package se350homewokr.hw1;

import main.java.Exceptions.BadParameterException;
import main.java.Exceptions.NullParameterException;

import java.util.UUID;

public class PassengerFlight implements Flights{

    private String flightNumber;
    private String airportName;
    private String airlineName;

    public PassengerFlight(String start, String end) throws BadParameterException, NullParameterException
    {
        setFlightNumber();
    }
    public void setFlightNumber() throws BadParameterException, NullParameterException
    {
        flightNumber = String.valueOf(UUID.randomUUID());
        if (flightNumber == null)
        {
            throw new NullParameterException("No flight number generated");
        }
        if (flightNumber.length() < 0)
        {
            throw new BadParameterException("No flight number generated.");
        }
    }
    public String getFlightNumber() {
        return null;
    }
}
