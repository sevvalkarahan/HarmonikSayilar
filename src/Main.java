import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double toplam=0;
        Scanner inp=new Scanner(System.in);
        System.out.println("Harmonik Sayı Formülü \n" +
                "1+1/2+1/3+...+1/n");
        System.out.print("n sayısı giriniz: ");
        int n=inp.nextInt();
        for (int i = 1; i <=n ; i++) {
            toplam+=(1.0/i);
        }
        System.out.println("Cevap: "+toplam);
    }
}
