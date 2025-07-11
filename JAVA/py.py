year=int(input())

if (year%4==0 and year %100 !=0):
    print("leap")
elif(year%400==0 and year %100==0):
    print("leapyear")
else:
    print("notleap")