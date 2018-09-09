package training1.mc.example01;

import java.util.ArrayList;

public class Demo01Sdudent {
	public static void main(String[] args) {
		ArrayList<Sdudent> team = new ArrayList<>();

		Sdudent one = new Sdudent("黄芪", 12);
		Sdudent tow = new Sdudent("花椒", 15);
		Sdudent three = new Sdudent("党参", 14);
		Sdudent four = new Sdudent("当归", 11);

		team.add(one);
		team.add(tow);
		team.add(three);
		team.add(four);

		int i;
		for (i = 0; i < team.size(); i++) {
			Sdudent sdudent1 = team.get(i);
			if (i != team.size() - 1) {
				Sdudent sdudent2 = team.get(i + 1);
				sdudent1.sayHellow(sdudent2.getName());
			} else {
				Sdudent sdudent2 = team.get(0);
				sdudent1.sayHellow(sdudent2.getName());
			}
		}
	}
}
