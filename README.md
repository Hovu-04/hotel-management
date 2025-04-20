# Đồ Án Tốt Nghiệp - Hệ Thống Đặt Phòng Khách Sạn

Dự án được chia thành hai phần chính:
- **Frontend (GD_Booking)**: Giao diện người dùng được xây dựng bằng React.js
- **Backend (Hotel_Stars)**: API server được xây dựng bằng Spring Boot

## Cấu Trúc Dự Án

```
DATN/
├── GD_Booking/          # Frontend Project
│   ├── public/          # Static files
│   └── src/             # Source code
│       ├── components/  # React components
│       ├── pages/       # Page components
│       ├── services/    # API services
│       └── ...
│
└── Hotel_Stars/         # Backend Project
    ├── src/            # Source code
    │   ├── main/       # Main application
    │   └── test/       # Test files
    └── pom.xml         # Maven configuration
```

## Yêu Cầu Hệ Thống

### Frontend (GD_Booking)
- Node.js version 14.x trở lên
- npm hoặc yarn
- React.js
- Modern web browser (Chrome, Firefox, Safari)

### Backend (Hotel_Stars)
- Java JDK 11 trở lên
- Maven
- MySQL Server
- Spring Boot 2.x

## Hướng Dẫn Cài Đặt

### 1. Cài Đặt Backend (Hotel_Stars)

1. Clone repository
2. Cấu hình MySQL database trong `application.properties`
3. Chạy lệnh Maven để build project:
```bash
cd Hotel_Stars
mvn clean install
```
4. Chạy ứng dụng:
```bash
mvn spring-boot:run
```
Server sẽ chạy tại http://localhost:8080

### 2. Cài Đặt Frontend (GD_Booking)

1. Di chuyển vào thư mục frontend:
```bash
cd GD_Booking
```

2. Cài đặt dependencies:
```bash
npm install
```

3. Chạy ứng dụng trong môi trường development:
```bash
npm start
```
Ứng dụng sẽ chạy tại http://localhost:3000

## Tài Khoản Demo

### Admin
- Username: admin
- Password: admin123

### Nhân Viên
- Username: employee
- Password: employee123

### Khách Hàng
- Username: customer
- Password: customer123

## Tài Liệu API

- API Documentation: http://localhost:8080/swagger-ui.html
- Frontend Documentation: Xem trong thư mục `GD_Booking/docs`

## Công Nghệ Sử Dụng

### Frontend
- React.js
- Redux for state management
- React Router
- Axios for API calls
- Bootstrap & Material-UI
- JWT Authentication

### Backend
- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL Database
- JWT Authentication
- Maven
