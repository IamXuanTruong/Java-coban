import java.util.Scanner;

public class demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao so mong muon :");
        Float hang = scanner.nextFloat();
        if(hang == 0){
            System.out.print("khum ");
        }else{
            System.out.print("Hang rat toi");
        }
    }
}
