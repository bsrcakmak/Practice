package urunOtomati;

import java.util.Scanner;

public class Options extends Urun{

    Scanner input = new Scanner(System.in);    //Kullanicidan Deger almak icin

    double accountBalance = 1;     //Kullanici Bakiyesi

    //Kullaniciya urunleri sectirmek icin
    public void select() {
        System.out.println("\nLutfen almak istediginiz urunun numarasini yaziniz.");
        int product = input.nextInt();


        switch (product) {
            case 1:
                price = urunList[0];
                break;
            case 2:
                price = urunList[1];
                break;
            case 3:
                price = urunList[2];
                break;
            case 4:
                price = urunList[3];
                break;
            case 5:
                price = urunList[4];
                break;
            case 6:
                price = urunList[5];
                break;
            case 7:
                price = urunList[6];
                break;
            default:
                System.out.println("Lutfen sadece urun numaralarini giriniz!");
        }
    }


    //Kullanicinin bakiyesi yetersiz ise bakiye yukleme veya cikis yapma islemi
    public void balance() {
        if (price > accountBalance) {
            System.out.println("Bakiyeniz yetersizdir...\n" +
                    "Bakiyeniz: " + accountBalance + "\n" +
                    "Bakiye yukelem isterseniz ==> 1\n" +
                    "Cikis yapmak isterseniz ==> Q");
            String islem = input.next().substring(0, 1);
            if (islem.equalsIgnoreCase("1")) {
                System.out.println("Yukelemek istediginiz miktari giriniz");
                double yukelenecekBakiye = input.nextDouble();
                accountBalance = accountBalance + yukelenecekBakiye;
                if (price <= accountBalance) {
                    purchase();
                } else {

                    balance();
                }
            } else if (islem.equalsIgnoreCase("Q")) {
                System.out.println("Cikis yapildi...\n" +
                        "\t\tTekrar bekleriz :)");
            }
        }

    }


    //Kullanicinin bakiyesi alacagi urune yetiyor ise satin alma islemini gerceklestirme veya cikma
    public void purchase() {// accaountBalance >= price ise calisir
        if (accountBalance >= price) {
            System.out.println("Satin alma islemini onayliyorsaniz ==> 1\n" +
                    "Cikis yapmak isterseniz ==> Q");
            String islem = input.next().substring(0, 1);
            if (islem.equalsIgnoreCase("1")) {
                do {
                    if (islem.equalsIgnoreCase("1")) {
                        accountBalance = accountBalance - price;
                        System.out.println("Urunu basariyla satin aldiniz\n" +
                                "Kalan Bakiye: " + accountBalance + "\n\n" +
                                "Baska bir urun almak istiyorsaniz ==> 1\n" +
                                "Cikis yapmak isterseniz ==> Q");
                        String islem2 = input.next().substring(0, 1);
                        if (islem2.equalsIgnoreCase("1")) {
                            toString1();
                            select();
                            purchase();// break; konulabilir geri don!!!
                        } else if (islem2.equalsIgnoreCase("Q")) {
                            break;
                        }
                    }

                } while (islem.equalsIgnoreCase("Q"));
                System.out.println("Cikis yapildi...\n" +
                        "\t\tTekrar bekleriz :)");
            } else if (islem.equalsIgnoreCase("q")) {
                System.out.println("Cikis yapildi...\n" +
                        "\t\tTekrar bekleriz :)");
            }
        } else
            balance();
    }
}
