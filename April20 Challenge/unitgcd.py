import math

def isPrime(n) :
    if (n <= 1) :
        return False
    if (n <= 3) :
        return True

    if (n % 2 == 0 or n % 3 == 0) :
        return False

    i = 5
    while(i * i <= n) :
        if (n % i == 0 or n % (i + 2) == 0) :
            return False
        i = i + 6

    return True

t=int(input())
for l in range(0,t):
    n=int(input())
    if n==1:
        d=1
    else:
        d=n//2

#print(d)
    li=[0 for i in range(0,d)]
    pri=[]
    psq=[]
    temp=0
    for i in range(1,n+1):
        pr=isPrime(i)
        sq=math.sqrt(i)
        m=sq-math.floor(sq)
    #bo=i
        if i==1:
            pri.append(i)
        elif pr==True:
            pri.append(i)
        elif (m==0 and sq in pri):
            psq.append(i)
        else:
            if temp==0:
                li.append(i)
                temp=i
            else:
                if((temp//2)==(i//2)):
                    te=[]
                    te.append(temp)
                    te.append(i)
                    li[-1]=te
                    temp=i
                else:
                    li.append(i)
                    temp=i

    li.insert(0,pri)
    li.insert(1,psq)
    del li[2:2+d]
    print(d)
    print(li)


    for i in range(0,d):
        if i==0:
            print(len(li[0]),end=" ")
            print(*li[0])
        elif i==1:
            print(len(li[1]),end=" ")
            print(*li[1])
        else:
            if(isinstance(li[i],list)):
                print(2,end=" ")
                print(*li[i])
            else:
                print(1,end=" ")
                print(li[i])
