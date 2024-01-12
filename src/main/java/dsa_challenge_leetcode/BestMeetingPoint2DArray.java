package dsa_challenge_leetcode;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class BestMeetingPoint2DArray {

    public static void main(String[] args) {
        int[][] grid = {
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0}
        };

        int meetingPoint = minTotalDistance(grid);
        System.out.println("Best Meeting Point Distance: " + meetingPoint);
    }

    private static int minTotalDistance(int[][] grid) {
        int numRows = grid.length;
        int numCols = grid[0].length;

        int[] rowSum = new int[numRows];
        int[] colSum = new int[numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (grid[i][j] == 1) {
                    rowSum[i] += i;
                    colSum[j] += j;
                }
            }
        }

        int meetingRow = findMedian(rowSum);
        int meetingCol = findMedian(colSum);

        return calculateTotalDistance(grid, meetingRow, meetingCol);
    }

    private static int findMedian(int[] arr) {

        Arrays.sort(arr);
        int median = arr[arr.length / 2];
        return median;
    }

    private static int calculateTotalDistance(int[][] grid, int meetingRow, int meetingCol) {
        int totalDistance = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    totalDistance += Math.abs(i - meetingRow) + Math.abs(j - meetingCol);
                }
            }
        }

        return totalDistance;
    }



/////use javas8 stream.

   /* private static int minTotalDistance(int[][] grid) {
        int numRows = grid.length;
        int numCols = grid[0].length;

        Map<Integer, Integer> rowSum = new LinkedHashMap<>();
        Map<Integer, Integer> colSum = new LinkedHashMap<>();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (grid[i][j] == 1) {
                    rowSum.merge(i, i, Integer::sum);
                    colSum.merge(j, j, Integer::sum);
                }
            }
        }

        int meetingRow = findMedian(rowSum);
        int meetingCol = findMedian(colSum);

        return calculateTotalDistance(grid, meetingRow, meetingCol);
    }

    private static int findMedian(Map<Integer, Integer> map) {
        int medianIndex = map.size() / 2;
        int median = map.entrySet().stream()
                .skip(medianIndex)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(-1);
        return median;
    }

    private static int calculateTotalDistance(int[][] grid, int meetingRow, int meetingCol) {
        return Arrays.stream(grid)
                .flatMapToInt(Arrays::stream)
                .filter(cell -> cell == 1)
                .map(cell -> Math.abs(meetingRow - cell / grid[0].length) + Math.abs(meetingCol - cell % grid[0].length))
                .sum();
    }*/
}
