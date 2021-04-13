"""viết chương trình thực hiện nhập vào danh sách tên nhân viên (kết thúc khi nhập vào chuỗi rỗng) rồi lưu vào một file
. Sau đó đọc lại danh sách nhân viên từ file,
 sắp xếp tên theo thứ tự tăng dần rồi in ra màn hình."""
file = open('bai1.txt',mode = 'a+')
class NhanVien:
    Ten = " "
    def __init__ (self, Ten):
        self.Ten = Ten
            
    def getTen(self):
        return self.Ten
list = []
ten = []
i = 0
for i in range(999):
    list.append(NhanVien(input()))
    if list[i].Ten==" ":
        del list[i]
        break

for i in list:

    data = file.write(i.Ten)
    data = file.write("\n")
    ten.append(i.Ten)
data = file.write("Danh sach sau khi sap xep: ")
data = file.write("\n")
ten.sort()
for i in ten:
    data = file.write(i)
    data = file.write("\n")

file.close()
print(data)