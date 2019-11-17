package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit){
        if(number%10==digit|number/10==digit) return true;
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
        double d=a/c,e=a/b,f=b/a;
        if(a==b)
        {if(d>=1.61703&&d<=1.61903) return true; else return false;}
            else if(a==c)
            {if(e>=1.61703&&e<=1.61903) return true; else return false;}
                else if(b==c) { if(f>=1.61703&&f<=1.61903) return true; else return false;}
                    else return false;

    }

    public static void main(String[] args) {
        int curr=1,next=1,prev=0;
        for(int i=0;i<15;i++) {
            curr = next + prev;
            next = prev;
            prev = curr;

        }
            boolean a=containsDigit(28,8);
            System.out.println(a);



    }
}
