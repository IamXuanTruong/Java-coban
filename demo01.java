import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm lý: \n");
        double ly = scanner.nextDouble();

        System.out.print("nhập điểm toán: \n");
        double toan = scanner.nextDouble();
        System.out.print("nhập điểm hóa: \n");
        double hoa = scanner.nextDouble();
        double diemtb;
        if ((toan < 0 || toan > 10) || (ly < 0 || ly > 10) || (hoa < 0 || hoa > 10)) {
            System.out.print("diem khong hop le");
        } else {
            diemtb = (toan + ly + hoa) / 3;
            System.out.print("Diem tb la: \n" + diemtb);
            if (diemtb >= 9 && diemtb <= 10) {
                System.out.print("Xep loai xuat xac");
            } else if (diemtb >= 8 && diemtb < 9) {
                System.out.print("Xep loai gioi");
            } else if (diemtb >= 6.5 && diemtb < 8) {
                System.out.print("Xep loai kha");
            } else if (diemtb >= 5 && diemtb < 6.5) {
                System.out.print("Xep loai trung binh");
            } else if (diemtb >= 3.5 && diemtb < 5) {
                System.out.print("Xep loai yeu");
            } else {
                System.out.print("Xep loai kem");
            }
        }

    }
}