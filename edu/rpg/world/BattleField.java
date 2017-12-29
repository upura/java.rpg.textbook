package world;

import battle.Battle;
import monster.Monster;
import monster.Slime;
import personal.Character;
import weapon.Claymore;
import weapon.Weapon;
public class BattleField {
	public static void main(String[] args) {
		//新人のインスタンス化
		Character character = new Character("新人", "男性");
		character.setPower(10);
		character.setHp(100);
		//武器を装備
		Weapon claymore = new Claymore();
		character.setWeapon(claymore);
		// スライムのインスタンス化
		Monster monster = new Slime();
		//バトル！！
		Battle battle = new Battle(character, monster);
		battle.battle();
	}
}