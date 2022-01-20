import java.util.Random;

public class Computer {
    public static int decidesComputerHand() {
        int computerHand;
        //課題3 Computerの手の決定とその表示
        //Randomメソッドを使って1~3の数値を返す
        int min = 0;
        int max = 2;
        Random random = new Random();
         int value = random.nextInt(max + min) + min;
         computerHand = value;

        return computerHand;


    }
}
