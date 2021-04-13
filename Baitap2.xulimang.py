n =0
list = []
for i in range(99):
    list.append(int(input()))
    n+=1
    if list[i]==-1 :
        break
sum = 0
for i in range (n-1):
    
        sum+=  list[i]
print(float(sum/(n-1)))
