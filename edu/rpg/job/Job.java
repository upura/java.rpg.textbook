package job;
public interface Job {
  /**
   * 修練度の上限値を定義する
   */
	int MAX_MASTERY = 99;
  /**
   * 職業名を返す
   *
   * @return 職業名
   */
	String getJobName();
}
