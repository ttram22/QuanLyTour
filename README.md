Phần 1:
- class ConNguoi
- class KhachHang extends ConNguoi
- class NhanVien extends ConNguoi
- abstract class Tour
- class TourQuocTe extends Tour
- class TourTrongNuoc extends Tour
- class DatTour
Yêu cầu:
- Có ít nhất 3 lớp đối tượng
- Các lớp phải có hàm thiết lập (constructor)
- Có kế thừa hợp lý
- Cài đặt và sử dụng đa hình
- Có thuộc tính static, phương thức static
- Có lớp trừu tượng, hàm trừu tượng (abstract)


Phần 2: 
- class DanhSachKhachHang
- class DanhSachTour
- class DanhSachNhanVien
- class DanhSachDatTour
Yêu cầu:
- Các lớp phải có hàm thiết lập (constructor)
- Lớp mảng các đối tượng (danh sách)
- Đọc và ghi dữ liệu lên file (text)
- Có các chức năng xem, thêm, sửa, xóa, tìm kiếm (implements interface ở phần 3)


Phần 3: interface + menu demo
* interface:
public interface QuanLy<T> {
    void them(T obj);
    void sua(String ma);
    void xoa(String ma);
    T timKiem(String ma);
    void xuatDanhSach();
}
các class của phần 2 sẽ implements interface này

* menu demo:
==== Bạn là: ====
1. Khách hàng 
2. Nhân viên
Lựa chọn: 

==== Menu Khách hàng ====
1. Xem thông tin tour
2. Tìm kiếm tour
3. Đăng ký tour
4. Thoát
Lựa chọn: 
Nếu chọn 2 thì tiếp tục hiện menu lựa chọn:
1. Tìm kiếm theo mã tour
2. Tìm kiếm theo tên tour
3. Tìm kiếm theo khoảng giá
4. Tìm kiếm theo loại tour (trong nước/quốc tế)
5. Thoát (quay lại menu Khách hàng)

==== Menu Nhân viên ====
ĐĂNG NHẬP
Username:
Password: 
Đăng nhập thành công thì hiện menu:
1. Xem danh sách khách hàng
2. Thêm khách hàng mới
3. Cập nhật thông tin tour
4. Xem danh sách tour
5. Thêm tour mới
6. Sửa thông tin tour
7. Xóa tour
8. Đăng xuất
Lựa chọn:
