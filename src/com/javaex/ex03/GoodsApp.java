package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Goods> goods = new ArrayList<>();
		System.out.println("상품을 입력해주세요(종료 q)");
		String[] input = null;
		boolean value = true;

		while (value) {
			input = sc.nextLine().split(",");
			if ("q".equals(input[0])) {
				break;
			}
			goods.add(new Goods(input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2])));
		}
		System.out.println("[입력완료]");
		System.out.println("=========================");
	
		for(Goods g :goods) {
	         g.showInfo();
	      }
		Goods.showTotal();

		sc.close();
	}
}
