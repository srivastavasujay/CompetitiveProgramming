n=int(input())
for i in range(0,n):
    x=int(input())
    li=list(map(int,input().split(" ")))
    #print(li)
    res=[i for i, value in enumerate(li) if value==1]
    #print(res)
    c=1
    for i in range(len(res)-1):
        if(res[i+1]-res[i]>=6):
                c=1
        else:
            c=0
            print("NO")
            break
    if c==1: print("YES")
