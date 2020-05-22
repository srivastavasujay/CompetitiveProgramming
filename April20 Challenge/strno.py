import math

def primeFactors(n):
    li=[]
    while n % 2 == 0:
        li.append(2)
        n = n // 2

    for i in range(3,int(math.sqrt(n))+1,2):
        while n % i== 0:
            li.append(i)
            n = n // i

    if n > 2:
        li.append(n)

    return li

n=int(input())
for i in range(0,n):
    x,k=input().split()
    x=int(x)
    k=int(k)

    pr=primeFactors(x)
    count=len(pr)

    if(count>=k):
        print(1)
    else:
        print(0)
