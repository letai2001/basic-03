"""Nhập vào 1 dãy số và đọc dãy số đó , vi du 123: mot tram hai muoi ba"""

n = int(input())

def DocChuSo(chuSo):
    if chuSo ==0:
        print(" khong ")
    elif chuSo==1:
        print(" mot ")
    elif chuSo==2:
        print(" hai ")
    elif chuSo==3:
        print(" ba ")
    elif chuSo==4:
        print(" bon ")
    elif chuSo==5:
        print(" nam ")
    elif chuSo==6:
        print(" sau ")
    elif chuSo==7:
        print(" bay ")
    elif chuSo==8:
        print(" tam ")
    elif chuSo==9:
        print(" chin ")
def daonguoc(n):
    soDao = 0
    while(n!=0):
        soDao = soDao*10+ n%10
        n  = n // 10
    return soDao
def sophantu(n):
    count = 0
    while(n!=0):
        count = count+1
        n  = n // 10
    return count
def docSo(n):
    soDao = daonguoc(n)
    soluong = sophantu(n)    
    while(soDao!=0):
        DocChuSo(soDao%10)
        if soluong == 4:
            print(" Ngan ")
        if soluong == 3:
            print(" Tram ")
        if soluong == 2:
            print(" Muoi ")
        soluong -=1
        soDao  = soDao//10
docSo(n)

