import java.util.*;

class Solution {
    int[] dx = {-1,0,1,0};
    int[] dy = {0,-1,0,1};
    boolean[][] visited;
    Queue<Node> q = new LinkedList<Node>();
    int answer = 0;
    
    class Node {
        int x;
        int y;
        int d;
        
        public Node(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }
    
    public int solution(int[][] maps) {
        visited = new boolean[maps.length][maps.length];
        q.offer(new Node(0,0,0));
        bfs(0,0,maps);
        
        return answer;
    }
    
    public void bfs(int x, int y, int[][] maps) {
        visited[x][y] = true;
        
        while(!q.isEmpty()) {
            Node n = q.poll();
            int x1 = n.x;
            int y1 = n.y;
            int d = n.d;
            
            for(int i = 0; i < 4; i++) {
                int nx = x1 + dx[i];
                int ny = y1 + dy[i];
                
                if(nx >= 0 && nx < maps.length && ny >= 0 && ny < maps.length) {
                    if(maps[nx][ny] == 1 && !visited[nx][ny]) {
                        q.offer(new Node(nx,ny,d+1));
                    }
                    if(nx == maps.length -1 && ny == maps.length - 1 && 
                       maps[nx][ny] == 1) answer = d+1;
                    if(nx == maps.length -1 && ny == maps.length - 1 && 
                       maps[nx][ny] == 0) answer = -1;
                } 
            }
        }
        
    }
}
