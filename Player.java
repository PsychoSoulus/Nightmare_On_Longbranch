
public class Player extends Character
{
	private int Med =0;//MEDICAL
	private int Str =0;//STRENGTH ABITIES
	private int Int =0;//INTELLIGENCE AWARENESS
	private boolean gen = false;
	private boolean FFight = true;//First Fight For tutorial
	private Character BFriend;//BEST FRIEND
	
	public Player(String name)
	{
		super.setName(name);
	}
	
	public void medUp()
	{
		Med++;
	}
	
	public void strUp()
	{
		Str++;
	}
	
	public void intUp()
	{
		Int++;
	}

	public int getMed() {
		return Med;
	}

	public int getStr() {
		return Sur;
	}

	public int getInt() {
		return Int;
	}
	
	public boolean FullHealth()
	{
		if (getHealth()==100)
			return true;
		return false;
	}
	
	public void Fight(Character x, int y)
	{
		if (!isStun())
		{
			if (y==1)
				Attack(x);
			else if (y==2)
			{
				Block(); 
				System.out.println("You Block.");
			}
			else if (y==3)
				Stun(x);
			else
				System.out.println("You panic and do nothing!");
		}
		UnStun();
		x.UnBlock();
		
	}
	
	public void Attack(Character x)
	{
		if (isStun())
		{
			
		}
		else
		{
			if (!x.isBlock())
			{
				x.setHealth(x.getHealth()-10);
				if (x.isDead())
				{
					 System.out.println("You kill "+x.getName()+"!");
				}
				else 
					System.out.println("You hit "+x.getName()+" for 10 damage!");
			}
			else 
			{
				x.setHealth(x.getHealth()-1);
				System.out.println("Your blow gances of "+x.getName()+"'s block and only does 1 damage!");
			}
		}
	}
	
	public void Stun(Character x)
	{
		x.Stun();
		System.out.println("You stun "+x.getName()+", disabling it from doing anything!");
	}

	public boolean isFFight() {
		return FFight;
	}

	public void setFFight() {
		FFight = false;
	}

	public boolean isGen() {
		return gen;
	}

	public void setGen(boolean c) {
		gen = c;
	}
	
	public void setBF(Character x){
		BFriend=x;
	}

	public Character getBF(){
		return BFriend;
	}

	
}
