import java.util.HashMap;
import java.util.*;
import java.io.*;

public class grid{
	static public void main(String[] args){
		HashMap<String, String> memo = new HashMap<>();
		System.out.println(gridtraveler(1, 1, memo));
		System.out.println(gridtraveler(3, 2, memo));
		System.out.println(gridtraveler(2, 3, memo));
		System.out.println(gridtraveler(3, 3, memo));
		System.out.println(gridtraveler(18, 18, memo));
	}

	static String gridtraveler(long m, long n, HashMap<String, String> memo){
		//String key = Integer.toString(m)+","+Integer.toString(n);
		String key = Long.toString(m)+","+Long.toString(n);
		if(memo.containsKey(key)) return memo.get(key);
		if(m==1&&n==1) return "1";
		if(m==0||n==0) return "0";
		//memo.put(key, Integer.toString(Integer.parseInt(gridtraveler(m-1, n, memo)) + Integer.parseInt(gridtraveler(m, n-1, memo))));
		memo.put(key, Long.toString(Long.parseLong(gridtraveler(m-1, n, memo)) + Long.parseLong(gridtraveler(m, n-1, memo))));
		return memo.get(key);
	}

}
