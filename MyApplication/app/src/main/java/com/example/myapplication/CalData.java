package com.example.myapplication;

public class CalData {  //CalData 클래스 : 날짜별 요일 알기위함 ArrayList<Integer> arrData에서 Integer값으로 들어감
    int day;            //int형으로 날짜를 저장하는 변수
    int dayofweek;      //int형으로 요일을 저장하는 변수

    public CalData(int d, int h) {
        day = d;
        dayofweek = h;
    }

    public int getDay() {
        return day;
    }

    public int getDayofweek() {
        return dayofweek;
    }
}
