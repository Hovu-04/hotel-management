# Hệ Thống Đặt Phòng Khách Sạn

Ứng dụng quản lý và đặt phòng khách sạn full-stack với bảng điều khiển quản trị, cổng nhân viên và giao diện đặt phòng cho khách hàng.

## Tính Năng Chính

### Tính Năng Cho Khách Hàng
- Tìm kiếm và duyệt phòng khách sạn
- Xem chi tiết phòng, tiện nghi và hình ảnh
- Đặt phòng trực tuyến
- Nhiều phương thức thanh toán (thanh toán online, thanh toán tại khách sạn)
- Xem lịch sử đặt phòng
- Đánh giá và xếp hạng
- Quản lý thông tin cá nhân và tài khoản
- Tải xuống xác nhận đặt phòng dưới dạng PDF

### Tính Năng Cho Quản Trị Viên
- Quản lý phòng và loại phòng
- Cấu hình tiện nghi và dịch vụ phòng
- Thiết lập giá phòng và tình trạng phòng
- Xử lý đặt phòng và đặt chỗ
- Quản lý tài khoản khách hàng
- Xem báo cáo đặt phòng và thống kê
- Cấu hình thông tin và hình ảnh khách sạn

### Tính Năng Cho Nhân Viên
- Nhận phòng/trả phòng cho khách
- Xử lý thanh toán
- Quản lý trạng thái phòng
- Xử lý yêu cầu của khách hàng
- Xem nhiệm vụ được giao

## Công Nghệ Sử Dụng

### Frontend (GD_Booking)
- React.js
- Bootstrap cho giao diện người dùng
- JWT cho xác thực
- Form validation
- Upload ảnh lên Firebase
- Tạo PDF

### Backend (Hotel_Stars)
- Spring Boot
- Spring Security 
- JPA/Hibernate
- Cơ sở dữ liệu MySQL
- RESTful APIs
- Thông báo qua email
- Tạo PDF

## Các Module Chính

### Quản Lý Phòng
- Thêm/sửa/xóa phòng
- Cấu hình loại phòng
- Thiết lập tiện nghi
- Quản lý trạng thái phòng
- Tải lên hình ảnh phòng

### Quản Lý Đặt Phòng
- Xử lý đặt phòng
- Xử lý thanh toán
- Gửi xác nhận
- Tạo hóa đơn
- Theo dõi trạng thái đặt phòng

### Quản Lý Người Dùng
- Tài khoản khách hàng
- Tài khoản nhân viên
- Phân quyền truy cập
- Quản lý thông tin cá nhân

### Quản Lý Dịch Vụ
- Dịch vụ phòng
- Gói dịch vụ
- Tiện nghi
- Định giá

### Đánh Giá & Xếp Hạng
- Đánh giá của khách hàng
- Xếp hạng sao
- Xử lý phản hồi

## Hướng Dẫn Cài Đặt

1. Clone repository
2. Cấu hình kết nối database
3. Cài đặt các dependencies
4. Chạy server backend
5. Chạy ứng dụng frontend
6. Truy cập trang quản trị tại /admin
7. Truy cập cổng khách hàng tại /client

## Tài Liệu API
Có sẵn tại `/api/docs`
