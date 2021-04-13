"""Viết chương trình thực hiện nhập vào một số tự nhiên n, sau đó tạo ra ngẫu nhiên n số tự nhiên rồi lưu vào một file.
 Đọc tất cả các số từ file đã lưu, tính tổng rồi in ra màn hình"""
import random
print("Nhap n = ")
n=  int(input())
list = []
so = []
sum = 0
for i in range (n):
    list.append(random.randrange(100))
file = open('bai2.txt',mode = 'a+')
for i in list:
    data = file.write(str(i))
    data = file.write("\n")
    sum+=i

data = file.write("Tong cua mang: \n")
data = file.write(str(sum))
file.close()


