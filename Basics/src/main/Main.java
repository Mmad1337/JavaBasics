package main;
import java.util.ArrayList;
import java.util.List;

//import Da
class String_Manipulation{
    boolean ft_if_string_is_valid(String str){
        int i, flag;
        i = 0;
        flag = 0;
        while (i < str.length()){
            char c = str.charAt(i);
            if (Character.isAlphabetic(c))
                flag = 1;
            else
                return false;
            i++;
        }
        return flag == 1;
    }
    // Input : CamelCaseToSnakeCase
    // Output : camel_case_to_snake_case
    String ft_camel_to_snake(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                if (i > 0)
                    result.append('_');
            }
            result.append(c);
        }
        return (result.toString());
    }
    String Capitalizer(String str){
        StringBuilder result = new StringBuilder();
        int i = 0;
        while(i < str.length()){
            char c = str.charAt(i);
            if (Character.isUpperCase(c)){
                result.append(Character.toLowerCase(c));
            }
            else {
                result.append(Character.toUpperCase(c));
            }
            i++;
        }
        return (result.toString());
    }
}
class test{
    boolean ft_check_if_positive(int a, int b)
    {
        return (a > 0 && b > 0);
    }
    static int ft_add(int a, int b)
    {
        return (a + b);
    }

    static int ft_increase_number(int a)
    {
        return (a+=1);
    }
    static String ft_to_uppercase(String str)
    {
        String new_str = str.toUpperCase();
        return (new_str);
    }
    static void ft_swp(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static List<Integer> ft_if_odd(int[] arr){
            List<Integer> result = new ArrayList<>();
            boolean swaped = true;
            while (swaped){
                swaped = false;
                for (int i = 0; i < arr.length - 1; i++){
                    if (arr[i] > arr[i + 1]){
                        int swap = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = swap;
                        swaped = true;
                    }
                }
            }
            for (int i = 0; i < arr.length; i++){
                result.add(arr[i]);
            }
            return result;
    }
}
class Counter{ // declaration of a class
     static int ft_calc(int a, int b){
        return (a+b);
    }
}

class ft_grep{
    public static boolean ft_grep_my_name(String[] name, String target)
    {
        for (String new_string : name){
            if (new_string.contains(target))
                return true;
        }
        return false;
    }
}
// Define a class called person
class Person{
    // Define an instance variable
    String name;
    int age;
    // Define a constructor method : for initialize variables
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    // Define an instance method
    public void SeyHello(){
        System.out.println("Hello My name is " + name + " my age is " + age +" year old");
    }
}

class SortArray {
    int [] Array;
    public SortArray(int [] Array){
        this.Array = Array;
    }
    public void sort (){
        test.ft_if_odd(Array);
//        Arrays.sort(Array);
    }
}

class Solution {
    private void ft_swap(char [] s, int start, int end){
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
    }
    public void reverseString(char[] s) {
        int i = 0;
        int start = 0;
        int end = s.length - 1;
        while (start < s.length / 2) {
            ft_swap(s, start, end);
            start++;
            end--;
        }
    }
}

class Fo{
    String str;
    public Fo(String str)
    {
        this.str = str;
    }
      static void Ft_display(String str){
        System.out.println(str);
    }
}

class Car{
    // Define an instance variable.
    int speed;
    String name;
    float model;
    // Define a constructor method
    public Car(int speed, String name, float model){
        this.speed = speed;
        this.name = name;
        this.model = model;
    }
}
class Supercar extends Car{
    public Supercar(int speed, String name, float model) {
        super(speed, name, model);
    }
    public void ft_display_info(){
        System.out.println("F1 " + this.name + this.model +  " has higher speed goes up to " + this.speed);
    }
}
// Will work with generics methods in java
class Display_content{
    public <T> void ft_display_arr(T[] name){
        for(T x : name){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static <T> T ft_return_arr(T[] name){
        return (name[0]);
    }
}

// This is how we create generic class in java
// In simple way without generics first

class Class_first_item_int <T>{
    T a;
    public Class_first_item_int(T a){
        this.a = a;
    }
    public T ft_access_int(){
        return (a);
    }
}
//class Class_first_item_char{
//    char a;
//    public Class_first_item_char(char a){
//        this.a = a;
//    }
//    public void ft_access_int(){
//        System.out.println(this.a);
//    }
//}

//class Sort_different_data{
//    public <T> T sort_different_data(T[] arr){
//        List<T> result = new ArrayList<T>();
//        boolean swaped_T = true;
//        while (swaped_T){
//            swaped_T = false;
//            for (int i = 0; i < arr.length - 1; i++){
//                if (arr[i] > arr[i + 1]){
//                    int swap = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = swap;
//                    swaped_T = true;
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++){
//            result.add(arr[i]);
//        }
//        return (T) result;
//    }
//}

class SortDifferentData {
    public <T extends Comparable<T>> List<T> sortDifferentData(T[] arr) {
        List<T> result = new ArrayList<>();
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        }
        for (T element : arr) {
            result.add(element);
        }
        return result;
    }
}
public class Main
{
    public static void main(String[] args){
        int [] arr = {1, 23, 3, 0 , -7, 2};
        SortArray new_data = new SortArray(arr);
        new_data.sort();
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        String substr = "We can also name strings and do calculations ";
        String [] new_arr = substr.split(" ");
        System.out.println(ft_grep.ft_grep_my_name(new_arr, "calculations"));
        Person Display = new Person("Mohammed", 23); // creating an object of person
                                                                // called Display
        Display.SeyHello();
        String str = "hello";
        char[] chars = str.toCharArray();
        Solution reverse = new Solution();
        reverse.reverseString(chars);
        System.out.println(chars);
        Fo.Ft_display("hello");
        Supercar supercar = new Supercar(300, "RED BULL RACING F1 MAX ",18 );
        supercar.ft_display_info();
        Display_content data_display = new Display_content();
        Character [] str_chars = {'2', 'd', 'f', '4', 'a'};
        Integer [] int_arr = {1,2,3,4,5,6,7,8,9};
//        data_display.ft_display_arr(int_arr);
        System.out.println(Display_content.ft_return_arr(str_chars));
        Class_first_item_int<Character> Data_gen = new Class_first_item_int<>('s');
        System.out.println(Data_gen.ft_access_int());
        SortDifferentData sorted = new SortDifferentData();
        System.out.println(sorted.sortDifferentData(str_chars));
    }

}
