package javabook;

public class Book306 {
	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch(fortune) {
		 case 1:
		 case 2:
			 System.out.println("良いね!");
			 break;
		 case 3:
			 System.out.println("普通です");
			 break;
		 case 4:
		 case 5:
			 System.out.println("うーん・・・");
		}
	}
}
