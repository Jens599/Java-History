import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a Number: ");
            nums[i] = scan.nextInt();
        }

        int sum = sum(nums);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + ((double)sum/5));

    }

    private static int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
