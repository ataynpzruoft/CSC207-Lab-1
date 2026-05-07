public class Multiples {

    static void main() {
        multipleshelper();
    }

    public static void multipleshelper() {
        int i = 1;
        int divby3or5 = 0;
        while (i < 1000) {
            boolean divisibleby3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if (divisibleby3 || divisibleBy5){
                divby3or5 ++;
            }

            i ++;
        }
        System.out.println(divby3or5);
    }
}
