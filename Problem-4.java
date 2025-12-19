public class Problem4{
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        int[] counts = new int[10]; 

        for (int divisor = 1; divisor <= 9; divisor++) {
            int count = 0;
            for (int num : arr) {
                if (num % divisor == 0) {
                    count++;
                }
            }
            counts[divisor] = count;
        }
        System.out.print("{");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ": " + counts[i]);
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}