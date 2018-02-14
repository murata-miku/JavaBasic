package practice14.common;

public class Javacourse implements Course {

	private String [] courseunit = new String[7];

	public String getCourseName(){
		return "「【Eラーニング】Java」";
	}
	/**
	 * コースの単元を取得します
	 * 例）プログラミングの書き方、式と演算子　など
	 * @return
	 */
	

	
	public String[] getCourseUnit()  {
		
		
		courseunit[0] = "式と演算";
		courseunit[1] = "制御構文";
		courseunit[2] = "メソッド";
		courseunit[3] = "配列";
		courseunit[4] = "オブジェクト指向";
		courseunit[5] = "継承";
		courseunit[6] = "高度な継承";
		
		return courseunit;
	   
	}

}




	/*
	 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】Java」
	 * 単元
	 * 		式と演算
	 * 		制御構文
	 * 		メソッド
	 * 		配列
	 * 		オブジェクト指向
	 * 		継承
	 * 		高度な継承
	 */