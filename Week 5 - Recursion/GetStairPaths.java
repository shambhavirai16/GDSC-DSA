import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);
    }

    public static ArrayList<String> getStairPaths(int n) {
        
        if(n == 0){
            ArrayList<String> bans = new ArrayList<>();
            bans.add("");
            return bans;
        }
        
        if(n < 0){
            ArrayList<String> bans = new ArrayList<>();
            return bans;
        }
        
        ArrayList<String> myans = new ArrayList<>();
        
        ArrayList<String> rans1 = getStairPaths(n-1);
        
        ArrayList<String> rans2 = getStairPaths(n-2);
        
        ArrayList<String> rans3 = getStairPaths(n-3);
        
        for(String s:rans1){
            myans.add(1 + s);
        }
        
        for(String s:rans2){
            myans.add(2 + s);
        }
        
        for(String s: rans3){
            myans.add(3 + s);
        }
        
        return myans;
    }

}