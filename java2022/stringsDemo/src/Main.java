import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugün hava güzel.";
        System.out.println(mesaj);
/*
        System.out.println("Elaman sayısı: " + mesaj.length());
        System.out.println("5. elaman :" + mesaj.charAt(4));
        System.out.println( mesaj.concat("Yaşasın!"));
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("."));

        char[] karakterler = new char[10];
        mesaj.getChars(0, 10, karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('u'));
        System.out.println(mesaj.lastIndexOf('l'));*/


        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2, 6));

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);


        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }
}