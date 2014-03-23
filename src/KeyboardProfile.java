




public class KeyboardProfile {
	
	public int fireDirectionIncKeyIndex;
	public int fireDirectionDecKeyIndex;
	public int moveDirectionIncKeyIndex;
	public int moveDirectionDecKeyIndex;
	public int fireKeyIndex;
	public int moveKeyIndex;
	public int reverseMoveKeyIndex;
	
	
	public KeyboardProfile(int moveDirectionIncKeyIndex, int moveDirectionDecKeyIndex,
			int reverseMoveKeyIndex, int moveKeyIndex, int fireKeyIndex) {
		
		this.moveDirectionIncKeyIndex = moveDirectionIncKeyIndex;
		this.moveDirectionDecKeyIndex = moveDirectionDecKeyIndex;
		this.fireKeyIndex = fireKeyIndex;
		this.moveKeyIndex = moveKeyIndex;
		this.reverseMoveKeyIndex = reverseMoveKeyIndex;
		
	}
	
	
	
}
