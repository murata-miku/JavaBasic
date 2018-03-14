package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

import java.util.Scanner;

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		
		
		Car[] cars = new Car[3];
		final int distance = 300;
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		

		
		for(int i =0; i <cars.length; i++) {
			System.out.println("本日のメインレースの車が登場します");
			System.out.println("エントリーno" + (i + 1));
			
			System.out.println("\"シリアル№、車体カラー、ガソリン量をカンマ区切りで入力してください\"");
			String line = scanner.nextLine();
			String [] carlist = line.split(",",0);
			
			cars[i] = new Car();
			cars[i].serialNo =Integer.parseInt(carlist[0]) ;
			cars[i].color = carlist[1];
			cars[i].gasoline = Integer.parseInt(carlist[2]);
			
		}
		
		for(int i =0; i < cars.length; i++) {
			int sum = 0;
			int count = 0;
			while(true) {
				int run = cars[i].run();
				sum += run;
				count++;
				
				if(run == -1) {
					System.out.println(cars[i].color + "色の" + cars[i].serialNo +  "番"+  ":目的地に到達できませんでした");
					break;
				}
				
				if(sum >= distance) {
					System.out.println(cars[i].color + "色の" +cars[i].serialNo  +  "番"+"：目的地までに" + count + "かかりました。残りのガソリンは、" + cars[i].gasoline + "リットルです");
					break;
				}
				
			}
		}
		}
 

	}
	

		
		


