
public abstract class Character
{
	private String n;
	private int h;
	private int mh;
	private boolean stun =false;
	private boolean block=false;
	public Character()
	{
		n="Null";
		mh=100;
		h=mh;
	}
	public Character(String Name, int Health)
	{
		n=Name;
		mh=Health;
		h=mh;
	}
	
	public Character(String Name, int MHealth, int Health){
		n=name;
		mh=MHealth;
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
	
	public boolean Critical(){
	if (h<=mh/10)
		return true;
	else
		return false;
	}
	
	public abstract void Fight(Player x);
}
