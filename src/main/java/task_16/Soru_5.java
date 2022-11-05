package task_16;

import java.util.Scanner;

public class Soru_5 {
    public static void main(String[] args) {

     /*

       5: RommReservation adında bir Class oluşturun, oda rezervasyonu için bir program yazın, programınız kullanıcıdan oda rezerve etmek istediğini sorar.
	kullanıcı evet girdiyse, kullanıcının hangi oda tipini rezerve etmek istediğini sorun. kullanıcı hayır girdiyse, "iyi günler" yazdırın
    kullanıcı herhangi bir geçersiz cevap girdiyse (evet/hayır dışında) kullanıcıdan geçerli bir giriş sağlayana kadar tekrar girmesini isteyin)
	King Yatak ==> 120$
    Kraliçe Yatak ==> 100$
	Tek Kişilik Yatak ==> 80$
	program, rezerve ettiği odayı ve odanın toplam fiyatını gösterebilmelidir.
    (kullanıcı geçersiz bir oda seçtiyse, kullanıcıdan geçerli bir giriş sağlayana kadar odayı yeniden seçmesini isteyin).

      */


        Scanner input= new Scanner(System.in);

//       do {
//           System.out.println("Oda rezerve etmek istiyor musunuz?");
//           String cvp= input.next();
//           if (cvp.equalsIgnoreCase("Evet")){
//               System.out.println("Hangi oda tipini istersiniz?");
//               String oda= input.nextLine();
//
//               if (oda.equalsIgnoreCase("King")){
//                   System.out.println("King Yatak Fiyati= 120$");
//
//               } else if (oda.equalsIgnoreCase("Kralice")) {
//                   System.out.println("Kralice Yatak Fiyati= 100$");
//
//               } else if (oda.equalsIgnoreCase("Tek Kisilik")) {
//                   System.out.println("Tek Kisilik Yatak Fiyati= 80$");
//               }
//               break;
//
//
//           } else if(cvp.equalsIgnoreCase("Hayir")){
//
//               System.out.println("Iyi gunler.");
//               break;
//           } else {
//
//               System.out.println("Hatali giris yaptiniz");
//           }
//
//       }while(true);



        do{
            System.out.println("Oda reserve etmek istiyor musunuz?");
            String cevap = input.nextLine();
            if (cevap.equalsIgnoreCase("Evet")){
                do {

                    System.out.println("Hangi oda tipini istersiniz");
                    String oda = input.nextLine();
                    if (oda.equalsIgnoreCase("King")) {
                        System.out.println("King Yatak Fiyati : 120 $");
                        break;

                    }
                    else if (oda.equalsIgnoreCase("Kralice")) {
                        System.out.println("Kralice Yatak Fiyati : 100 $");
                        break;

                    }
                    else  if (oda.equalsIgnoreCase("Tek Kisilik")) {
                        System.out.println("Tek kisilik Yatak Fiyati : 80 $");
                        break;

                    }else{

                        System.out.println("Yanlis giris yaptiniz.");
                    }


                }while (true);
                break;

            }else if (cevap.equalsIgnoreCase("Hayir")){
                System.out.println("Iyi gunler");
                break;
            }else{
                System.out.println("Hatali giris yaptiniz");
            }

        }while(true);
    }
















    }

