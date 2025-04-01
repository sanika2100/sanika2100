public class thousand {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers from 1 to 1000:");

        for (int num = 1; num <= 1000; num++) {
            int originalNum = num;
            int sum = 0;
            int temp = num;

            while (temp != 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp = temp / 10;
            }
            if (sum == originalNum) {
                System.out.println(originalNum);
            }
        }
    }
}