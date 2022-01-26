package se350homewokr.hw1;

import main.java.Exceptions.BadParameterException;
import main.java.Exceptions.NullParameterException;
import se350.assignments.homework1.Classes.Airline;
import se350.assignments.homework1.Classes.Airport;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Flight {
    private se350.assignments.homework1.Classes.Airline airline;
    private se350.assignments.homework1.Classes.Airport airportStart;
    private se350.assignments.homework1.Classes.Airport airportEnd;
    private String flightNumber;
    private Date departureTime;

    public Flight(se350.assignments.homework1.Classes.Airline line, se350.assignments.homework1.Classes.Airport airStart, se350.assignments.homework1.Classes.Airport airEnd, Date date)
        throws BadParameterException, NullParameterException
    {
        setAirline(line);
        setAirportStart(airStart);
        setAirportEnd(airEnd);
        setFlightNumber();
        setDepartureTime(date);
    }

    public void setAirline(se350.assignments.homework1.Classes.Airline line) throws BadParameterException, NullParameterException
    {
        airline = line;
    }

    public void setAirportStart(se350.assignments.homework1.Classes.Airport airStart) throws BadParameterException, NullParameterException
    {
        airportStart = airStart;
    }

    public void setAirportEnd(se350.assignments.homework1.Classes.Airport airEnd) throws BadParameterException, NullParameterException
    {
        airportEnd = airEnd;
    }


    public String getFlightNumber() {
        return flightNumber;
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

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date date) throws BadParameterException, NullParameterException
    {
        Date when = new Date(2022, 01, 19);
        if (date == null)
        {
            throw new NullParameterException("Please enter a date for the flight");
        }
        if (date.before(when) == true)
        {
            throw new BadParameterException("Please enter a valid date after the submission date. (2022-01-19)");
        }
        departureTime = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return airline.equals(flight.airline) && airportStart.equals(flight.airportStart) && airportEnd.equals(flight.airportEnd) && flightNumber.equals(flight.flightNumber) && departureTime.equals(flight.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airline, airportStart, airportEnd, flightNumber, departureTime);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Airline: " + getAirline()));
        sb.append(String.format("\nAirport 1: " + getAirportStart()));
        sb.append(String.format("\nAirport 2:" + getAirportEnd()));
        sb.append(String.format("\nFlight #:" + getFlightNumber()));
        sb.append(String.format("\nDeparture date:" + getDepartureTime()));
        return sb.toString();
        /*return "Flight \n{" +
                "\n airline = " + getAirline() +
                ",\n airportStart = " + getAirportStart() +
                ",\n airportEnd = " + getAirportEnd() +
                ",\n flightNumber ='" + getFlightNumber() + '\'' +
                ",\n departureTime =" + getDepartureTime() +
                "\n}";

         */
    }

    public Airline getAirline() {
        return airline;
    }

    public se350.assignments.homework1.Classes.Airport getAirportStart() {
        return airportStart;
    }

    public Airport getAirportEnd() {
        return airportEnd;
    }
}
