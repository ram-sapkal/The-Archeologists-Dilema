package com.company;

import java.util.Scanner;

public class TheArcheologistsDilemma {
    public int checkPalindrome(int num,int sz){
        int temp1=0,temp2,i;
        for(i=num;i>0; )
        {
            temp2=i%10;
            temp1=temp1*10+temp2;
            i=i/10;
            if((i+"").length()==(sz+"").length()){
                break;
            }
        }
        return i;
    }
    public int countDigit(int n)
    {
        int count = 0;
        while(n != 0)
        {
            n = n / 10;
            count = count + 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TheArcheologistsDilemma t = new TheArcheologistsDilemma();
        int input = sc.nextInt();
        while(input!=0){
            for(int i=0;i<214748364;i++){
                int temp= (int) Math.pow(2,i);
                int temp2=t.checkPalindrome(temp,input+"".length());
                if(temp2==input){
                    if((t.countDigit(temp))-(t.countDigit(input))>t.countDigit(input)){
                        System.out.println(i);
                        break;
                    }
                }
            }
            input=sc.nextInt();
        }
    }
}

/*
Output :-
        1
        7
        2
        8
        10
        20
*/
