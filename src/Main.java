import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        //define array
       /* String[] names = new String[2];
        names[0] = "kevin";
        names[1] = "anjas";*/


//       String[] names = {"anjas","kevin"};

        List<String> names = new ArrayList<>();
        names.add("anjas");
        names.add("kevin");
        names.add(0, "gagan");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        names.forEach(name -> {
            System.out.println(name);
        });

        for (String name : names) {
            System.out.println(name);
        }


    }

}
