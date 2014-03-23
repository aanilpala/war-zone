
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JLayeredPane;


public class Legend extends JLayeredPane {
	
	//public RoboFighter currentlyWinning;
	//public int totalDamage;
	//public int totalKilled;
	public Vector<String> notifications;
	//public Vector<String> scoreBoard;
	
	public Simulation sim;
	
	public int width;
	public int height;

	public int maxNotificationSize;
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawString("Winning: " + sim.leadingRobot.name, 10, 30);
		g.drawString("Damage: " + sim.totalDamage, 10, 45);
		g.drawString("Kills: " + sim.totalKilled, 10, 60);
		
		g.setColor(Color.GRAY);
		
		g.drawLine(10, 70, 70, 70);
		
		int temp = maxNotificationSize < notifications.size() ? maxNotificationSize : notifications.size();  
		
		/*for(int ctr = temp; ctr > 0; ctr--) {
			g.drawString(notifications.elementAt(ctr - 1), 10, 70 + 15*(temp - ctr + 1));
		}*/
		
		for(int ctr = 0; ctr < temp; ctr++) {
			g.drawString(notifications.elementAt(notifications.size() - 1 - ctr), 10, 70 + 15*(ctr + 1));
		}
		
	}
	
	public Legend(int width, int height, Simulation sim) {
		super();
        
		setPreferredSize(new Dimension(width, height));
		this.width = width;
		this.height = height;
		
		this.sim = sim;
		this.maxNotificationSize = 5;
		this.notifications = sim.legendNotifications;
		
		setBorder(BorderFactory.createTitledBorder("War Zone Stats"));
	}
	
	public static String generateKillsNotification(RoboFighter r1, RoboFighter r2) {
		return r1.name + " killed " + r2.name;
	}
	
	public static String generateWinNotification(RoboFighter r) {
		return r.name + " won the fight!";
	}

	public void updateWarZoneData() {
		
		
	}
	
	
}
