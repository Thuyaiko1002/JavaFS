package main;

public class Main {

	public static void main(String[] args) {
		kiemsodoixung("123123");
	}
	private static void kiemsodoixung(String input) {
		//1. Kiem tra doi xung
		StringBuilder builder = new StringBuilder(input);
		String reverseInput  = builder.reverse().toString();
		//
		boolean isOk = false;
		if(reverseInput.equals(input)) {
			System.out.println("So doi xung");
			isOk = true;
		}else {
			System.out.println("Khong phai so doi xung");
		}
		
		if(!isOk) {
			return;
		}
	}
}
