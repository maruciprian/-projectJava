package javaproject;
import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("1.Piept de pui la grill cu riso");
		System.out.println("2.Fasole alintata ");
		System.out.println("3.Picioare de sarpe");
		System.out.println("Alege ce vrei sa mananci:");
		int op = sc.nextInt();
		switch(op){
		case 1: System.out.println("Ai ales optiunea 1:Piept de pui la grill cu riso");
			break;
		case 2: System.out.println("Ai ales optiunea 2:Fasole alintata");
		break;
		case 3: System.out.println("Ai ales optiunea 3:Picioare de sarpe");
		break;
		
		}
	System.out.println("Vrei sa mananci aici?:");
	System.out.println("1.Da");
	System.out.println("2.Nu");
     int op2 = sc.nextInt();
    		 switch(op2){
    		 case 1: System.out.println("Ai ales sa mananci aici");
    		 break;
    		 
    		 case 2: System.out.println("Ai ales sa mananci acasa");
    		 break;
    		 }
	}
}