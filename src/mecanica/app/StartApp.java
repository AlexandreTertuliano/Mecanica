package mecanica.app;

import java.sql.SQLException;

import javax.swing.JFrame;

import mecanica.frame.MecanicaFrame;

public class StartApp {

	public static void main(String[] args) throws SQLException {
		MecanicaFrame frame = new MecanicaFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.show();
		//frame.setVisible(true);
	}
	
}

