package com.lexxkit;

public class Main {

    public static void main(String[] args) {
        // Task 1
        byte b = 2;
        short s = 100;
        int i = 1500;
        long l = 1_222_333_444L;

        float f = 1.1f;
        double d = 2.12345678;

        boolean isSkyProCool = 8 > 2;

        char c = '!';

        // Task 2
        System.out.println("\nTask 2\n");
        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;

        float totalWeight = firstBoxerWeight + secondBoxerWeight;
        float weightDiff = secondBoxerWeight - firstBoxerWeight;

        System.out.println("Total boxers' weight is " + totalWeight + " kilos.");
        System.out.println("Weight difference between two boxers is " + weightDiff + " kilos.");

        // Task3
        System.out.println("\nTask 3\n");
        int bananas = 5;
        int oneBananaWeight = 80;

        int milk = 200;
        int hundredMillsOfMilkWeight = 105;

        int iceCream = 2;
        int oneIceCreamWeight = 100;

        int eggs = 4;
        int oneEggWeight = 70;

        int gramPerKilo = 1000;

        int breakfastWeightInGrams = bananas * oneBananaWeight
                                    + milk / 100 * hundredMillsOfMilkWeight
                                    + iceCream * oneIceCreamWeight
                                    + eggs * oneEggWeight;

        float breakfastWeightInKilos = breakfastWeightInGrams / (float)gramPerKilo;

        System.out.println("Breakfast weight is " + breakfastWeightInKilos + " kilos.");

        // Task 4
        System.out.println("\nTask 4\n");
        int kilosToLoose = 7;
        int gramsPerDaySlow = 250;
        int gramsPerDayFast = 500;

        int daysToLoseWeightSlow = kilosToLoose * gramPerKilo / gramsPerDaySlow;
        int daysToLoseWeightFast = kilosToLoose * gramPerKilo / gramsPerDayFast;

        int averageDaysToLoseWeight = (daysToLoseWeightFast + daysToLoseWeightSlow) / 2;

        System.out.println("Days to lose weight in a slow mode: " + daysToLoseWeightSlow + ".");
        System.out.println("Days to lose weight in a fast mode: " + daysToLoseWeightFast + ".");
        System.out.println("Average number of days to lose weight is " + averageDaysToLoseWeight + ".");

        // Another approach to an average days calculation
        int hoursPerDay = 24;
        int gramsPerDayAverage = (gramsPerDayFast + gramsPerDaySlow) / 2;
        int daysToLoseWeightInAverageMode = kilosToLoose * gramPerKilo / gramsPerDayAverage;
        float hoursToLoseWeightInAverageMode = kilosToLoose * (float)gramPerKilo % gramsPerDayAverage / gramsPerDayAverage * hoursPerDay;
        System.out.printf("Average number of days to lose enough weight with an average grams is %d days and %.0f hours.\n",
                daysToLoseWeightInAverageMode, hoursToLoseWeightInAverageMode);

        // Task 5
        System.out.println("\nTask 5\n");
        float salaryIncreasePercentage = 1.1f;
        int initMonthlySalaryMasha = 67_760;
        int initMonthlySalaryDenis = 83_690;
        int initMonthlySalaryKristina = 76_230;

        int newMonthlySalaryMasha = (int) (initMonthlySalaryMasha * salaryIncreasePercentage);
        int newMonthlySalaryDenis = (int) (initMonthlySalaryDenis * salaryIncreasePercentage);
        int newMonthlySalaryKristina = (int) (initMonthlySalaryKristina * salaryIncreasePercentage);

        int MONTHS_PER_YEAR = 12;

        int yearlyDiffMasha = (newMonthlySalaryMasha - initMonthlySalaryMasha) * MONTHS_PER_YEAR;
        int yearlyDiffDenis = (newMonthlySalaryDenis - initMonthlySalaryDenis) * MONTHS_PER_YEAR;
        int yearlyDiffKristina = (newMonthlySalaryKristina - initMonthlySalaryKristina) * MONTHS_PER_YEAR;

        System.out.printf("Masha's salary now is %d rubles. Her yearly income has increased by %d.\n",
                newMonthlySalaryMasha, yearlyDiffMasha);
        System.out.printf("Denis's salary now is %d rubles. His yearly income has increased by %d.\n",
                newMonthlySalaryDenis, yearlyDiffDenis);
        System.out.printf("Kristina's salary now is %d rubles. Her yearly income has increased by %d.\n",
                newMonthlySalaryKristina, yearlyDiffKristina);

    }
}
