package main.java.Classes;

import main.java.Exceptions.BadParameterException;
import main.java.Exceptions.NullParameterException;

import java.util.Objects;

public class Airline {
    private String airlineName;

    public Airline(String name) throws BadParameterException, NullParameterException
    {
        setAirlineName(name);
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String name) throws BadParameterException, NullParameterException
    {
        if (name == null)
        {
            throw new NullParameterException("Please enter an airline.");
        }
        if (name.length() > 8)
        {
            throw new BadParameterException("Airline name is too long. Must be less than 8 characters. ");
        }
        airlineName = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return airlineName.equals(airline.airlineName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airlineName);
    }

    @Override
    public String toString() {
        return "Airline{" +
                "airlineName='" + getAirlineName() + '\'' +
                '}';
    }
}
