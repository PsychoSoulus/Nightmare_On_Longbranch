import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;
public class CombatEncounter 
{
	
	public CombatEncounter(Player p, Character c, Scanner x)
	{
		int at = 0;
		
		System.out.println("You encounter "+c.getName());
		if(p.isFFight())
		{
			System.out.println("Fighting directions are as follows:\nIt is turned based fighting. You can do three moves usually.\nYou can \n1.Attack ~ doing damage to an unblocking target\n2.Block ~ typically lowers the damage done to you to 1\n3.Stun ~ Stops the enemy from doing any move this turn");
			p.setFFight();
		}
		while (!p.isDead()||!c.isDead())
		{
			System.out.println("You have "+p.getHealth()+" health. "+c.getName()+" has "+c.getHealth()+" health.\n");
			
			if (!p.isStun())
			{
				System.out.println("What do you want to do?\n1.Attack\n2.Block\n3.Stun");
				at = x.nextInt();
				p.Fight(c, at);
			}

			else if (p.isStun())
			{
				System.out.println("You are stunned and can do nothing");
				p.UnStun();;
			}
			
			if (c.isDead())
				break;

			c.Fight(p);
			
			if (p.isDead())
				break;
			
		}
		x.close();

	}


}


