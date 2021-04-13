import math
a = float(input("Nhap do dai canh thu nhat "))
b  = float(input("Nhap do dai canh thu hai ")) 
c = float(input("Nhap do dai canh thu ba "))
if a+b>c and b+c>a and a+c>b:
    print("a,b,c la ba canh mot tam giac")
    p = (a+b+c)/2
    S = math.sqrt(p*(p-a)*(p-b)*(p-c))
    print("Chu vi cua tam giac: "+str(2*p))
    print("Dien tich cua tam giac: "+str(S))
