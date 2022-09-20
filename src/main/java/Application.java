import java.util.HashMap;

public class Application {
    public static void main(String[] args) {
        //declare variables
        HashMap<String, Integer> testScoreMap = new HashMap<>();

        testScoreMap.put("Lisa", 100);
        testScoreMap.put("Bart", 80);
        testScoreMap.put("Homer", 50);

        System.out.println(testScoreMap);

        System.out.println("Lisa's score is: " + testScoreMap.get("Lisa"));
        System.out.println("Nick's score is: " + testScoreMap.get("Nick"));
        System.out.println("Nick's score is: " + testScoreMap.getOrDefault("Nick", -1));

        testScoreMap.replace("Bart", 95);

        System.out.println("Bart's score is now : " + testScoreMap.get("Bart"));

        //loop through key set and print scores
        testScoreMap.keySet();
        for (String currentName : testScoreMap.keySet()){
            System.out.println("Score for " + currentName + " = " + testScoreMap.get(currentName));
        }

        for (String currentName : testScoreMap.keySet()){
            if (testScoreMap.get(currentName) >= 70) {
                System.out.println(currentName + " has passed the test with a score of " + testScoreMap.get(currentName));
            }
        }

        // check if key doesn't exist, and add it
        if ((!testScoreMap.containsKey("Nick"))){
            testScoreMap.put( "Nick", 0);
        }
        System.out.println(testScoreMap);

    }
}
