/* Basketball Stats Tracker Project Lab
 * Name: Tyra Sotelo
 * Due Date: December 7, 2025
 * Purpose: This program tracks basketball player stats using arrays
 *and shows the totals, averages, and the highest scorer.
 */

import java.util.Scanner;

public class BasketballStatsTracker_Tyra_Sotelo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int players = input.nextInt();

        String[] names = new String[players];
        int[] points = new int[players];
        int[] rebounds = new int[players];
        int[] assists = new int[players];

        inputStats(input, names, points, rebounds, assists);
        showStats(points, rebounds, assists);
        showTopScorer(names, points);

        input.close();
    }

    // Method to get player input
    public static void inputStats(Scanner input, String[] names,        int[] points, int[] rebounds, int[] assists) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("\nPlayer " + (i + 1));
            System.out.print("Name: ");
            names[i] = input.next();
            System.out.print("Points: ");
            points[i] = input.nextInt();
            System.out.print("Rebounds: ");
            rebounds[i] = input.nextInt();
            System.out.print("Assists: ");
            assists[i] = input.nextInt();
        }
    }

    // Method that represents the teams totals and averages
    public static void showStats(int[] points, int[] rebounds, int[] assists) {
        System.out.println("\nTeam Stats");
        System.out.println("Total Points: " + total(points));
        System.out.println("Total Rebounds: " + total(rebounds));
        System.out.println("Total Assists: " + total(assists));

        System.out.println("Average Points: " + average(points));
        System.out.println("Average Rebounds: " + average(rebounds));
        System.out.println("Average Assists: " + average(assists));
    }

    // Method that shows the highest scorer
    public static void showTopScorer(String[] names, int[] points) {
        int top = 0;
        for (int i = 1; i < points.length; i++) {
            if (points[i] > points[top]) {
                top = i;
            }
        }
        System.out.println("\nTop Scorer: " + names[top] +
                " with " + points[top] + " points");
    }

    // Method to calculate the total
    public static int total(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum;
    }

    // Method to calculate the average
    public static double average(int[] nums) {
        return (double) total(nums) / nums.length;
    }
}