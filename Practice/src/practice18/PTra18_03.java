/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

import practice18.entitiy.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		ArrayList<Player> playerlist = new ArrayList<>();
		
	    try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
	    
            while (scanner.hasNext()) {
            	Player player = new Player();
                String line = scanner.nextLine();
                String[] list = line.split(",",0);
                player.setPosition(list[0]);
                player.setName(list[1]);
                player.setCountry(list[2]);
                player.setTeam(list[3]);
                playerlist.add(player);
                

            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }
		
		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
	    for(int i = playerlist.size()-1; i >= 0; i--) {
	        if(playerlist.get(i).getTeam().equals("レアル・マドリード")|| playerlist.get(i).getTeam().equals("バルセロナ") ) {
	        	playerlist.remove(i);
	        }
	    	
       }
		   
			

		// ★ 削除後のArrayListの中身を全件出力してください
		   for(Player item : playerlist) {
	        	System.out.println(item.toString());
	        }
		    
	}
}
