package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // создаю объект sc класса сканер с потоком ввода System.in (вводим значения с клавиатуры), для хранения введенных значений с клавиатуры
        String input = sc.nextLine(); // создаю строку input типа String и в эту строку передаетс то, что вводится с клавиатуры, методом nextLine считываем всю строку, что ввели в консоль
        String[] inputArray = input.split((" ")); // создаю строковый массив inputArray и использую метод split для присваивания элементам массива новых строк, который разделяет строку input на массив строк, разделитель тут пробел
        if (inputArray.length != 3) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.err.println("throws Exception");
            }  //проверяю длину массива, чтобы было только 2 слагаемых
           } else { //ниже через if проверяю что в строковом массиве на входе (слагаемые): римские или арабские числа, если арабские то выполняется следующий блок, иначе выполняется блок для арабсих чисел
                    if ((inputArray[0].equals("1") | inputArray[0].equals("2") | inputArray[0].equals("3") | inputArray[0].equals("4") | inputArray[0].equals("5") | inputArray[0].equals("6") | inputArray[0].equals("7") | inputArray[0].equals("8") | inputArray[0].equals("9") | inputArray[0].equals("10")) | (inputArray[2].equals("1") | inputArray[2].equals("2") | inputArray[2].equals("3") | inputArray[2].equals("4") | inputArray[2].equals("5") | inputArray[2].equals("6") | inputArray[2].equals("7") | inputArray[2].equals("8") | inputArray[2].equals("9") | inputArray[2].equals("10"))) {
                                try {
                    int x = Integer.parseInt(inputArray[0]); // создаю переменную x и присваиваю ей значение первого эдемента массива inputArray (первого слагаемого), метод parseInt преобразовывает строку в переменную типа int
                    int y = Integer.parseInt(inputArray[2]); // создаю переменную y и присваиваю ей значение второго эдемента массива inputArray (второго слагаемого), метод parseInt преобразовывает строку в переменную типа int
                        if (x > 10 | y > 10) {
                            try{
                                throw new Exception();
                            } catch (Exception e) {
                                System.err.println("throws Exception");
                            }   //проверяю чтобы на входе были числа не более 10, если меньше то преобразовываем знак (второй элемент массива)
                        } else if (inputArray[1].equals("+")) {
                        int result = x + y;
                        System.out.println(result); // сравниваю с помощью метода equals второй элемент строкового массива inputArray (арифметическое действие) со строкой которая содержит знак арифметического действия и в зависимости от знака произвожу вычисления
                        } else if (inputArray[1].equals("-")) {
                        int result = x - y;
                        System.out.println(result);
                        } else if (inputArray[1].equals("/")) {
                        int result = x / y;
                        System.out.println(result);
                        } else if (inputArray[1].equals("*")) {
                        int result = x * y;
                        System.out.println(result);
                        } else {
                            try {
                                throw new Exception();
                            } catch (Exception e) {
                                System.err.println("throws Exception");
                                }
                            } //проверка корректности введеного знака
                            //System.out.println("throws Exeption знак"); //проверка корректности введеного знака
                                } catch (NumberFormatException e) {
                                    System.err.println("throws Exeption"); // ловится ислючение о том что типы не совпадают, когда в переменные х и у пытается записаться строка
                                    }
                        }
                    else if ((inputArray[0].equals("I") | inputArray[0].equals("II") | inputArray[0].equals("III") | inputArray[0].equals("IV") | inputArray[0].equals("V") | inputArray[0].equals("VI") | inputArray[0].equals("VII") | inputArray[0].equals("VIII") | inputArray[0].equals("IX") | inputArray[0].equals("X")) & (inputArray[2].equals("I") | inputArray[2].equals("II") | inputArray[2].equals("III") | inputArray[2].equals("IV") | inputArray[2].equals("V") | inputArray[2].equals("VI") | inputArray[2].equals("VII") | inputArray[2].equals("VIII") | inputArray[2].equals("IX") | inputArray[2].equals("X"))) {
                        String firstNum = inputArray[0], secondNum = inputArray[2]; //создаю две новые строки, в которые записываются значения слагаемых (в строковом формате первого и третьего элементов массива (римские числа))
                        int r1 = RomanNumbers.romanToArab(firstNum); //присваиваю переменной r1: значение с момощью метода romanToArab класса RomanNumbers, на вход в метод подается строка firstNum (первое слагаемое), метод возвращает число в зависимости от строки
                        int r2 = RomanNumbers.romanToArab(secondNum); //аналогично r1

                            if (r1 > 10 | r2 > 10) {
                                System.err.println("throws Exception"); //проверяю чтобы на входе были числа не более 10, если меньше то преобразовываем знак (второй элемент массива)
                            } else if (inputArray[1].equals("+")) {
                            int result = r1 + r2;
                             System.out.println(RomanNumbers.arabToRoman(result)); // вывожу результат вычислений в римских числах, метод arabToRoman класса RomanNumbers переводит результат вычисления в римские цифры, на выходе строка
                            } else if (inputArray[1].equals("-")) {
                            int result = r1 - r2;
                            System.out.println(RomanNumbers.arabToRoman(result));
                            } else if (inputArray[1].equals("/")) {
                            int result = r1 / r2;
                            System.out.println(RomanNumbers.arabToRoman(result));
                            } else if (inputArray[1].equals("*")) {
                            int result = r1 * r2;
                            System.out.println(RomanNumbers.arabToRoman(result));
                            } else {
                                try {
                                    throw new Exception();
                                } catch (Exception e) {
                                    System.err.println("throws Exception");
                                }
                            }//System.out.println("throws Exeption");
                    }
        }
    }
}
