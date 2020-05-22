t=int(input())
for l in range(0,t):
    n=int(input())
    if n==1:
        print(1)
        print(1,end=" ")
        print(1)
    else:
        d=n//2

        print(d)
        if n%2==0:
            for i in range(1,n+1,2):
                print(2,end=" ")
                print(i,end=" ")
                print(i+1)
        else:
            i=1
            c=1
            while c<=(d):
                if c==1:
                    print(3,end=" ")
                    print(i,end=" ")
                    print(i+1,end=" ")
                    print(i+2)
                    c+=1
                    i+=3
                else:
                    print(2,end=" ")
                    print(i,end=" ")
                    print(i+1)
                    i+=2
                    c+=1
