package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit){
        if(number%10==digit||number%1==digit) return true;
        else return false;
    }
    public static int fiboNumber(int n){
        int i=0,next=1, prev=0, curr=1;
        for(;i<=n;i++){
            curr=next+prev;
            next=prev;
            prev=curr;
        }
        return curr;
    }
    public static boolean isGoldenTriangle(int a,int b,int c){
        if(a==b)
            if(a/c>=1.61703&&a/c<=1.61903) return true;
            else return false;
            if(a==c)
                if(a/b>=1.61703&&a/b<=1.61903) return true;
                else return false;
                if(b==c)
                    if(b/a>=1.61703&&b/a<=1.61903) return true;
                    else return false;
                    else return false;

    }

    public static void main(String[] args) {
        int curr=1,next=1,prev=0;
        for(int i=0;i<15;i++){
            curr=next+prev;
            next=prev;
            prev=curr;
            System.out.println(curr);
        }


    }
}
