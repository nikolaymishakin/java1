package ru.progwards.java1.lessons.classes;
public class ComplexNum {
    private int a,b,c,d;

    public ComplexNum(int a,int b){
        this.a=a;this.b=b;
    }
    public String toString(){
        String string1=Integer.toString(a);
        String string2=Integer.toString(b);
        return a+"+"+b+"i";
    }
     public ComplexNum add(ComplexNum num){
        int c,d;
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
         ComplexNum num1=new ComplexNum(99,99);
        ComplexNum num2=new ComplexNum(1,1);

    }
}
