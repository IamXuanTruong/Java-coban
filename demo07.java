// Viet phương trình tính tổng từ 1->100
public class demo07 {

    public static void main(String[] args) {
        int num = 100;
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.print("Tong tu 1->100:" + sum);
    }
}