package practice;

import java.util.HashMap;

public class FishingContest {
    HashMap<String, double[]> hm;
    FishingContest(HashMap<String, double[]> hm) {
        this.hm = hm;
    }
    public double findBiggestFish(String name) {
        double fish[] = hm.get(name);
        for (int d = 0; d < fish.length-1; d++) {
            for (int c = 0; c < fish.length-1; c++) {
                if (fish[d] < fish[d+1]) {
                    double temp = fish[d];
                    fish[d] = fish[d+1];
                    fish[d+1] = temp;
                }
            }
        }
        if (fish[0] < 3) {
            return 0;
        }
        return fish[0];
    }

    public String findWinner(HashMap<String, double[]> hm) {
        

        return "";
    }
}
