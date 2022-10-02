package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public enum RomanNumbers {
    I(1), II(2), III(3), IV(4), V(5),
    VI(6), VII(7), VIII(8), IX(9), X(10); //создаю объекты класса enum (перечисления) с переменной value которую содержит этот объект

    private int value; //создаю переменную value для объектов перечисления RomanNumbers
    RomanNumbers(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    } //создаю метод, который возвращает переменную value для каждого объекта (getter)

    public static int romanToArab(String romanNum) { //создаю метод, который переводит римские числа введенные в него в значения, на входе строка romanNumber, на выходе переменная
        int x1 = 100;
        switch (romanNum) {
            case "I":
                x1 = RomanNumbers.I.getValue();
                break;
            case "II":
                x1 = RomanNumbers.II.getValue();
                break;
            case "III":
                x1 = RomanNumbers.III.getValue();
                break;
            case "IV":
                x1 = RomanNumbers.IV.getValue();
                break;
            case "V":
                x1 = RomanNumbers.V.getValue();
                break;
            case "VI":
                x1 = RomanNumbers.VI.getValue();
                break;
            case "VII":
                x1 = RomanNumbers.VII.getValue();
                break;
            case "VIII":
                x1 = RomanNumbers.VIII.getValue();
                break;
            case "IX":
                x1 = RomanNumbers.IX.getValue();
                break;
            case "X":
                x1 = RomanNumbers.X.getValue();
                break;
        }
        return x1;
    }

    public static String arabToRoman(int z){  //создаю метод, который переводит арабские числа числа введенные в него в римские, на входе переменная z, на выходе строка
        String s = "throws Exception"; //на случай 0 или отрицательного значения
        switch (z) {
            case 1: s = "I";
                    break;
            case 2: s = "II";
                    break;
            case 3: s = "III";
                    break;
            case 4: s = "IV";
                break;
            case 5: s = "V";
                break;
            case 6: s = "VI";
                break;
            case 7: s = "VII";
                break;
            case 8: s = "VIII";
                break;
            case 9: s = "IX";
                break;
            case 10: s = "X";
                break;
            case 11: s = "XI";
                break;
            case 12: s = "XII";
                break;
            case 13: s = "XIII";
                break;
            case 14: s = "XIV";
                break;
            case 15: s = "XV";
                break;
            case 16: s = "XVI";
                break;
            case 17: s = "XVII";
                break;
            case 18: s = "XVIII";
                break;
            case 19: s = "IXX";
                break;
            case 20: s = "XX";
                break;
            case 21: s = "XXI";
                break;
            case 24: s = "XXIV";
                break;
            case 25: s = "XXV";
                break;
            case 27: s = "XXVII";
                break;
            case 30: s = "XXX";
                break;
            case 35: s = "XXXV";
                break;
            case 36: s = "XXXVI";
                break;
            case 40: s = "XL";
                break;
            case 42: s = "XLII";
                break;
            case 45: s = "XLV";
                break;
            case 48: s = "XLVIII";
                break;
            case 49: s = "XLIX";
                break;
            case 50: s = "L";
                break;
            case 54: s = "LIV";
                break;
            case 56: s = "LVI";
                break;
            case 60: s = "LX";
                break;
            case 63: s = "LXIII";
                break;
            case 64: s = "LXIV";
                break;
            case 70: s = "LXX";
                break;
            case 72: s = "LXXII";
                break;
            case 80: s = "LXXX";
                break;
            case 81: s = "LXXXI";
                break;
            case 90: s = "XC";
                break;
            case 100: s = "C";
                break;
            /*default:
                try{
                    throw new Exception();
                } catch (Exception e) {
                    System.err.println("throws Exception больше 10 римскими");
                }*/
        }
        return s;
    }
}