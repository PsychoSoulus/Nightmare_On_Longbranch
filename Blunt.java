
public class Blunt extends Weapon
{
	public Blunt() {
		Name = "Fist";
		maxDam=5;
		minDam=1;
		equiped = true;
		small = true;
	}
	
	public Blunt(String x, int y, int z, boolean a){
		name =x;
		maxDam=y,
		minDam=z;
		equiped=false;
		small = a;
	}


}
