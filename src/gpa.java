import java.util.Scanner;

public class gpa {
    public static void main(String[] args) {
        int math, iq, english;
        double ortalama;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Math score:");
        math = scan.nextInt();
        System.out.println("Enter your IQ score:");
        iq = scan.nextInt();
        System.out.println("Enter your English score:");
        english = scan.nextInt();

        ortalama = (math * 0.3) + (iq * 0.2) + (english * 0.4);
        System.out.println("GPA: " + ortalama);
        String result = (ortalama >= 51) ? "congratulations you passed" : "you didn't pass";
        System.out.println(result);
    }
}
