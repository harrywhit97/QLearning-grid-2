package box;

import java.awt.Color;

/**
 * Superclass Box
 * @author harry
 *
 */
public abstract class Box {
	public static int boxSize = 20;
	protected Color color;
	protected BoxType type;
	
	public Box(Color _color){
		color = _color;
	}
	
	public Color getColor(){ 
		return color;
	}
	
	public BoxType getBoxType(){
		return type;
	}
	
	public boolean isRewardBox(){
		if(type.equals(BoxType.Target) || type.equals(BoxType.Trap)){
			return true;
		}
		return false;
	}
}
