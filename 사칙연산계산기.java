
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = "4+2-4/2*3";
        StringTokenizer st = new StringTokenizer(s, "+-/*", true);
        ArrayList<String> arr = new ArrayList<>();

        while(st.hasMoreTokens()) {
            arr.add(st.nextToken());
        }
        calc1(arr);
        System.out.println(arr.toString()); //[4, +, 2, -, 6]
        System.out.println(calc2(arr)); //0



    }
    static ArrayList<String> calc1 (ArrayList<String> arr) {

        for(int i = 0 ; i < arr.size() ; i++) {
            String op = arr.get(i);

            if(op.equals("*")) {
                int num1 = Integer.parseInt(arr.get(i-1));
                int num2 = Integer.parseInt(arr.get(i+1));
                int num3 = num1*num2;

                arr.remove(i-1);
                arr.remove(i-1);
                arr.remove(i-1);
                arr.add(i-1, String.valueOf(num3));
                i--;
            }
            else if(op.equals("/")) {
                int num1 = Integer.parseInt(arr.get(i-1));
                int num2 = Integer.parseInt(arr.get(i+1));
                int num3 = num1/num2;

                arr.remove(i-1);
                arr.remove(i-1);
                arr.remove(i-1);
                arr.add(i-1, String.valueOf(num3));
                i--;
            }
        }

        return arr;
    }




    static int calc2 (ArrayList<String> arr) {

        for(int i = 0 ; i < arr.size() ; i++) {
            String op = arr.get(i);

            if(op.equals("+")) {
                int num1 = Integer.parseInt(arr.get(i-1));
                int num2 = Integer.parseInt(arr.get(i+1));
                int num3 = num1+num2;

                arr.remove(i-1);
                arr.remove(i-1);
                arr.remove(i-1);
                arr.add(i-1, String.valueOf(num3));
                i--;
            }
            else if(op.equals("-")) {
                int num1 = Integer.parseInt(arr.get(i-1));
                int num2 = Integer.parseInt(arr.get(i+1));
                int num3 = num1-num2;

                arr.remove(i-1);
                arr.remove(i-1);
                arr.remove(i-1);
                arr.add(i-1, String.valueOf(num3));
                i--;
            }
        }

        return Integer.parseInt(arr.get(0));
    }


}
