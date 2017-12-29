package personal;

import weapon.Weapon;

public class Character {
	private String name;
	private String gender;
	private Weapon weapon;
	private int HP;
	private int MP;
	private int power;
	private int defense;

	public Character(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setHP(int HP) {
		this.HP = HP;
	}

	public int getHP() {
		return HP;
	}

	public void setMP(int MP) {
		this.HP = MP;
	}

	public int getMP() {
		return MP;
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