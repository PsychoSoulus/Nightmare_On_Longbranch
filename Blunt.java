
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
		switch (Use.isStun()){
			case true:
				break;
			case false:
				switch (en.isBlock()){
					case true:
						break;
					case false:
						if(en.Critical()||(Use instanceof Player && Use.getStr()>11)){
							if(Math.random()<0.15){
								en.Sleep();
							else
								en.lessHealth(Math.RandomInt(maxDam)+1);	
							break;
							}
						}
						else 
							en.lessHealth(Math.RandomInt(maxDam)+1);
						break;
					case default:
						en.lessHealth(Math.RandomInt(maxDam)+1);
						break;
				}//block switch end
				break;
		}
	}
}
