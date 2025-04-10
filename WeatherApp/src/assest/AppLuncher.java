package assest;
import javax.swing.*;

public class AppLuncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			@Override
		    public void run() {
		       new WeatherAppGui().setVisible(true); // or whatever your GUI class is
			//	System.out.println(WeatherApp.getLocationData("Tokyo"));
		    //System.out.println(WeatherApp.getCurrentTime());
		    }
		});
	}
}

	