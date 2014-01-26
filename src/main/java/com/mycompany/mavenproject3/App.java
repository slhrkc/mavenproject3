package com.mycompany.mavenproject3;

import org.apache.shiro.authc.credential.DefaultPasswordService;
import org.apache.shiro.authc.credential.PasswordService;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        PasswordService psd = new DefaultPasswordService();
        String password = "333";
        String enc = psd.encryptPassword(password);
        System.out.println(enc);
        System.out.println(password);
        System.out.print(psd.passwordsMatch(password, enc));
        
    }
}
