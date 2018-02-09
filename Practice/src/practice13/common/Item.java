package practice13.common;

public class Item {


	private String name;
	private int addtionalDamage;
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	
	public void setAddtionalDamage(int addtionalDamage) {
		this.addtionalDamage = addtionalDamage;
	}

	public int getAddtionalDamage() {
		return addtionalDamage;
	}

	
	public Item(String name,int addtionalDamage){
		this.name = name;
		this.addtionalDamage = addtionalDamage;
	}
	
}



/*
 * ★ common.Itemクラスを作成してください
 *
 * フィールド
 * 		name	:	String
 * 		additionalDamage	:	int
 * メソッド
 * 		各フィールドのアクセサ
 * コンストラクタ
 * 		name, additionalDamageに初期値を設定するコンストラクタ
 * 		上記2つを設定するための引数を持つ
 */


