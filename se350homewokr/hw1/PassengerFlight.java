package se350homewokr.hw1;

import main.java.Exceptions.BadParameterException;
import main.java.Exceptions.NullParameterException;

import java.util.UUID;

public class PassengerFlight implements Flights{

    private String flightNumber;
    private Airport airportName;
    private Airline airlineName;



    public PassengerFlight(Airline line, Airport start, Airport end) throws BadParameterException, NullParameterException
    {
        setAirlineName(line);
        setAirportStart(start);
        setAirportEnd(end);
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
    public Airport getAirportStart() {
        return airportName;
    }

    public void setAirportStart(Airport airportName) {
        this.airportName = airportName;
    }
    public Airport getAirportEnd() {
        return airportName;
    }
    public void setAirportEnd(Airport airportName) {
        this.airportName = airportName;
    }

    public Airline getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(Airline airlineName) {
        this.airlineName = airlineName;
    }
}
