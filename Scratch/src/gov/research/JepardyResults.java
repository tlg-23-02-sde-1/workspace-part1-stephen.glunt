package gov.research;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class JepardyResults {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> score = new ArrayList<>();

        String fileName = "jepardyResults.txt";
        /*
         * file jepardyResults.txt is colocated and contains only the folliwng text:
         * Adrian            700
         * Andrew           1000
         * Bikash            900
         * Chas              900
         * Chathula          400
         * Chris            1100
         * Hongyi            200
         * Jasmine           500
         * Jason             300
         * Jauric            900
         * Joe               500
         * Joseph           1700
         * Josh             1200
         * Justin           1100
         * Karlo             800
         * Kerri            1700
         * Nick              500
         * Peng              500
         * Phillipe         1000
         * Pierre            200
         * Stephen           600
         * Yun               400
         */

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+");
                names.add(parts[0]);
                score.add(Integer.parseInt(parts[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        LinkedHashMap<String, Integer> jResults = new LinkedHashMap<>();



    sortArrayLists(names, score);

        for(int i = 0; i < names.size(); i++){
            jResults.put(names.get(i), score.get(i));
        }


        System.out.println(jResults);
    }

    private static void sortArrayLists(ArrayList<String> list1, ArrayList<Integer> list2){
        int n = list1.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (list2.get(j) < list2.get(j + 1)) {
                    int temp = list2.get(j);
                    String tName = list1.get(j);
                    list2.set(j, list2.get(j + 1));
                    list1.set(j, list1.get(j + 1));
                    list2.set(j + 1, temp);
                    list1.set(j + 1, tName);
                }
            }
        }
    }

}