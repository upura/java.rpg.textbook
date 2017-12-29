package personal;

import weapon.Weapon;

public class Character {
	private String name;
	private GenderType gender;
	private Weapon weapon;
	private int hp;
	private int mp;
	private int power;
	private int defense;

	public Character(String name, GenderType gender) {
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public GenderType getGender() {
		return gender;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setHP(int hp) {
		this.hp = hp;
	}

	public int getHP() {
		return hp;
	}

	public void setMP(int mp) {
		this.mp = mp;
	}

	public int getMP() {
		return mp;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getPower() {
		return power;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getDefense() {
		return defense;
	}
}