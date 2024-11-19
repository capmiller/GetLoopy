import java.util.Random;

public class Task8
{
    public static void main(String[] args) {
        boolean done = false;
        System.out.println("Roll" + "   " +  "Die1" + "   " + "Die2" + "   " + "Die3" + "   " + "Sum");
        System.out.println("-------------------------------");
        Random rand = new Random();
        for (int i = 1; !done; i++) {
            int num1 = rand.nextInt(5) + 1;
            int num2 = rand.nextInt(5) + 1;
            int num3 = rand.nextInt(5) + 1;
            int sum = num1 + num2 + num3;
            System.out.printf("%-5d %-5d %-5d %-5d %-5d%n", i, num1, num2, num3, sum);
            if (num1 == num2 && num2 == num3) {
                done = true;
            }
        }
    }
}
