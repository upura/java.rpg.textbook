package world;

import battle.Battle;
import monster.Bat;
import monster.Monster;
import personal.Character;
import personal.Gender;
import weapon.Claymore;
import weapon.Weapon;
public class BattleFieldCave {
	public static void main(String[] args) {
		// 新人のインスタンス化
		Character character = new Character("新人", Gender.MALE);
		character.setPower(20);
		character.setHp(500);
		// 武器を装備
		Weapon claymore = new Claymore();
		character.setWeapon(claymore);
		// 大蝙蝠のインスタンス化
		Monster monster = new Bat();
		// バトル！！
		try {
			Battle battle = new Battle(character, monster);
			battle.battle();
		} catch (NoSuchFieldError e) {
			System.out.println("CharacterかMonsterがnullです。");
			e.printStackTrace();
		} finally {
			System.out.println("戦闘が終了しました");
		}
	}
}
