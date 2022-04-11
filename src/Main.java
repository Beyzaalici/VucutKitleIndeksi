import java.awt.*;
import java.util.Scanner;

public class Main {
    /*
     Vücut Kitle İndeksi Hesaplama
     Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıda ki formüle göre kullanıcının
    "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

    Formül
     Kilo (kg) / Boy(m) * Boy(m)

    Çıktısı
    Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
    Lütfen kilonuzu giriniz : 105
    Vücut Kitle İndeksiniz : 35.49215792320173
     */
    public static void main(String[] args) {
        double kilo,boy, endeks;

        Scanner input = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz: ");
        kilo = input.nextDouble();
        System.out.println("Boyunuzu Cm cinsinden giriniz: ");
        boy = input.nextDouble();

        endeks = (kilo / (boy * boy));
        System.out.println("Vucut kilte endeksiniz: " + endeks);

    }
}
