package lab_2;

// 8
public class Pr_1 {
    public static void main(String[] args){
        String[] a = {"1a1 ", "2a2 ", "3a3 ", "4a4 ", "5a5 ", "6a6 "};
        int n = a.length;
        for (int i = 0; i < n; i++){
            System.out.print(a[i]);
        }
        System.out.println();

        String temp;
        for (int i = 0; i < n/2; i++) {
            temp = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = temp;
        }

        for (int i = 0; i < n; i++){
            System.out.print(a[i]);
        }
    }
}
