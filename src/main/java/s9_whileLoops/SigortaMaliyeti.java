package s9_whileLoops;

import java.util.Scanner;

public class SigortaMaliyeti {

    /*
         InsuranceQuote adında bir Class oluşturun, aşağıdaki bilgilere göre bir kişinin sigorta maliyetini hesaplayabilen bir program yazın:
	1. Kullanıcıdan adınızı girmesini isteyin
	2. Kullanıcıdan cinsiyetinizi girmesini isteyin
(kullanıcı geçersiz bir giriş girerse, kullanıcıdan geçerli bir giriş sağlayana kadar tekrar girmesini isteyin)
	3. Kullanıcıya evli olup olmadığını sorun(Evet/Hayır)
(kullanıcı geçersiz bir giriş girerse, kullanıcıdan geçerli bir giriş sağlayana kadar tekrar girmesini isteyin)
	4. Kullanıcıdan yaşınızı girmesini isteyin
(yaş negatif veya 120'den büyük olamaz)(kullanıcı geçersiz bir giriş girerse, kullanıcıdan geçerli bir giriş sağlayana kadar tekrar girmesini isteyin)
	5. Kullanıcıdan bir günde kaç mil sürdüğünü girmesini isteyin
(kilometre eksi veya 5'ten az olamaz)(kullanıcı geçersiz bir giriş girerse, kullanıcıdan geçerli bir giriş sağlayana kadar tekrar girmesini isteyin)
	6. Kullanıcıya tam kapsamlı sigorta mı yoksa sorumluluk sigortası mı istediğini sorun.
	7. Son 5 yılda herhangi bir kazası olup olmadığını sorun (Evet/Hayır)
(kullanıcı geçersiz bir giriş girerse, kullanıcıdan geçerli bir giriş sağlayana kadar tekrar girmesini isteyin)
	8. Kullanıcıya arabasında hırsızlık önleme alarmı olup olmadığını sorun (Evet/Hayır)
(kullanıcı geçersiz bir giriş girerse, kullanıcıdan geçerli bir giriş sağlayana kadar tekrar girmesini isteyin)
	Sigortanın fiyatını hesaplayın ve kullanıcının tüm bilgilerini görüntüleyin
	Sigorta Teklifi hesaplama:
	sorumluluk için başlangıç ​​fiyatları:
	yaş < 25 ===> 90$
	yaş >= 25 ==> 50$
	mil <= 10 ====> 10 $
	mil > 10 ve mil <= 50 ==> 30 $
	mil > 50 ===> 50$

	tam kapsama için başlangıç ​​fiyatları:
	yaş < 25 ===> 160$
	yaş >= 25 ==> 120$
	mil <= 10 ====> 20 $
	mil > 10 ve mil <= 50 ==> 40 $
	mil > 50 ===> 70 $
	Araçta hırsızlık önleme cihazı varsa ==> %5 indirim
	Son 5 yılda herhangi bir kazası varsa ===> %15 ek ücret
	Son 5 yılda hiç kaza veya hasar görmediyse ==> %10 indirim
	evli ise ==> %5 indirim.

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen adinizi giriniz");
        String adSoyad = input.nextLine();
        String cinsiyet;
//2 madde
        while (true) {//Burada do while de kullanılabilir hiç bir fark yok.
            System.out.println("Cinsiyetinizi giriniz. Bayan veya Erkek giriniz ");
            cinsiyet = input.next();
            if (cinsiyet.equalsIgnoreCase("Bayan") && cinsiyet.equalsIgnoreCase("Erkek")) {
                break;
            }
        }

//3 madde
        String evlilik; //Burada aldık cünkü daha sonra kullanacagız
        while (true) {//Burada do while de kullanılabilir hiç bir fark yok.
            System.out.println("Evli olup olmadığınızı giriniz. Evet veya Hayır giriniz ");
            evlilik = input.next();
            if (evlilik.equalsIgnoreCase("Evet") || evlilik.equalsIgnoreCase("Hayır")) {
                break;
            }
        }

//4 madde
        int yas;
        while (true) {//Burada do while de kullanılabilir hiç bir fark yok.
            System.out.println("Yasinizi Giriniz");
            yas = input.nextInt();
            if (yas < 121 && yas > -1) {
                break;
            }
        }

//madde 5
        int mil;
        while (true) {
            System.out.println("Bir günde ne kadar yol yapıyorsunuz");
            mil = input.nextInt();
            if (mil > 5) {
                break;
            }
        }
//madde 6
        System.out.println(" Sorumluluk için 1 \n Tam kapsamlı için 2 \n  tuslayın");
        int sigorta = input.nextInt();

//Madde 7
        String kaza;
        while (true) {
            System.out.println("Son bes yıl icinde kaza yaptınız mı. Evet veya hayır giriniz ");
            kaza = input.next();
            if (kaza.equalsIgnoreCase("Evet") || kaza.equalsIgnoreCase("Hayır")) {
                break;
            }
        }

//madde 8
        String hirsizlik;
        while (true) {
            System.out.println("Arabanızda hırsızlık önleme cihazı var mı. Evet veya hayır giriniz");
            hirsizlik = input.next();
            if (hirsizlik.equalsIgnoreCase("Evet") || hirsizlik.equalsIgnoreCase("Hayır")) {
                break;
            }
        }


//Ücretlendirme kısmına geldik ilk önce bos bir onteynır olusturuyoruz
        double ucret = 0;
        if (sigorta == 1) {
            if (yas < 25) {
                ucret += 90;
            } else {
                ucret += 50;
            }
            if (mil <= 10) {
                ucret += 10;
            } else if (mil > 10 && mil <= 50) {
                ucret += 50;
            } else {
                ucret += 50;
            }
        } else {//sigorta secimi 2 oluyor
            if (yas < 25) {
                ucret += 160;
            } else {
                ucret += 120;
            }
            if (mil <= 10) {
                ucret += 20;
            } else if (mil > 10 && mil <= 50) {
                ucret += 40;
            } else {
                ucret += 70;
            }
            //indirimler
            double indirim = 0;
            if (hirsizlik.equalsIgnoreCase("Evet")) {
                indirim += -5;
            }
            if (kaza.equalsIgnoreCase("evet")) {
                indirim += 15;
            } else {
                indirim += -10;
            }
            if (evlilik.equalsIgnoreCase("evet")) {
                indirim += -5;
            }
            //Bilgilerin görüntüsü
            double indirimmik = (100 + indirim) / 100;

            System.out.println("Ad Soyad" + adSoyad + ", \nCinsiyet " + cinsiyet + ",\nEvlilik " + evlilik + ",\nYas " + yas
                    + ",\nKilometre " + mil + ",\nSigorta Cesidi " + sigorta + ", Kaza " + kaza + ",Hırsızlik önleme " + hirsizlik);

            System.out.println("Sigorta ücreti:" + (ucret * indirimmik));
        }



    }
}
