package Strings;

import java.util.Scanner;

public class StringBufferAndBuilder {
    public static void main(String[] args) {
        StringBuffer SBuffer = new StringBuffer("Hello ");
        SBuffer.append("Krishna");
        System.out.println(SBuffer);

        SBuffer.insert(4, " my ");
        System.out.println(SBuffer);
        //SBuffer.reverse();
        System.out.println(SBuffer.replace(4,5,"Nanika"));
        System.out.println(SBuffer.deleteCharAt(13));
//--------------------------------------------------------------------------------
        Scanner sc=new Scanner(System.in);
        String S1=sc.nextLine();
        String Str="";
        for(int i=S1.length()-1;i>=0;i--){
            Str= Str+S1.charAt(i);
        }
        System.out.println(Str);
//input:I Love You Krish
        //Ouput: I evoL uoY hsirK
        String S2=sc.nextLine();
        String[] SplitWords=S2.split("");
        String TempStr="";
        for(int i=S1.length()-1;i>=0;i--){
            Str= Str+S1.charAt(i);
        }
        System.out.println(Str);
    }
    }
