package com.example.demo.String;

import java.util.HashMap;
import java.util.Map;

public class EncodeTinyURL {
	
	public static void main(String[] args) {
		sol sol =  new sol();
		String out=sol.encode("https://chatgpt.com/c/6762f987-78a0-8010-9ffd-d101b786a47a");
		System.out.println(out);
		System.out.println(sol.decode(out));
	}
}
class sol{
    Map<String, String> codeDB = new HashMap<>(), urlDB = new HashMap<>();
    static final String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    private String getCode() {
        char[] code = new char[6];
        for (int i = 0; i < 6; i++) 
            code[i] = chars.charAt((int)(Math.random() * 62));
        return "http://tinyurl.com/" + String.valueOf(code);
    }
    
    public String encode(String longUrl) {
        if (urlDB.containsKey(longUrl)) return urlDB.get(longUrl);
        String code = getCode();
        while (codeDB.containsKey(code)) code = getCode();
        codeDB.put(code, longUrl);
        urlDB.put(longUrl, code);
        return code;
    }

    public String decode(String shortUrl) {
        return codeDB.get(shortUrl);
    }
}
