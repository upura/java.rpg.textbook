package world;

import battle.Battle;
import monster.Bat;
import monster.Monster;
import monster.Rabbit;
import monster.Slime;
import personal.Character;
import personal.Gender;
import weapon.Claymore;
import weapon.Weapon;
public class BattleField {
	public static void main(String[] args) {
		//新人のインスタンス化
		Character character = new Character("新人", Gender.MALE);
		character.setPower(10);
		character.setHp(100);
		//武器を装備
		Weapon claymore = new Claymore();
		character.setWeapon(claymore);
		// スライムのインスタンス化
		Monster[] monsters = { new Slime(), new Rabbit(), new Bat() };
		//バトル！！
		try {
			Battle battle = new Battle(character, monsters);
			battle.battle();
		} catch (NullPointerException e) {
			System.out.println("Character or Monstor is Null");
			e.printStackTrace();
		} finally {
			System.out.println("Battle has been done");
		}
	}
}