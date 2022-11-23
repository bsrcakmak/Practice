package Interview;

public class DizidekiBirElemanDigerElemanlarinCarpiminaEsitMi {
    /*
       1)Write a function that returns true if you can partition an array into one element and the rest,
       such that this element is equal to product of all other elements excluding itself.

       Example:
      [2,8,4,1] -->True
      [-1,-10,1,-2,20]-->false

     */
    public static void main(String[] args) {

        int[] arr={2,8,4,1,-64};

        int carpim = 1;
        for (int x : arr) {
            carpim *= x;
        }
        if (carpim==0){
            System.out.println("Array'deki elemanlar 0'dan farkli olmali");
        } else{

            for(int i=0;i<arr.length;i++) {

                if (carpim == arr[i] * arr[i]) {
                    System.out.println(true);
                    System.out.println("Kosulu saglayan eleman: " + arr[i]);
                    break;
                }
                if (i == arr.length - 1) {
                    System.out.println(false);
                }
            }
        }
    }
}
