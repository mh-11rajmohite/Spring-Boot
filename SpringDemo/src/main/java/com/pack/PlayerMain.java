package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class PlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext c = new FileSystemXmlApplicationContext("player.xml");
		Player p = (Player) c.getBean("player");
		System.out.println(p.getName() + " " + p.getId()+ " " + p.getSport().getName());
	}

}
