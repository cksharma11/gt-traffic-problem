package com.traffic;

import java.io.*;

public class Parser {
    public ParsedInput parseInput(String filePath) throws IOException {
        File inputFile = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(inputFile));

        String inputString;
        String[] inputs = new String[3];
        while ((inputString = br.readLine()) != null) {
            inputs = inputString.split(" ");
        }
        String weatherString = inputs[0];
        int orbit1SpeedLimit = Integer.parseInt(inputs[1]);
        int orbit2SpeedLimit = Integer.parseInt(inputs[2]);

        return new ParsedInput(weatherString, orbit1SpeedLimit, orbit2SpeedLimit);
    }
}
