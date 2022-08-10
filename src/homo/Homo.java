/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homo;
public class Homo {
    public static void main(String[] args) {
        // TODO code application logic here
        String plain="12,Akilan,Hb Colony, Chathirareddiyapatti";
        String plainr="12,102,101,102";
        
        String enc1="";
        String enc2="";     
        //long startTime = System.currentTimeMillis();
        String enc=encrypt(plain);
        
        System.out.println(enc);
        //String dec=encrypt(enc);
        //System.out.println(dec);
        
        
        String did1=plainr.substring(3,6);
        System.out.println(did1);
        if(did1.equals("101"))
        {
        //long startTime1 = System.currentTimeMillis();
        enc1=encrypt1(plainr);
        
        System.out.println(enc1);
        //String dec1=encrypt1(enc1);
        //System.out.println(dec1);
        }
        else if(did1.equals("102"))
        {
            enc1=encrypt2(plainr);
            System.out.println(enc1);
        }
        
        //long stopTime = System.currentTimeMillis();
        //long elapsed=stopTime-startTime;
        //System.out.println(elapsed);
        long startTime = System.currentTimeMillis();
        
        merged(enc,enc1);
        long stopTime = System.currentTimeMillis();
        
        
        long elapsed=startTime-stopTime;
        System.out.println(Integer.toString((int) elapsed) + " ms \n");
    }
        
    static void merged(String enc,String enc1)
    {
        int len=enc.length();
        //System.out.println(len);
        int len1=enc1.length();
        //System.out.println(len1);
        String merg=enc.concat(enc1);
        
        String noisemerg=merg.concat("1234");
        
        splitting(len,len1,noisemerg);
    }
    
    static void splitting(int l,int l1,String noisemerg)
    {
        
        String encsplit1=noisemerg.substring(0,l);
        //System.out.println(encsplit1);
        String encsplit2=noisemerg.substring(l,l1+l);
        //System.out.println(encsplit2);
        
        
        String dec=encrypt(encsplit1);
        
        //String dec1=encrypt1(encsplit2);
        
        String dec2=encrypt2(encsplit2);
        
        System.out.println(dec);
        //System.out.println(dec1);
        System.out.println(dec2);
    }
  
    static String encrypt(String plain)
    {
        
        String enc="";
        
        char xorKey = 'P';
 
        // Define String to store encrypted/decrypted String
        
        // calculate length of input string
        int len = plain.length();
 
        // perform XOR operation of key
        // with every character in string
        for (int i = 0; i < len; i++)
        {
            enc = enc + Character.toString((char) (plain.charAt(i) ^ xorKey));
        }
        
        
        return enc;
    }
    
    static String encrypt1(String plainr)
    {
        
        String enc="";
        
        char xorKey = 'R';
 
        // Define String to store encrypted/decrypted String
        
        // calculate length of input string
        int len = plainr.length();
 
        // perform XOR operation of key
        // with every character in string
        for (int i = 0; i < len; i++)
        {
            enc = enc + Character.toString((char) (plainr.charAt(i) ^ xorKey));
        }
        
        
        return enc;
    }
    
    
    static String encrypt2(String plainr)
    {
        
        String enc="";
        
        char xorKey = 'Q';
 
        // Define String to store encrypted/decrypted String
        
        // calculate length of input string
        int len = plainr.length();
 
        // perform XOR operation of key
        // with every character in string
        for (int i = 0; i < len; i++)
        {
            enc = enc + Character.toString((char) (plainr.charAt(i) ^ xorKey));
        }
        
        
        return enc;
    }
    
}
