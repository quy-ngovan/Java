import java.util.Scanner; // nhúng thư viện Scanner vào chương trình để nhận dữ liệu đầu vào từ bàn phím hoặc các nguồn khác

public class bai_1 { // tên class phải trùng với tên file
    public static void main(String[] args) { // hàm main
        // int a = 100, b = 200;
    // println: in đồng thời xuống dòng
        // System.out.println(a); 
        // System.out.println("Hello World");
        // System.out.println("Gia tri cua a = " + a + ", b = " + b + ".");

    // printf: giống C
        // System.out.printf("Gia tri bien a = %d.\n", a);

    // Nhập dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in); // chưa hiểu câu lệnh này dùng để làm gì
        int a;
        System.out.println("Nhap vao so nguyen: ");
        a = sc.nextInt(); // nhập số nguyên
        System.out.println("Nhap vao so thuc: ");
        float b = sc.nextFloat(); // nhập số thực
        System.out.println("Nhap ten cua ban: ");
        sc.nextLine(); // xoá ký tự xuống dòng --> tránh trôi lệnh
        String name = sc.nextLine();
        System.out.println("Nhap vao mot ky tu: ");
        char kyTu = sc.nextLine().charAt(0); // nhập một ký tự từ bàn phím
        System.out.println("Nhap vao dung sai: ");
        boolean check = sc.nextBoolean();
    }
}



























