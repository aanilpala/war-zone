import java.awt.Graphics2D;


public class SHuman extends FightStrategy {

	public KeyboardProfile keyboardProfile;
	private int waitToFire;
	
	public SHuman(KeyboardProfile keyboardProfile) {
		theta = 0;
		waitToFire = 25;
		this.keyboardProfile = keyboardProfile;
	}
	
	@Override
	public void move(RoboFighter r, double deltaTime) {
		
		calculateMovementDirection(r.simulation);
		
		waitToFire--;
		
		if(r.ammunition > 0 && r.simulation.inputArray[keyboardProfile.fireKeyIndex] && waitToFire < 0) {
			
			waitToFire = 25;
			
			double pStepDeltaX = stepDeltaX;
			double pStepDeltaY = stepDeltaY;
			
			r.simulation.projectiles.add(new Projectile(r.x + pStepDeltaX*(r.radius),
					r.y + pStepDeltaY*(r.radius), 
					pStepDeltaX, pStepDeltaY, r.color, r.simulation, r));
			
			r.ammunition--;
		}
		
		if(r.simulation.inputArray[keyboardProfile.moveKeyIndex] || r.simulation.inputArray[keyboardProfile.reverseMoveKeyIndex]) {
			
			if(r.simulation.inputArray[keyboardProfile.reverseMoveKeyIndex]) {
				stepDeltaX *= -1;
				stepDeltaY *= -1;
			}
			
			r.x += deltaTime*stepDeltaX;
			r.y += deltaTime*stepDeltaY;
			
			int insCheck;
			
			insCheck = insideCheck(r.x, r.y, r.simulation.legend.width, r.simulation.legend.height, -1*r.radius);
			
			if(insCheck == 1) {
				stepDeltaX *= -1;
				r.x += deltaTime*2*stepDeltaX;
			}
			if(insCheck == 2) {
				stepDeltaY *= -1;
				r.y += deltaTime*2*stepDeltaY;
			}
			
			insCheck = insideCheck(r.x, r.y, r.simulation.zoneWidth, r.simulation.zoneHeight, r.radius);
			
			if(insCheck == -1) {
				stepDeltaX *= -1;
				r.x += deltaTime*2*stepDeltaX;
			}
			if(insCheck == -2) {
				stepDeltaY *= -1;
				r.y += deltaTime*2*stepDeltaY;
			}
			
			avoidCollision(r.x, r.y, r);
			
		}
		
		
		
		
		
		//calculateFireDirection(r.simulation)
	}

	private void calculateMovementDirection(Simulation simulation) {
		
		if(simulation.inputArray[keyboardProfile.moveDirectionIncKeyIndex]) theta = (theta+0.005) % 360;
		if(simulation.inputArray[keyboardProfile.moveDirectionDecKeyIndex]) theta = (theta-0.005) % 360;
		
		this.stepDeltaX = Math.cos(theta);
		this.stepDeltaY = Math.sin(theta);
	}

}
