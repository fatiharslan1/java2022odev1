public class Main {
    public static void main(String[] args) {

        int number = 1;
        int remainder = number % 1;
        //System.out.println(remainder);
        boolean isprime = true;


        if(number==1){
            System.out.println("sayı asal değildir");
            return;
        }
        if (number < 1) {
            System.out.println("geçersiz sayı");
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isprime = false;
            }
        }
        if (isprime) {
            System.out.println("sayı asal");
        } else {
            System.out.println("sayı asal değil");
        }

    }
}