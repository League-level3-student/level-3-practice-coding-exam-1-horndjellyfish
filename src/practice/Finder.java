package practice;

import java.util.ArrayList;
import java.util.List;

public class Finder {

    public int lastIndexOf(ArrayList<String> s, String a) {
        int lastIndex = -1;
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).toLowerCase().equals(a.toLowerCase())) {
                lastIndex = i;
                System.out.println(lastIndex);
                //return lastIndex;
            }

        }
        if (lastIndex == -1) {
            return -1;
        }
        return lastIndex;
    }

}