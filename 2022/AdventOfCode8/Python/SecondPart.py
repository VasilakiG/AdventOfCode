grid = [list(map(int, line)) for line in open('TestCase.txt').read().splitlines()]

scenicScore = 0

for i in range(len(grid)):
    for j in range(len(grid[i])):
        k = grid[i][j]
        up = down = left = right = 0
        for x in range(j-1, -1, -1):
            left += 1
            if grid[i][x] >= k:
                break
        for x in range(j+1, len(grid[i])):
            right += 1
            if grid[i][x] >= k:
                break
        for x in range(i-1, -1, -1):
            up += 1
            if grid[x][j] >= k:
                break
        for x in range(i+1, len(grid)):
            down += 1
            if grid[x][j] >= k:
                break
        scenicScore = max(scenicScore, up * down * left * right)

print(scenicScore)