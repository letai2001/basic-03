"""Nhập vào họ và tên xuất ra họ, tên đệm, tên mỗi từ 1 dòng"""
s = input()
a = s.split(' ')

while  " " not in s or len(a)!=3:
    print("Nhap lai")
    s = input()
    a = s.split(' ')
print(len(a))
print("Ho : "+ a[0])
print("Ten Dem: "+a[1])
print("ten: "+a[2])