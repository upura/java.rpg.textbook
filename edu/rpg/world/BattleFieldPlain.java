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
public class BattleFieldPlain {
	public static void main(String[] args) {
		// 新人のインスタンス化
		Character character = new Character("先輩", Gender.MALE);
		character.setPower(40);
		character.setHp(200);
		// 武器を装備
		Weapon claymore = new Claymore();
		character.setWeapon(claymore);
		// モンスターリストの生成
		Monster[] monsters = { new Slime(), new Rabbit(), new Bat() };
		// バトル！！
		Battle battle = new Battle(character, monsters);
		battle.battle();
	}
}
