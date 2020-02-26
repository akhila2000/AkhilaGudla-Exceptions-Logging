package com.vnrvjiet.Akhila_InterestCalculator;
import org.apache.logging.log4j.*;
public class InterestCalculate implements Calculate {
	private static final Logger logger = LogManager.getLogger(InterestCalculate.class);
	public double calculateSimpleInterest(double principleAmount, double time, double rateOfInterest) {
		// TODO Auto-generated method stub
		logger.info("In calculateSimpleInterest method");
		return (principleAmount * time * rateOfInterest) / 100.0;
	}

	public double calculateCompoundInterest(double principleAmount, double time, double rateOfInterest) {
		// TODO Auto-generated method stub
		logger.info("In calculateCompoundInterest method");
		return principleAmount * Math.pow((1+rateOfInterest/100), time);
	}
	
}
