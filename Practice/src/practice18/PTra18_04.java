/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entitiy.Player;

public class PTra18_04 {

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
	    
		Collections.shuffle(playerlist);

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		int GKcount = 0;
		int DFcount = 0;
		int MFcount = 0;
		int FWcount = 0;
		
		 for(int i = playerlist.size()-1; i >= 0; i--) {
		        if(playerlist.get(i).getPosition().equals("GK")) {
		        	if(GKcount < 1) {
		        		System.out.println(playerlist.get(i).toString());
			        	GKcount++;	
		        	}
		        
		        }      	
		        
		        if(playerlist.get(i).getPosition().equals("DF")) {
		        	if(DFcount < 4) {
		        		System.out.println(playerlist.get(i).toString());
		        		DFcount++;
		        	}
		        }      	
		        
		        if(playerlist.get(i).getPosition().equals("MF")) {
		        	if(MFcount < 4) {
		        		System.out.println(playerlist.get(i).toString());
		        		MFcount++;
		        	}
		        } 
		        
		        if(playerlist.get(i).getPosition().equals("FW")) {
		        	if(FWcount < 2) {
		        		System.out.println(playerlist.get(i).toString());
		        		FWcount++;
		        	}
		        }     
	}

	}
	}





