import java.util.*;
import java.io.*;
import java.util.HashMap;

public class fib{
	static public void main(String[] args){
		HashMap<String, String> memo = new HashMap<>();
		System.out.println(fibo(6, memo));
		System.out.println(fibo(7, memo));
		System.out.println(fibo(8, memo));
		System.out.println(fibo(47,memo));
	}
	static String fibo(int n, HashMap<String, String> memo){
	///static int fibo(int n){
		if(memo.containsKey(Integer.toString(n))) return memo.get(Integer.toString(n));
		if(n<=2) return "1";
		int sum=Integer.parseInt(fibo(n-1, memo))+Integer.parseInt(fibo(n-2, memo));
		memo.put(Integer.toString(n), Integer.toString(sum));
		return memo.get(Integer.toString(n));
	}

}
