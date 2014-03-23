import java.awt.Graphics2D;


public class HumanControlledFighter extends RoboFighter {
	
	public static int strength;
	
	@Override
	public void draw(Graphics2D g2d) {
		super.draw(g2d);
		
		//int width = g2d.getFontMetrics().charsWidth("(H)".toCharArray(), 0, name.length());
		
		g2d.drawString("(H)", (int) (x+radius*Math.cos(strategy.theta)), (int) (y+radius*Math.sin(strategy.theta)));
	}
	
	public HumanControlledFighter(int radius, String name, int ammunition,
			Simulation simulation, KeyboardProfile keyboardProfile) {
		super(radius, simulation);
		
		this.isHuman = true;
		this.strategy = new SHuman(keyboardProfile);
		this.indStrength = strength;
		this.simulation = simulation;
		this.ammunition = ammunition;
		this.name = name;
	}

}
