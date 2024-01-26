public class main {
    public static void main(String[] args) {

        int number = 1;

        for (int i = 0; i < 55; i++) {
            System.out.println(number + " ");

            number += 2;
    }
    }
    public static void task2(String[] args) {
        for (int i = 90; i > 0; i = i - 5)
            System.out.print(i + " ");
    }
    public static void task3(String[] args) {
        for (int i = 0, a = 2; i < 20; i++) {
            System.out.print(a + " ");
        }
    }
    public static void task3(int a){
        for (int i = -29; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i)
            }
        }
    }
    public static void task4(int a){
        int sum = 0;
        for (int i = 50; i < 150; i++) {
            sum+=i;
            System.out.println(sum);

        }
    }
}
