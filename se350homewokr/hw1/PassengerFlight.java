package se350homewokr.hw1;

import main.java.Exceptions.BadParameterException;
import main.java.Exceptions.NullParameterException;

import java.util.Random;
import java.util.UUID;

public class PassengerFlight implements Flights{

    private String flightNumber;
    private Airport airportName;
    private Airline airlineName;
    private int passengerCapacity;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Passenger Flight: "));
        sb.append(String.format("\nAirline: " + getAirlineName()));
        sb.append(String.format("\nAirport 1: " + getAirportStart()));
        sb.append(String.format("\nAirport 2:" + getAirportEnd()));
        sb.append(String.format("\nFlight #:" + getFlightNumber()));
        return sb.toString();
        /*
        return "PassengerFlight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", airportName=" + airportName +
                ", airlineName=" + airlineName +
                ", passengerCapacity=" + passengerCapacity +
                '}';*/
    }

    public PassengerFlight(Airline line, Airport start, Airport end) throws BadParameterException, NullParameterException
    {
        setAirlineName(line);
        setAirportStart(start);
        setAirportEnd(end);
        setFlightNumber();
        setCapacity();
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

    public void setCapacity()
    {
        Random rand = new Random();
        int min = 50;
        int max = 301;
        int randomCapicity = rand.nextInt(max - min) + min;
        passengerCapacity = randomCapicity;
    }

    public int getCapacity()
    {
        return passengerCapacity;
    }
    public String getFlightNumber() {
        return flightNumber;
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
