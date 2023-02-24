package gov.research;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class MapTest {
    public static void main(String[] args) {
        Map<String, Double> gpaMap = new HashMap<>();
        gpaMap.put("chance", 3.7);
        gpaMap.put("stephen", 3.8);
        gpaMap.put("jorge", 3.99);
        gpaMap.put("lui", 2.3);
        gpaMap.put("chris", 3.2);
        gpaMap.put("jay", 3.86);

        Double luiGpa = gpaMap.get("lui");
        System.out.println("Lui's GPA is: " + luiGpa);
        System.out.println(gpaMap);

        //print all gpa that are 3.5 or greater
        Collection<Double> gpas = gpaMap.values();
        for(Double gpa : gpas){
            if(gpa >= 3.5){
                System.out.println(gpa);
            }
        }

        System.out.println();

        //print all names of those with a gpa of 3.5 or greater.
        for (Map.Entry<String, Double> entry : gpaMap.entrySet()){
            if(entry.getValue() >= 3.5){
                System.out.println(entry.getKey());
            }
        }

        dump(gpaMap);
    }
    private static void dump(Map<String, Double> map) {
        for (var entry : map.entrySet()){
            System.out.printf("|%8s | %.2f |\n", entry.getKey(), entry.getValue());
        }
    }
}