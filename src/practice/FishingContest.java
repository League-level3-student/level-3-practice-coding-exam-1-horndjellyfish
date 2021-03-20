package practice;

import java.util.HashMap;

public class FishingContest {
    HashMap<String, double[]> hm;

    FishingContest(HashMap<String, double[]> hm) {
        this.hm = hm;
    }

    public double findBiggestFish(String name) {
        double fish[] = hm.get(name);
        for (int d = 0; d < fish.length; d++) {
            for (int c = 0; c < fish.length; c++) {
                if (fish[d] > fish[c]) {
                    double temp = fish[d];
                    fish[d] = fish[c];
                    fish[c] = temp;
                }
            }
        }
        for (int b = 0; b < fish.length; b++) {
            System.out.print(fish[b] + " ");
        }
        if (fish.length == 0 || fish[0] < 3) {
            return 0.0;
        } else {
            return fish[0];
        }
    }

    public String findWinner() {
//        double[] arr1 = hm.get("john");
//        double jWeight = 0.0;
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i] > 3) {
//                jWeight += arr1[i];
//            }
//        }
        double[] arr2 = hm.get("esme");
        double eWeight = 0.0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > 3) {
                eWeight += arr2[i];
            }
        }
        double[] arr3 = hm.get("isis");
        double iWeight = 0.0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] > 3) {
                iWeight += arr3[i];
            }
        }
        if (iWeight > eWeight) {
            return "isis";
        } else {
            return "esme";
        }
    }
}
