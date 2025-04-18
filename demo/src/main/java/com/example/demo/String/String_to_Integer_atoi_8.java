package com.example.demo.String;

public class String_to_Integer_atoi_8 {

	public static void main(String[] args) {
		SignedInt int1 = new SignedInt();
		System.out.println(int1.myAtoi("42"));
	}
}
class SignedInt {
    public String myAtoi(String s) {
        StringBuilder str = new StringBuilder();
        int povNeg=0;
        int word=0;
        int numb=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z' && i==0){
                return "0";
            }
            if((s.charAt(i)=='+' || s.charAt(i)=='-') && word==0 && povNeg==0 && numb==0){
                str.append(s.charAt(i));
                povNeg++;
            }
            if(s.charAt(i)>='0' && s.charAt(i)<='9' && word==0 && povNeg<=1){
                str.append(s.charAt(i));
                numb++;
            }
           
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                word++;
            }
            if((s.charAt(i)=='+' || s.charAt(i)=='-') && numb>0 && povNeg<=1) {
            	return str.toString();
            }
            if(word>0) {
            	return str.toString();
            }
        }
        return str.toString();
       }
}