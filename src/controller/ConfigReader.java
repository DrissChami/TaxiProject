package controller;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.ActionButtonOk;

public class ConfigReader extends JFrame {

	private boolean ready;
	private int cityWidth;
	private int cityHeight;

	JTextField JTF1 = new JTextField(25);
	JTextField JTF2 = new JTextField(25);
	JTextField JTF3 = new JTextField(25);
	JTextField JTF4 = new JTextField(25);

	JLabel JLerror = new JLabel("");

	public ConfigReader() {

		super("Configuration de la simulation");

		this.ready = false;

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int frameHeight = (int) (screenSize.height * 0.30);
		int frameWidth = frameHeight;
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		// Size this window to fit the preferred size and layouts
		// of its components
		pack();
		// Center on the screen
		setLocationRelativeTo(null);

		JPanel panneau = new JPanel();

		JLabel JL1 = new JLabel("Nombre de taxis : ");
		JLabel JL2 = new JLabel("Nombre de navettes : ");
		JLabel JL3 = new JLabel("Hauteur : ");
		JLabel JL4 = new JLabel("Largeur : ");

		JButton ok = new JButton(new ActionButtonOk(this, "Ok"));

		panneau.setLayout(new FlowLayout());
		this.getContentPane().add(panneau);

		panneau.add(JL1);
		panneau.add(JTF1);
		panneau.add(JL2);
		panneau.add(JTF2);
		panneau.add(JL3);
		panneau.add(JTF3);
		panneau.add(JL4);
		panneau.add(JTF4);

		panneau.add(ok);

		panneau.add(JLerror);

		setVisible(true);

	}

	public String getTF1() {
		return JTF1.getText();
	}

	public String getTF2() {
		return JTF2.getText();
	}

	public String getTF3() {
		return JTF3.getText();
	}

	public String getTF4() {
		return JTF4.getText();
	}

	public void setError(String error) {
		JLerror.setText(error);
	}

	public void setReady(boolean newReady) {
		this.ready = newReady;
	}

	public boolean getReady() {
		return this.ready;
	}

	public void setCityWidth(int width) {
		this.cityWidth = width;
	}

	public int getCityWidth() {
		return this.cityWidth;
	}

	public void setCityHeight(int height) {
		this.cityHeight = height;
	}

	public int getCityHeight() {
		return this.cityHeight;
	}
}