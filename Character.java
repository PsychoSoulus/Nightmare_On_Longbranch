
public abstract class Character
{
	private String n;
	private int h;
	private boolean stun =false;
	private boolean block=false;
	public Character()
	{
		n="Null";
		h=100;
	}
	public Character(String Name, int Health)
	{
		n=Name;
		h=Health;
	}
	
	public String getName()
	{
		return n;
	}
	
	public int getHealth()
	{
		return h;
	}
	
	public void setName(String Name)
	{
		n=Name;
	}
	
	public void setHealth(int Health)
	{
		h=Health;
	}
	
	public void lessHealth(int sub)
	{
		h-=sub;
	}
	
	public void moreHealth(int plus)
	{
		h+=plus;
	}
	public boolean isDead()
	{
		if (h<=0)
			return true;
		else
			return false;
	}
	
	public boolean isStun()
	{
		return stun;
	}
	
	public void Stun()
	{
		stun=true;
	}
	
	public void UnStun()
	{
		stun = false;
	}
	public boolean isBlock() {
		return block;
	}
	public void Block() {
		block=true;
	}
	public void UnBlock(){
		block=false;
	}
	
	public abstract void Fight(Player x);
}
