import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Grades g1= new Grades(50,60,92);
        Grades g2= new Grades(40,70,22);
        Grades g3= new Grades(80,50,32);
        Map map =new HashMap();
        map.put("Ramesh",g1);
        map.put("Suresh",g2);
        map.put("Rakesh",g3);
        System.out.println("List of students and average");
        print(map);

    }

    public static void print(Map map){
        System.out.println("-----------------------");
        Set<String> set=map.keySet();
        for (String g:set){
            Grades g1 = (Grades)map.get(g);
            System.out.println("key"+g+"Avg is :"+g1.getAvg());
        }


    }
}
