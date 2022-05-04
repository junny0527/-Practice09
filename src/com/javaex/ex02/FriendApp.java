package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Friend> fList = new ArrayList<Friend>();
		System.out.println("친구 3명을 등록해 주세요");
		for (int i = 0; i < 3; i++) {

			String[] practicefun = sc.nextLine().split(" ");
			fList.add(new Friend(practicefun[0], practicefun[1], practicefun[2]));
		}

		for (Friend practicefun : fList) {
			practicefun.showInfo();
		}

		sc.close();

	}

}
