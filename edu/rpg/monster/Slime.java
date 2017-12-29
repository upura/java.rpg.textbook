package monster;
import battle.BattlePattern;
public class Slime extends Monster {
	public Slime() {
		super("スライム", 5, 10, 5);
	}
	public BattlePattern getBattlePattern() {
		return BattlePattern.ONE;
	}
}
