package personal;

import weapon.Weapon;

public class Character {
	private String name;
	private Gender gender;
	private Weapon weapon;
	private int hp;
	private int mp;
	private int power;
	private int defense;
	private int exp;
	private int level;

	public Character(String name, Gender gender) {
		this.name = name;
		this.gender = gender;
		this.exp = 0;
		this.level = 1;
	}

	public String getName() {
		return name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getHp() {
		return hp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getMp() {
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

	public void addExp(int exp) {
		this.exp += exp;
	}

	public void levelUp() {
		this.level++;
	}

	public int getAttackPower() {
		return weapon.getPower() + this.power;
	}

	public void sameName(String name) {
		if (this.name.equals(name)) {
			System.out.println("同じ名前です");
		} else {
			System.out.println("違う名前です");
		}
	}

	public void getCondition() {
		if (this.hp <= 0) {
			System.out.println("返事がない、ただの屍のようだ");
		}else if (this.hp <= 10) {
			System.out.println("もう駄目…");
		}else if (this.hp <= 50) {
			System.out.println("もうちょっとで駄目そう");
		}else {
			System.out.println("まだまだ大丈夫！");
		}
	}
}