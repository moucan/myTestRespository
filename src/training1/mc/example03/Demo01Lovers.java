package training1.mc.example03;

import java.util.ArrayList;

public class Demo01Lovers {
public static void main(String[] args) {
	ArrayList<Lovers>team=new ArrayList<>();
	Lovers one=new Lovers("�ź�","�½���",180712);
	Lovers tow=new Lovers("������","����",190212);
	Lovers three=new Lovers("�쳿��","���ͷ�",180112);
	
	team.add(one);
	team.add(tow);
	team.add(three);
	
	int i;
	for(i=0;i<team.size();i++) {
		Lovers lovers=team.get(i);
		lovers.wedding();
	}
}
}
