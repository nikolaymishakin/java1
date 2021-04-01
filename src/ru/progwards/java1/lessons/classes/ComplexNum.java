package ru.progwards.java1.lessons.classes;
public class ComplexNum {
    public int a,b;

    public ComplexNum(int a,int b){
        this.a=a;this.b=b;
    }
    public String toString(){
        return a+"+"+b+"i";
    }
     public ComplexNum add(ComplexNum num){
        return new ComplexNum(this.a+num.a,this.b+num.b);
    }
    public ComplexNum sub(ComplexNum num){
        return new ComplexNum(this.a-num.a,this.b-num.b);
    }
    public ComplexNum mul(ComplexNum num){

        return new ComplexNum(this.a*num.a-this.b*num.b,this.b*num.a+this.a*num.b);
    }
    public ComplexNum div(ComplexNum num){
        int div= num.a*num.a+num.b*num.b;
        return new ComplexNum((this.a*num.a+this.b*num.b)/div,(this.b*num.a-this.a*num.b)/div);
    }
    public static void main(String[] args) {
        System.out.println();
    }
}
