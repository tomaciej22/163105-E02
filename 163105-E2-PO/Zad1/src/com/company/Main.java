package com.company;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
          Integer[] PosortowaneLiczbyNiePalindrom = {1,2,3,3,99,100};
          ArrayUtil.jestPalindromem(PosortowaneLiczbyNiePalindrom);

          Integer[] niePosortowaneLiczbyPalindrom = {1,2,3,99,3,2,1};
          ArrayUtil.jestPalindromem(niePosortowaneLiczbyPalindrom);

          LocalTime[] posortowaneDatyNiePalindrom = {
                  LocalTime.of(10,11),
                  LocalTime.of(12,11),
                  LocalTime.of(14,11),
          };
          ArrayUtil.jestPalindromem(posortowaneDatyNiePalindrom);
        LocalTime[] niePosortowaneDatyPalindrom = {
                LocalTime.of(10,11),
                LocalTime.of(12,11),
                LocalTime.of(12,11),
                LocalTime.of(10,11),
        };
        ArrayUtil.jestPalindromem(niePosortowaneDatyPalindrom);
}
}
