import java.util.Scanner;

public class TryCatch {
    public static void check(int a, int b, int c){
        if(a<=0 || b<=0 ||c<=0 || (a+b<c) || (b+c<a) || (c+a<b)){
            try {
                throw new IllegalAccessException();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap 3 canh cua 1 tam giac");
        System.out.println("nhap canh thu 1:");
        int canh1 = scanner.nextInt();
        System.out.println("nhap canh thu 2:");
        int canh2 = scanner.nextInt();
        System.out.println("nhap canh thu 3:");
        int canh3 = scanner.nextInt();

        check(canh1,canh2,canh3);
    }

}
