import java.util.Scanner;

public class foregone{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int tc = Integer.parseInt(sc.nextLine());
    for (int i = 1; i<=tc; i++){
        int n = Integer.parseInt(sc.nextLine()); 
        for(int a = 1; a<n; a++){
            int b = (n-a);
            String aa = a + "";
            String bb = b + "";
            if (aa.indexOf("4") == -1 && bb.indexOf("4")==-1){
                System.out.println("Case #"+i+": "+aa+" "+bb);
                break;
            }
        }
        
        
        
    }
}
}