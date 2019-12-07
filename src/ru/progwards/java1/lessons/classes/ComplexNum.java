package ru.progwards.java1.lessons.classes;
public class ComplexNum {
    private int a,b,c,d;

    private String sign(){
        if(b>0) return "+";
        else return "-";
    };
    public ComplexNum(int a,int b){
        this.a=a; this.b=b;this.c=c;this.d=d;
        a=1; b=56;
    }
    @Override
    public String toString(){
        String string;
        if(b==1||b==-1){
            if(a==0){
                string=sign()+"i";}
            else {string=Integer.toString(a)+sign()+"i";}
            }
        else {string=Integer.toString(a)+sign()+Integer.toString(b)+"i";
        }
        return string;
    }
     public ComplexNum add(ComplexNum num){
         return new ComplexNum(num.a+num.c,num.b+num.d);
    }
    public ComplexNum sub(ComplexNum num){
        return new ComplexNum(num.a-num.c,num.c-num.d);
    }
    public ComplexNum mul(ComplexNum num){
        return new ComplexNum(num.a*num.c-num.b*num.d,num.b*num.c+num.a*num.d);
    }
    public ComplexNum div(ComplexNum num){
        int div= num.c*num.c+num.d*num.d;
        return new ComplexNum((num.a*num.c+num.b*num.d)/div,(num.b*num.c-num.a*num.d)/div);
    }
    public static void main(String[] args) {
        int a=1,b=56;
        System.out.println(a+"+"+b+"i");
    }
}
