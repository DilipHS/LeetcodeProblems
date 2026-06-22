import java.util.*;

class Solution {

    static class Pair {
        int node;
        long cost;

        Pair(int node, long cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    public int minCost(int n, int[][] edges) {

        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();

        for (int[] e : edges) {
            int u = e[0], v = e[1], w = e[2];

            graph[u].add(new int[]{v, w});        
            graph[v].add(new int[]{u, 2 * w});    
        }

        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> Long.compare(a.cost, b.cost)
        );

        dist[0] = 0;
        pq.add(new Pair(0, 0));

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();

            if (cur.cost > dist[cur.node]) continue;

            for (int[] next : graph[cur.node]) {
                int v = next[0];
                long newCost = cur.cost + next[1];

                if (newCost < dist[v]) {
                    dist[v] = newCost;
                    pq.add(new Pair(v, newCost));
                }
            }
        }

        return dist[n - 1] == Long.MAX_VALUE ? -1 : (int) dist[n - 1];
    }
}