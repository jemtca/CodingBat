
# we have triangle made of blocks
# the topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on
# compute recursively the total number of blocks in such a triangle with the given number of rows
def triangle(rows):
    if rows == 0:
        return 0
    
    return rows + triangle(rows-1) 

print(triangle(0))
print(triangle(1))
print(triangle(2))
