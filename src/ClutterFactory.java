//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : ClutterFactory.java
//  @ Date : 3/29/2013
//  @ Author : 
//
//


public abstract class ClutterFactory {
	Simulation simulation;
	public int minStrength, maxStrength;
	
	public ClutterFactory(Simulation simulation) {
		this.simulation = simulation;
	}

	public Clutter createClutter() {
		return null;
	}
}