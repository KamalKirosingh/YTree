package org.example;

import java.util.Random;

public class RandomGen {

    private int[] randomNums;
    private float[] probabilities;

    public RandomGen(int[] randomNums, float[] probabilities) {
        this.randomNums = randomNums;
        this.probabilities = probabilities;
    }

    public int nextNum() {
        // generates a random float number between 0 and 1
        Random random = new Random();
        float randomFloat = random.nextFloat();

        // Iterate over the probabilities array
        float cumulativeProbability = 0.0f;
        for (int i = 0; i < probabilities.length; i++) {
            cumulativeProbability += probabilities[i];

            // If the random float number is less than the current cumulative probability,
            // return the value at index [i] in the randomNums array
            if (randomFloat < cumulativeProbability) {
                return randomNums[i];
            }
        }

        return randomNums[probabilities.length - 1];
    }
}
