package training1.mc.example02;

import java.util.ArrayList;

public class Demo01Hero {
	public static void main(String[] args) {
		ArrayList<Hero>team=new ArrayList<>();
		Hero one=new Hero("Τ³˹",200);
		Hero tow=new Hero("��Ī",200);
		Hero three=new Hero("�������",200);
		Hero four=new Hero("����˿",200);
		Hero five=new Hero("����",400);
		
		team.add(one);
		team.add(tow);
		team.add(three);
		team.add(four);
		team.add(five);
		
		int i;
		int sum=0;
		for(i=0;i<team.size();i++) {
			Hero hero=team.get(i);
			System.out.println("Ӣ�ۣ�"+hero.getName()+";ս������"+hero.getAttack());
			sum+=hero.getAttack();
		}
		System.out.println("ƽ��ս������"+sum/5);
		
	}
}
