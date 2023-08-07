package org.example.testingDemo;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UtilityModuleTesting {
    private UtilityModule utilityModule;
    private final Logger logger = (Logger) LoggerFactory.getLogger(UtilityModuleTesting.class);
    @Before
    public void init(){
        utilityModule = new UtilityModule();
        logger.info("Before Testing");
    }

    @Test
    public void getFrequencyTest(){
        logger.info("Frequency Test...");
        Assert.assertEquals("Low",utilityModule.getFrequencyRange(105));
        Assert.assertEquals("High",utilityModule.getFrequencyRange(20000));
        Assert.assertEquals("Medium", utilityModule.getFrequencyRange(1050));
    }

    @Test
    public void getBandwidthTest(){
        logger.info("Bandwidth Test...");
        Assert.assertEquals((double) 1 /400,utilityModule.getWavelength(400),0.1);
        Assert.assertEquals((double) 1 /50,utilityModule.getWavelength(50),0.1);
    }
}
