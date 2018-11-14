
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

	public void Attack(Character en, Character Use){
		switch (en.isBlock()){
			case true:
				break;
			case false:
				if(en.Critical()||(Use instanceof Player && Use.getInt()>11)){
					if(Math.random()<0.15){
						en.Sleep();
						break;
					}
				}
				
		}
	}
}
