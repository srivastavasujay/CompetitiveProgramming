n=int(input())
for i in range(0,n):
    x=int(input())
    li=list(map(int,input().split(" ")))
    li.sort(reverse=True)
    sum=0
    for i in range(len(li)):
        s=li[i]-i
        if(s<0): s=0
        sum+=s
    print(sum%1000000007)
