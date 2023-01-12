import java.util.Scanner;

public class decryptName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter encrypted name : ");
        String ctext = in.next();
        System.out.print("Enter your encryption key : ");
        int r = in.nextInt();
        in.close();

        int key;
        if (r % 26 == 0) {
            key = 14;
        } else {
            key = r % 26;
        }

        System.out.println("Your encrypted name is  : " + ctext);
        System.out.println("Your encryption key is : " + key);
        System.out.println("Your decrypted name is  : " + decrypt(ctext, key));
    }

    public static StringBuffer decrypt(String ctext, int key) {
        StringBuffer result = new StringBuffer();
        key = 26 - key;
        for (int i = 0; i < ctext.length(); i++) {
            if (Character.isUpperCase(ctext.charAt(i))) {
                char ch = (char) (((int) ctext.charAt(i) + key - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) ctext.charAt(i) + key - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
}