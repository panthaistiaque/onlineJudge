/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lightoj.beginners;

import java.util.Scanner;

/**
 *
 * @author Mohammad Istiaque Hossain <Software Developer>
 * @creation date: Jul 25, 2019 1:35:35 PM
 */
public class Problem1000 {

    public static void main(String[] args) {
        String input;
        int counter = 0, a = 0, b = 0;
        Scanner s = new Scanner(System.in);
        int caseNumber = s.nextInt();
        s.nextLine();
        if (caseNumber <= 125) {
            for (int i = 0; i < caseNumber; i++) {
                input = s.nextLine();
                a = Integer.valueOf(input.split(" ")[0]);
                b = Integer.valueOf(input.split(" ")[1]);
                if (a >= 0 && b >= 0 && a < 10 && b < 10) {
                    counter = a + b;
                    System.out.println("Case " + (i + 1) + ": " + counter);

                }

            }
        }
    }
}
