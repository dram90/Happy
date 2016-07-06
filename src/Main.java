
// We'll say that a lowercase 'g' in a string is "gHappy" if there is another 'g'
// immediately to its left or to its right.

import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) {


                Scanner sc = new Scanner(System.in);

                int length;
                System.out.println("Please write the string");
                String givenstring = sc.nextLine(); // permite que se lea hasta apretar enter
                length = givenstring.length();
                int contHappy=0;

                for(int i=0; i<length-1; i++)
                {
                    char last = givenstring.charAt(length-1);
                    char actual= givenstring.charAt(i);
                    char next = givenstring.charAt(i+1);
                    if((last!='g') && (actual=='g') && (actual==next))
                    {
                        contHappy++;
                    }

                    else
                    {
                        continue;
                    }

                }
                if (contHappy !=0 && contHappy%2==0)
                {
                    System.out.println("The string is Happy :) ");
                }

                else
                {
                    System.out.println("The string is not Happy :( ");
                }

            }
        }
