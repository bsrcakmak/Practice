package s16_constructor;

public class Deneme {

   int x=10, y;
   Deneme(){
       System.out.println(x*y);
   }
   Deneme(int x, int y){
       this();
       this.x=x;
       this.y=10;
       System.out.println(x*y);
   }
   Deneme(int x,int y,int z){
       this(y,z);
       this.x=x;
       this.y=y;
       System.out.println(x*z);
   }

    public static void main(String[] args) {

       Deneme dnm= new Deneme(3,4,5);
        System.out.println(dnm.x * dnm.y);
    }

















}
