package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
        int i = 0, num = number,num1=num%10;
        if(num1==digit) return true;
         for(;i<5;i++){
            num/=10;
            num1=num%10;
            if(num1==digit) return true;
        }

        return false;
    }
    public static int fiboNumber(int n){
        int i,curr = 0,next=1,prev=1;
        System.out.println(next);
        System.out.println(prev);
        for(i=2;i<n;i++){
            curr=next+prev;
            next=prev;
            prev=curr;
           System.out.println(curr);
        }
        return curr;
    }
    public static boolean isGoldenTriangle(int a,int b,int c){
        double d=(double)a/c,e=(double)a/b,f=(double)b/a;
        if(a==b&&d>=1.61703&&d<=1.61903)return true;
        else if(a==c&&e>=1.61703&&e<=1.61903) return true;
        else if(b==c&&f>=1.61703&&f<=1.61903)  return true;
        else return false;
    }

    public static void main(String[] args) {
        int a=fiboNumber(15);
        boolean b=isGoldenTriangle(7000,7000,4325);
        System.out.println(b);
        }
    }


