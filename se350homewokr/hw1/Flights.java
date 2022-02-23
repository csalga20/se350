package se350homewokr.hw1;

import main.java.Exceptions.BadParameterException;
import main.java.Exceptions.NullParameterException;

public interface Flights {
    public String getFlightNumber();
    public void setAirportStart(Airport airportStart) throws BadParameterException, NullParameterException;
    public void setAirportEnd(Airport airportStart) throws BadParameterException, NullParameterException;

}
