import java.util.*;
import java.io.*;

public class Main3 {
    static char[][] map;
    static int answer = 0;
    static int n;
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s  = {"AAA", "ABCD", "AAAAA", "AAAA", "AAA"};
        map = new char[5][5];
        
        for(int i =  0 ; i < 5 ; i++) {
            map[i] = s[i].toCharArray();
        }

        System.out.println(check(0, 0, 3)); //2

        n = s[0].length();
        bt(2);
        System.out.println(answer); //41


    }

    static void bt(int s) {
        if(s == n+1) return;

        if(s == n) answer += check(0, 0, n) * check(0, 0, n);
        else if(s < n){
            int j = 0;
            //0행부터 가장 긴 행전까지
            for(int r = 0 ; r <= n-s-1 ; r++) {
                for(int c = 0 ; c <= n-s+j ; c++) {
                    answer += check(r, c, s) * check(r, c, s);
                }
                j++;
            }

            //가장 긴 행
            for(int c = 0 ; c <= 2*(n-s+1)-2 ; c++) {
                answer += check(n-s, c, s) * check(n-s, c, s);
            }

            //가장긴행 다음부터 마지막까지
            j = 0;
            for(int r = n-s+1 ; r <= 2*(n-s+1)-2 ; r++) {
                for(int c = 0 ; c <= 2*(n-s+1)-3-j ; c++) {
                    answer += check(r, c ,s) * check(r, c, s);
                }
                j++;
            }

            bt(s+1);

        }
    }


    static int check(int r, int c, int s) { //시작점과 첫번째 줄의 길이
        boolean[] a = new boolean[26];
        //육각형의 첫번째 줄
        for(int i = c ; i <= c+s-1 ; i++) {
            a[map[r][i] - 'A'] = true;
        }

        //2헹부터 가장긴것 전까지
        int j = 0;
        for(int i = r+1 ; i <= r+s-2 ; i++) {
            a[map[i][c] - 'A'] = true;
            a[map[i][c+s+j] - 'A'] = true;
            j++;
        }

        //육각형의 가운데 가장 긴 행
        a[map[r+s-1][c]-'A'] = true;
        a[map[r+s-1][c+2*s-2] - 'A'] = true;

        //가징 긴행 다음부터 마지막 행 전까지
        j = 0;
        for(int i = r+s ; i <= r+2*s-3 ; i++) {
            a[map[i][c] - 'A'] = true;
            a[map[i][c+2*s-3-j] - 'A'] = true;
            j++;
        }

        //가장 아래 행
        for(int i = c ; i <= c+s-1 ; i++) {
            a[map[r+2*s-2][i] - 'A'] = true;
        }


        //true숫자세서 리턴
        j = 0;
        for(int i = 0 ; i < 26 ; i++) {
            if(a[i]) j++;
        }

        return j;
    }
}
