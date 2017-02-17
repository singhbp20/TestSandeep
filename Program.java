package com.Sandeep_Udemy;

/**
 * Created by knvss on 2/16/2017.
 */
public class Program {

    public static int strLen(String str){
        int len;
        len = str.length();
        return len;
    }

    public static void main(String[] args){
        String txt = "Sandeep";
        System.out.println(txt);
        System.out.println("The length of '"+ txt +"' is : "+ strLen(txt));
    }
	
	/*
	public static int strlen(String msg) {
		System.out.println(msg.length());
		return msg.length();
	}
*/
	public static print(String msg) {
		System.out.println(msg);
	}
	
}


