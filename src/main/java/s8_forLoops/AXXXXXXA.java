package s8_forLoops;

public class AXXXXXXA {
    public static void main(String[] args) {


        //  Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //    A A A A A A A A
        //    A X X X X X X A
        //    A X X X X X X A
        //    A X X X X X X A




        for (int i = 1; i <= 4; i++) {
            String srt = "";

            if (i == 1) {
                srt = srt + 'A';
                for (int k = 2; k < 8; k++) {
                    srt = srt + 'A';
                }
                srt = srt + 'A';
                System.out.println(srt);
            } else {
                srt = srt + 'A';
                for (int k = 2; k < 8; k++) {
                    srt = srt + 'X';
                }
                srt = srt + 'A';
                System.out.println(srt);
            }
        }





    }
}
