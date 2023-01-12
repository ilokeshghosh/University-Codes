import java.security.Key;
import java.util.Scanner;

public class CaeserCipher_dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        System.out.println("Enter your last two digit your roll number");
        int roll=in.nextInt();


        System.out.println("Enter Your Encrypted Name :");
        String name=in.next();

        char[] arr= new char[name.length()];

        for (int i=1;i<name.length();i++){
            arr[i]= name.charAt(i);
        }

        int key= roll%26;
        System.out.println(key);
        char[] C= new char[arr.length];
        for (int i=1;i<arr.length;i++){

            int x=arr[i];
//            int x1=(x-key)%26;
//            int temp=x1-65;
//            int temp1=


            int temp=x-65;

            if(temp==0){
                temp=8;
            }
            int temp1=(temp)%26;
            int temp2=temp1-key;
            int temp3=temp2+97;
            System.out.println(temp3);





            char de=(char)(temp3);
            C[i]=de;
//            System.out.println(de);


        }

        for (int i=0;i<C.length;i++){
            System.out.println(C[i]);
        }


//TWSMAP lokesh
//LUBOF




    }
}
