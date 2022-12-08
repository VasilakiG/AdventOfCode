grid = [list(map(int, line)) for line in open('in.txt').read().splitlines()]

visibleTrees = 0

for i in range(len(grid)):
    for j in range(len(grid[i])):
        k = grid[i][j]
        if all(grid[i][x] < k for x in range(j)) or all(grid[i][x] < k for x in range(j+1, len(grid[i]))) or all(grid[x][j] < k for x in range(i)) or all(grid[x][j] < k for x in range(i+1, len(grid))):
            visibleTrees += 1

print(visibleTrees)