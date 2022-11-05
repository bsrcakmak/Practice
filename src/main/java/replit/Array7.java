package replit;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Array7 {
    public static void main(String[] args) {

     /*

     Array i ARRAYLIST e çeviren Java Kodunu yazınız.

Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

```
Beklenen Çıktı:
```

```
[Python, JAVA, PHP, Perl, C#, C++]


      */


      String arr[]= {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};

        List<String > ls= Arrays.asList(arr);
        System.out.println(ls);












    }
}
