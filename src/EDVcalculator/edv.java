package EDVcalculator;

import java.util.Scanner;

public class edv {
    public static void main(String[] args) {
        double mebleg, edvMebleg, edv = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Ümumi qiymeti daxil edin:");
        mebleg = input.nextDouble();
        edvMebleg = mebleg + (mebleg * edv);
        System.out.println("Mehsulun edvli meblegi: " + edvMebleg);
    }
}
