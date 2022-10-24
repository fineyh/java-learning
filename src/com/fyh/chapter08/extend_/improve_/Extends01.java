package com.fyh.chapter08.extend_.improve_;

import com.fyh.chapter08.extend_.Graduate;
import com.fyh.chapter08.extend_.Pupil;

public class Extends01 {
    public static void main(String[] args) {
        com.fyh.chapter08.extend_.Pupil pupil = new Pupil();
        pupil.name="小智";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(80);
        pupil.showInfo();

        com.fyh.chapter08.extend_.Graduate graduate = new Graduate();
        graduate.name="小刚";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(60);
        graduate.showInfo();
    }
}
