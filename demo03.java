// Viết chương trình Java mà khi chạy, màn hình console sẽ cho phép ta nhập vào một số nguyên, in ra màn hình “Đây là số nguyên dương”
//Nếu số vừa nhập vào là một số lớn hơn hoặc bằng 0, ngược lại in ra “Đây là số nguyên âm”.//

import java.util.Scanner;

public class demo03{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so ban mong muon :");
        int mm = scanner.nextInt();
        if(mm>=0){
            System.out.print("day la so nguyen duong");
        }else{
            System.out.print("day la so nguyen am");
        }
    }
}