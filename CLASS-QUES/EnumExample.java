package com.anudip.learning;

import java.util.Scanner;
import com.anudip.Level;

public class EnumDemo
{
    public enum ClassLevel
    {
        FIRST,
        SECOND,
        THIRD,
        FOURTH,
        FIFTH
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type one of the options");
        System.out.println("1. Low\n2. Medium\n3. High");
        String option = sc.nextLine();

        Level level = option.equals("Low") ? Level.LOW :
                      option.equals("Medium") ? Level.MEDIUM : Level.HIGH; 

        System.out.println("You have selected Level: " + level);

        ClassLevel cl = ClassLevel.FOURTH;
        System.out.println("Class Level selected: " + cl);

        sc.close();
    }
}
