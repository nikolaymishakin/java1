package ru.progwards.java1.lessons.test;

public class Test1 {
    static String textGrade(int grade){
        int i = grade;
        if(i ==0) return "не оценено";
        else if(i>=0&&i<21) return "очень плохо";
        else if(i>20&&i<41) return "плохо";
        else if(i>40&&i<61) return "удовлетворительно";
        else if(i>60&&i<81) return "хорошо";
        else if(i>80&&i<101) return "отлично";
        else return "не определено";
    }

    public static void main(String[] args){
//        System.out.println("Сделаю коммит, запушу в репо: робот, проверяй теперь всё это...");
        String m = textGrade(15);
        System.out.println(m);
    }
}
