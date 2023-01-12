b=int(input("Enter the number"))+1
a=0
print("Printing current and previous number sum is na range",(b-1))
for i in range(b):
    s=a+i
    print(f"Current Number {i} Previous Number {a} Sum:{s}")
    a=i
   
    