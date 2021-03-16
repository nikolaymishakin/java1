package ru.progwards.java1.lessons.interfaces;

public interface CompareWeight {
    enum CompareResult {
        LESS, EQUAL, GREATER
    }

    CompareResult compareWeight(CompareWeight smthHasWeigt);

}
