import java.util.*;

class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        
        // If the start or end cell has a thief, the safeness factor is immediately 0
        if (grid.get(0).get(0) == 1 || grid.get(n - 1).get(n - 1) == 1) {
            return 0;
        }

        // 2D array to store the minimum distance to any thief for each cell
        int[][] safeness = new int[n][n];
        for (int[] row : safeness) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        Queue<int[]> queue = new LinkedList<>();

        // Step 1: Multi-source BFS initialization
        // Add all thieves to the queue and set their distance to 0
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (grid.get(r).get(c) == 1) {
                    queue.offer(new int[]{r, c});
                    safeness[r][c] = 0;
                }
            }
        }

        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        // Step 1 (cont.): Populate the safeness grid
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];

            for (int[] dir : directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr >= 0 && nr < n && nc >= 0 && nc < n && safeness[nr][nc] == Integer.MAX_VALUE) {
                    safeness[nr][nc] = safeness[r][c] + 1;
                    queue.offer(new int[]{nr, nc});
                }
            }
        }

        // Step 2: Dijkstra's Algorithm using a Max-Heap
        // Each entry in the heap: {safeness_factor_of_path, row, col}
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        maxHeap.offer(new int[]{safeness[0][0], 0, 0});

        // Track visited cells to avoid cycles
        boolean[][] visited = new boolean[n][n];
        visited[0][0] = true;

        while (!maxHeap.isEmpty()) {
            int[] curr = maxHeap.poll();
            int currentSafeness = curr[0];
            int r = curr[1];
            int c = curr[2];

            // If we reached the bottom-right corner, return the maximum achieved safeness
            if (r == n - 1 && c == n - 1) {
                return currentSafeness;
            }

            for (int[] dir : directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr >= 0 && nr < n && nc >= 0 && nc < n && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    // The safeness of the path to the neighbor is limited by the minimum cell value along it
                    int nextSafeness = Math.min(currentSafeness, safeness[nr][nc]);
                    maxHeap.offer(new int[]{nextSafeness, nr, nc});
                }
            }
        }

        return 0;
    }
}