import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char harf = 'E';

        switch (harf) {
            case 'A':
            case 'O':
            case 'I':
            case 'U':

                System.out.println("kalın ünlü");
                break;
        }
        switch (harf) {
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("ince ünlü");
                break;
        }
    }
}