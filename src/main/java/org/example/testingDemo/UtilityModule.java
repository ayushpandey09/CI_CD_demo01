package org.example.testingDemo;

public class UtilityModule {
    public String getFrequencyRange(double frequency){
        if(frequency <= 1000){
            return "Low";
        }else if(frequency > 1000 && frequency <= 10000){
            return "Medium";
        }else {
            return "High";
        }
    }
    public double getWavelength(double frequency){
        return 1/frequency;
    }
}
