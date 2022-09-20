public class Main {
    public static void main(String[] args) {

        char grade = 'A';

        switch (grade){

            case 'A':
                System.out.println("MÜKEMMEL : geçtiniz");
                break;
            case 'B':
                System.out.println("ÇOK İYİ : geçtiniz");
                break;
            case 'C':
                System.out.println("GÜZEL : geçtiniz");
                break;
            case 'd':
                System.out.println("FENA DEĞİL : geçtiniz");
                break;
            case 'F':
                System.out.println("MAALESEF KALDINIZ");
                break;
            default:
                System.out.println("HATALI DEĞER GİRDİNİZ");
        }
    }
}