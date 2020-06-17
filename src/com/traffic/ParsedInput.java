package com.traffic;

import java.util.Objects;

public class ParsedInput {
    private final int orbit1SpeedLimit;
    private final int orbit2SpeedLimit;
    private final String weatherString;

    public ParsedInput(String weatherString, int orbit1SpeedLimit, int orbit2SpeedLimit) {
        this.weatherString = weatherString;
        this.orbit1SpeedLimit = orbit1SpeedLimit;
        this.orbit2SpeedLimit = orbit2SpeedLimit;
    }

    public int getOrbit1SpeedLimit() {
        return orbit1SpeedLimit;
    }

    public int getOrbit2SpeedLimit() {
        return orbit2SpeedLimit;
    }

    public String getWeatherString() {
        return weatherString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParsedInput)) return false;
        ParsedInput that = (ParsedInput) o;
        return orbit1SpeedLimit == that.orbit1SpeedLimit &&
                orbit2SpeedLimit == that.orbit2SpeedLimit &&
                Objects.equals(weatherString, that.weatherString);
    }
}
