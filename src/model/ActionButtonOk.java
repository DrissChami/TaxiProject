package model;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import controller.ConfigReader;

public class ActionButtonOk extends AbstractAction {
	private ConfigReader configreader;

	public ActionButtonOk(ConfigReader configreader, String message) {
		super(message);
		this.configreader = configreader;
	}

	public void actionPerformed(ActionEvent e) {
		String s1;
		String s2;
		String s3;
		String s4;

		s1 = configreader.getTF1();
		s2 = configreader.getTF2();
		s3 = configreader.getTF3();
		s4 = configreader.getTF4();

		int nombreTaxis, nombreNavettes, hauteur, largeur;
		try {
			nombreTaxis = Integer.parseInt(s1);
			nombreNavettes = Integer.parseInt(s2);
			hauteur = Integer.parseInt(s3);
			largeur = Integer.parseInt(s4);

			if (nombreTaxis < 0 || nombreNavettes < 0 || hauteur < 1
					|| largeur < 1) {
				throw new IllegalArgumentException(
						"Tous les arguments doivent être positifs.");
			}

			TaxiCompany.setNombreTaxis(nombreTaxis);
			// Shuttle.set
			configreader.setCityWidth(largeur);
			configreader.setCityHeight(hauteur);

			configreader.setReady(true);
			configreader.setVisible(false);

		} catch (NumberFormatException nfe) {
			configreader.setError("Veuillez entrer uniquement des entiers.");
		} catch (IllegalArgumentException iae) {
			configreader.setError(iae.getMessage());
		}

	}
}
