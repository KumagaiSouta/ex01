import java.util.Random;
import java.util.Scanner;

class DiceGame{
    public static void main(String[] args){
        Random rand = new Random();
	Scanner scanner = new Scanner(System.in);
        int a = rand.nextInt(6)+1;
        int b = rand.nextInt(6)+1;
	System.out.println("What is your name");
	String name = scanner.next();
	System.out.println("Hello,"+name+"!");
	
        System.out.println("Rolling dice");
        System.out.println("Dice 1: "+a);
        System.out.println("Dice 2:"+b);
        int num = a+b;
        System.out.println("Total value: "+num);
	if(num<8) System.out.println(name+" lost!");
        else System.out.println(name+" won!");
    }
}



