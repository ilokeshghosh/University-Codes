import java.util.Scanner;

public class CaesarCipher_enc {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);



        System.out.println("Enter your last two digit your roll number");
        int roll=in.nextInt();


        System.out.print("Enter Your Name :");
        String name=in.next();

        char[] arr= new char[name.length()];

        for (int i=0;i<name.length();i++){
            arr[i]= name.charAt(i);
        }

        int key= roll%26;
        System.out.println(key);
        char[] C= new char[arr.length];
        for (int i=0;i<arr.length;i++){
           int temp=(arr[i]-97);
           int temp1=(temp+key)%26;
           int temp2=temp1+65;
           char e=(char)(temp2);
           C[i]=e;

        }
        for (int i=0;i<C.length;i++){
            System.out.println(C[i]);
        }







    }
}
