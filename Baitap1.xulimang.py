n =0
list = []
for i in range(99):
    list.append(int(input()))
    n+=1
    if list[i]==-1 :
        break
min  = list[1]    
for i in range (n-1):
    if min>list[i]:
        min = list[i]
print(min)
