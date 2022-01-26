package se350homewokr.hw1;

import main.java.Exceptions.BadParameterException;
import main.java.Exceptions.NullParameterException;

import java.util.Objects;

public class Airport {
    private String airportName;

    public Airport(String name) throws BadParameterException, NullParameterException
    {
        setAirportName(name);
    }

    public void setAirportName(String name) throws BadParameterException, NullParameterException
    {
        if (name == null)
        {
            throw new NullParameterException("Null value passed for airport name.");
        }
        if (name.length() < 3 || name.length() > 3)
        {
            throw new BadParameterException("Name must be 3 capitalized letters.");
        }
        airportName = name.toUpperCase();
    }


    public String getAirportName() {
        return airportName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return airportName.equals(airport.airportName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airportName);
    }

    @Override
    public String toString() {
        return "Airport {" +
                " airportName = '" + getAirportName() + '\'' +
                '}';
    }
}
