package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int hours_start = 9;
        int tab = 28800;

        System.out.println("Пожалуйста введите часы в диапазоне от 9 до 17 :  ");
        Scanner scanner1 = new Scanner(System.in);
        int hors = scanner1.nextInt();

        System.out.println("Пожалуйста введите минуты (если кол-во часов не более 16) в диапазоне от 0 до 60  :  ");
        Scanner scanner2 = new Scanner(System.in);
        int min = scanner2.nextInt();

        Calc calc1 = new Calc();
        Calc calc2 = new Calc();

        int h_dif = (hors - hours_start) ;
        int sec_rest = (tab - (calc1.getHors(h_dif) + calc2.getMin(min))) ;
        int hors_rest = sec_rest / 3600;
        int min_rest = ((sec_rest / 60)- (hors_rest * 60)) ;


        System.out.println("Через " + sec_rest + " секунд можно идти домой (" +  hors_rest + " часов " + min_rest +" минут)" );


    }

}