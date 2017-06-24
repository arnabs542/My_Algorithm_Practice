import java.util.*;

/**
 * Created by xiangyuli on 4/2/17.
 */
public class Test {
    public static void main(String[] args) {
        Map<String, Integer> employerNumbers = new HashMap<>();
        employerNumbers.put("yahoo",1);
        System.out.println(employerNumbers);
        employerNumbers.put("google",2);
        System.out.println(employerNumbers);
        Integer yc = employerNumbers.get("yahoo");
        yc = employerNumbers.put("yahoo",5); //return the value of yc before put
        System.out.println(yc);
        Integer fc = employerNumbers.get("facebook");
        boolean fe = employerNumbers.containsKey("facebook");
        fc = employerNumbers.remove("facebook");
        System.out.println(fc);
        Integer gc = employerNumbers.remove("google");
        System.out.println(gc);
        System.out.println(employerNumbers);

        int[] array = new int[11];
        System.out.println(employerNumbers.entrySet());

    }
}
