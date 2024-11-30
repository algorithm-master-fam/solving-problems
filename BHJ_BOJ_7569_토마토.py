from collections import deque

def bfs():
    queue = deque([])
    visited = [[[0]*m for _ in range(n)] for _ in range(h)]

    cnt = 0 # 안 익은 토마토 개수 세기
    for x in range(h):
        for y in range(n):
            for z in range(m):
                if box[x][y][z] == 1:
                    queue += [[x, y, z]]
                    visited[x][y][z] = 1
                elif box[x][y][z] == 0:
                    cnt += 1 # 안 익은 토마토를 발견하면 안 익은 토마토 개수 + 1

    dx = [-1, 1, 0, 0, 0, 0]
    dy = [0, 0, -1, 1, 0, 0]
    dz = [0, 0, 0, 0, -1, 1]

    while queue:
        sx, sy, sz = queue.popleft()

        for i in range(6):
            nx, ny, nz = sx+dx[i], sy+dy[i], sz+dz[i]
            if 0 <= nx < h and 0 <= ny < n and 0 <= nz < m and visited[nx][ny][nz] == 0 and box[nx][ny][nz] == 0:
                queue += [[nx, ny, nz]]
                visited[nx][ny][nz] = visited[sx][sy][sz] + 1
                cnt -= 1 # 토마토가 익으면, 안 익은 토마토 개수 - 1

    if cnt == 0:
        return visited[sx][sy][sz] - 1
    else:
        return - 1

m, n, h = map(int, input().split())
box = [[list(map(int, input().split())) for _ in range(n)] for _ in range(h)]

ans = bfs()
print(ans)
