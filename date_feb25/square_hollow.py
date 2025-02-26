n = int(input("Enter the size of the hollow square: ")) 

for i in range(n):
    for j in range(n):
        if i == 0 or i == n-1 or j == 0 or j == n-1:  # Check for edges
            print("*", end="")
        else:
            print(" ", end="")
    print()  