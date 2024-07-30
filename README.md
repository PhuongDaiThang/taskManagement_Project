# Task Management Application

## Giới thiệu

Task Management Application là một ứng dụng quản lý công việc được xây dựng bằng Spring Boot. Ứng dụng này cho phép người dùng tạo, xem, cập nhật và xóa các công việc trong hệ thống. Nó cung cấp một giao diện người dùng đơn giản và dễ sử dụng cho việc quản lý công việc hàng ngày.

## Các tính năng

- **Quản lý công việc**: Tạo, cập nhật, xem và xóa công việc.
- **Giao diện người dùng**: Giao diện web đơn giản cho việc quản lý công việc.
- **Lưu trữ dữ liệu**: Sử dụng cơ sở dữ liệu H2 để lưu trữ thông tin công việc.
- **API REST**: Cung cấp các API để tương tác với dữ liệu công việc.

## Công nghệ sử dụng

- **Spring Boot**: Framework chính để phát triển ứng dụng.
- **Spring Data JPA**: Để tương tác với cơ sở dữ liệu.
- **H2 Database**: Cơ sở dữ liệu nhúng cho môi trường phát triển.
- **Maven**: Công cụ quản lý dự án và phụ thuộc.

## Cài đặt

1. **Clone Repository**

   
bash
   git clone https://github.com/PhuongDaiThang/taskmanagement_Project.git
   cd taskmanagement_Project

2. **Cài đặt các phụ thuộc**
   
bash
      mvn install

3. **Chạy Ứng Dụng**
   
bash
   mvn spring-boot:run

Ứng dụng sẽ chạy trên http://localhost:8080.
## Cấu trúc Dự án

- **src/main/java/com/example/taskmanagement**: Đây là thư mục chứa mã nguồn chính của ứng dụng.
  - **controller**: Chứa các lớp điều khiển (controller classes) xử lý các yêu cầu HTTP từ người dùng. Các lớp này nhận yêu cầu, gọi các dịch vụ phù hợp và trả về phản hồi.
  - **model**: Chứa các lớp mô hình (model classes) đại diện cho các thực thể trong cơ sở dữ liệu. Các lớp mô hình này thường được ánh xạ với các bảng trong cơ sở dữ liệu và chứa các thuộc tính tương ứng.
  - **repository**: Chứa các lớp truy cập dữ liệu (repository classes) và các phương thức tương tác với cơ sở dữ liệu. Các lớp này sử dụng Spring Data JPA để thực hiện các thao tác CRUD (Create, Read, Update, Delete) trên các thực thể.
  - **service**: Chứa các lớp dịch vụ (service classes) xử lý logic nghiệp vụ. Các lớp này thực hiện các hoạt động chính của ứng dụng và gọi các lớp repository để tương tác với cơ sở dữ liệu.

- **src/main/resources**: Thư mục này chứa các tệp cấu hình và tài nguyên khác cần thiết cho ứng dụng.
  - **application.properties**: Tệp cấu hình chính của ứng dụng Spring Boot. Nó chứa các thiết lập cấu hình như cài đặt kết nối cơ sở dữ liệu, cấu hình máy chủ, và các thông số khác của ứng dụng.
## Giao diện Người Dùng
Ứng dụng cung cấp giao diện web để quản lý công việc:

- **Trang chính**:: Trang chính của ứng dụng với các liên kết đến danh sách công việc và người dùng.
- **Danh sách công việc**:: Hiển thị danh sách tất cả các công việc với các tùy chọn để chỉnh sửa hoặc xóa công việc.
- **Form thêm/chỉnh sửa công việc**:: Cho phép người dùng thêm mới hoặc chỉnh sửa thông tin công việc.
## Các Trang HTML
- **Trang chính (index.html)**:: Cung cấp liên kết đến các chức năng chính của ứng dụng.
- **Danh sách công việc (task-list.html)**:: Hiển thị danh sách công việc với các tùy chọn hành động.
- **Form thêm/chỉnh sửa công việc (task-form.html)**:: Cho phép thêm mới hoặc chỉnh sửa công việc.
## Tài liệu API

Ứng dụng cung cấp các API REST để tương tác với dữ liệu công việc. Các API này có thể được truy cập tại http://localhost:8080/api.

### Các điểm cuối (Endpoints)

- **GET /tasks**: Lấy danh sách tất cả công việc trong hệ thống.
- **GET /tasks/{id}**: Lấy thông tin chi tiết về một công việc cụ thể dựa trên ID của công việc.
- **POST /tasks**: Tạo một công việc mới với các thông tin được cung cấp trong yêu cầu.
- **PUT /tasks/{id}**: Cập nhật thông tin của một công việc cụ thể dựa trên ID của công việc.
- **DELETE /tasks/{id}**: Xóa một công việc cụ thể dựa trên ID của công việc.

## Đóng góp

Nếu bạn muốn đóng góp cho dự án này, vui lòng thực hiện một trong các cách sau:
- **Tạo một Pull Request**: Nếu bạn đã thực hiện các thay đổi hoặc cải tiến và muốn thêm chúng vào dự án, hãy tạo một pull request trên GitHub.
- **Gửi một Vấn đề (Issue)**: Nếu bạn phát hiện lỗi hoặc có đề xuất cải tiến, hãy gửi một vấn đề (issue) trên GitHub để thảo luận và làm rõ các thay đổi cần thiết.

## Liên hệ

Nếu bạn có bất kỳ câu hỏi nào hoặc cần thêm thông tin, vui lòng liên hệ với tôi qua email: phuongdaithang2004@gmail.com).
