package by.HCI.arraylisttest;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	static ArrayList<Mobile> mobiles = new ArrayList<Mobile>();
	static Random r = new Random();

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++){
			mobiles.add(new Mobile("Samsung" + i, r.nextInt(99999)));
		}
		for(Mobile m: mobiles){
			System.out.println(m.getName() + " " + m.getId());
		}
		

	}

}
