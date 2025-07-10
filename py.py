def valid(ko):
    
    for i in range(1,n+1):
        if (2**i==n):
            return "Yes"
n=int(input("Enter the number : "))
if (valid(n)=="Yes"):
    print("Yes")
else:
    print("NO")