public class Main {
    public static void main(String[] args) {

        int sayi1 = 20, sayi2 =25, sayi3= 2;

        if(sayi1 > sayi2 && sayi1>sayi2){
            System.out.println("En büyük sayi :" + sayi1);
        } else if (sayi2>sayi1 && sayi2>sayi3) {
            System.out.println("En büyük sayi :" + sayi2);
        }else if (sayi3>sayi1 && sayi3>sayi2){
            System.out.println("En büyük sayi :" + sayi3);
        }
    }
}