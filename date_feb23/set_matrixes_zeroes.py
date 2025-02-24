# Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

# You must do it in place.

# Example 1:

# Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
# Output: [[1,0,1],[0,0,0],[1,0,1]]
# Example 2:

# Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
# Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

# Brute Force Method



def Zeromatrix(matrix, n, m):
    row = [0] * n
    col = [0] * m
    for i in range(n):
        for j in range(m):
            if matrix[i][j] == 0:
                row[i]=1
                col[j]=1

    for i in range(n):
        for j in range(m):
           if row[i] or col[j]:
               matrix[i][j]  = 0
    
    return matrix




if __name__ == "__main__":
    matrix = [[1, 1, 1], [1, 0, 1], [1, 1, 1]]
    n = len(matrix)
    m = len(matrix[0])
    ans = Zeromatrix(matrix, n, m)
    for row in ans:
        for col in row:
            print(col, end=" ")
        print()

