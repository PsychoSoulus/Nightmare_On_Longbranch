
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.text.*;
public class Weapon {

	int maxDam;
	int minDam;
	boolean equiped;
	boolean small;
	String Name;
	
	public Weapon() {
		Name = "fist";
		maxDam=5;
		minDam=1;
		equiped = true;
		small = true;
	}
	
	public Weapon(String n, int x, int y, boolean s) {
		Name = n;
		maxDam=x;
		minDam=y;
		small=s;
	}
	
	public void setMax(int x) {
		maxDam=x;
	}
	public void setMin(int x) {
		minDam=x;
	}
	public void Equip() {
		if (equiped) 
			equiped=false;
		else
			equiped=true;
	}
	public int Max() {
		return maxDam;
	}
	public int Min() {
		return minDam;
	}
	public boolean isEquiped() {
		return equiped;
	}
	
}
