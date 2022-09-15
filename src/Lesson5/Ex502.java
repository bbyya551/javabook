package Lesson5;

public class Ex502 {
	public static void email(String title, String address, String text) {
		String mail_title = title;
		String mail_address = address;
		String mail_text = text;
		System.out.println(mail_address + "に、以下のメールを送信しました");
		System.out.println("件名: " + mail_title);
		System.out.println("本文: " + mail_text);
	}
	
	public static void main(String[] args) {
		email("お疲れ様です", "a@a", "読書会を開催します");
	}
}
