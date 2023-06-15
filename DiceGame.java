import java.util.Random;
class DiceGame{
    public static void main(String[] args){
        Random rand = new Random();

        int a = rand.nextInt(6)+1;
        int b = rand.nextInt(6)+1;

        System.out.println("Rolling dice");
        System.out.println("Dice 1: "+a);
        System.out.println("Dice 2:"+b);
        int num = a+b;
        System.out.println("Total value: "+num);

        if(num<8) System.out.println("You lost");
        else System.out.println("You won");

    }
}



