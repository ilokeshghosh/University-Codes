def pos_func(n,li,s):
    return li[:s-1]+[n]+ li[s-1:]
list = [8,7,6,5,4,3,2,1]
print("\nLinked-List before insertion :") 
print(list)
nth_position = int(input("Enter the postion :"))
x = int(input("Enter the number :"))
result = pos_func(x, list, nth_position)
print("\nLinked-List after insertion :")
print(result)