package training1.mc.example02;

import java.util.ArrayList;

public class Demo01Hero {
	public static void main(String[] args) {
		ArrayList<Hero>team=new ArrayList<>();
		Hero one=new Hero("韦鲁斯",200);
		Hero tow=new Hero("提莫",200);
		Hero three=new Hero("伊泽瑞尔",200);
		Hero four=new Hero("拉克丝",200);
		Hero five=new Hero("盖伦",400);
		
		team.add(one);
		team.add(tow);
		team.add(three);
		team.add(four);
		team.add(five);
		
		int i;
		int sum=0;
		for(i=0;i<team.size();i++) {
			Hero hero=team.get(i);
			System.out.println("英雄："+hero.getName()+";战斗力："+hero.getAttack());
			sum+=hero.getAttack();
		}
		System.out.println("平均战斗力："+sum/5);
		
	}
}
