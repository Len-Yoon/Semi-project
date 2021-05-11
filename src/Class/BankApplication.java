package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {
	
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Account> arr = new ArrayList<Account>();

	//main
	public static void main(String args[]) {
		
		int num = 0;
		
		while(num != 5) {
			
			System.out.println("============================================");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5.종료");
			System.out.println("============================================");
			
			System.out.print("INPUT NUMBER : ");
			num = sc.nextInt();
			
			switch(num) {
			
			case 1:	createAccount(); break;
			case 2:	accountList(); break;
			case 3: deposit(); break;
			case 4: withdraw(); break;
			case 5: System.exit(0); break;
			
			}
			
		}
	}
	
	//찾기
	private static Account find(String ano) {
		
		Account acc2 = null;		
		
		for(int i =0; i<arr.size();i++) {
			
			if(arr.get(i).getAno().equals(ano)) {
				acc2 = arr.get(i);
			}			
		}
		return acc2;
	}

	//인출
	private static void withdraw() {

		System.out.print("INPUT ACC NUMBER : ");
		String ano = sc.next();
		
		System.out.print("INPUT ACC BALANCE : ");
		int balance = sc.nextInt();
		
		Account acc = find(ano);
		acc.setBalance(acc.getBalance() - balance);	
		
	}

	//예금
	private static void deposit() {
		
		System.out.print("INPUT ACC NUMBER : ");
		String ano = sc.next();
		
		System.out.print("INPUT ACC BALANCE : ");
		int balance = sc.nextInt();
		
		Account acc = find(ano);
		acc.setBalance(acc.getBalance() + balance);	
		
	}

	//목록
	private static void accountList() {
		
		for(int i = 0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
	}

	//생성
	private static void createAccount() {
		
		System.out.println("=========");
		System.out.println("계좌생성");
		System.out.println("=========");
		
		System.out.print("INPUT ACCOUNT NUMBER : ");
		String ano = sc.next();
		
		System.out.print("INPUT ACCOUNT OWNER : ");
		String owner = sc.next();
		
		System.out.print("INPUT ACCOUNT BALANCE : ");
		int balance = sc.nextInt();
		
		Account acc = new Account(ano, owner, balance);
        
       arr.add(acc);
		
		
	}
	

}





















