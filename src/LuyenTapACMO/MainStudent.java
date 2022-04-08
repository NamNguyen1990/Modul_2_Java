package LuyenTapACMO;

public class MainStudent {
    // Bài này mục đích là để thay đổi phương thức truy cập:
    // Nếu khai báo private thì phải sử dụng get set để truy cập vào
    // Còn nếu muốn truy cập vào ngay thuộc tính thì phải thay đổi ko để được private(bỏ private đi)
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
