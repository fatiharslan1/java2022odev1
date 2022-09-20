public class Main {
    public static void main(String[] args) {

        int[] sayilar = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int aranacak = 5;
        boolean varMı = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMı = true;
            }
        }
        if (varMı) {
            System.out.println("sayı mevcut");
        } else {
            System.out.println("sayı mevcut değil");
        }
    }
}