package me.kimtaekyung;

public class Calc {

    static int run(String str){

        String[] strSplit = str.trim().split(" ");

        int result=getInt(strSplit[0]);

        for(int i=1;i<strSplit.length;i+=2){
            int o=getInt(strSplit[i+1]);
            switch (strSplit[i]){
                case "+":
                    result+=o;
                    break;
                case "-":
                    result-=o;
                    break;
                case "*":
                    result*=o;
                    break;
            }
        }

        return result;
    }

    static int getInt(String str){
        return Integer.parseInt(str.trim());
    }

}
