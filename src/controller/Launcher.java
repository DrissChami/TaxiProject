package controller;

/**
 * Launch the simulation
 * 
 * @author A. Morelle
 * @version 2013.12.30
 */
public class Launcher {

	/**
	 * Launch the simulation
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {
		ConfigReader config = new ConfigReader();
		do {
			System.out.println();
		} while (!config.getReady());
		System.out.println();
		new Simulation(config.getCityWidth(), config.getCityHeight()).run();
	}
}
