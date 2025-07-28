package org.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class AircraftFeed {
    @JsonProperty("version")
    private final int version = 2;

    @JsonProperty("aircraft")
    private final List<VrsAir> aircraft;

    public AircraftFeed(List<VrsAir> aircraft) {
        this.aircraft = aircraft;
    }

    public int getVersion() {
        return version;
    }

    public List<VrsAir> getAircraft() {
        return aircraft;
    }
}