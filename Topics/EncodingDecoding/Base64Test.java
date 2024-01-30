package EncodingDecoding;

import java.util.Base64;

public class Base64Test {
    public static void main(String[] args) {
        Base64.Encoder encoder = Base64.getEncoder();

        // Encoding & Decoding bytes
        byte byteArr[] = {1,2};
        byte byteArr2[] = encoder.encode(byteArr);
        System.out.println("Encoded byte array:"+byteArr2);
        byte byteArr3[] = new byte[5];
        int x = encoder.encode(byteArr,byteArr3);
        System.out.println("Encoded byte array written to another: "+byteArr3);
        System.out.println("No of bytes written:"+x);

        System.out.println();
        // Encoding & Decoding String
        String str = encoder.encodeToString("MRJ".getBytes());
        System.out.println("Encoded String: "+str);
        Base64.Decoder decoder = Base64.getDecoder();
        String dstr = new String(decoder.decode(str));
        System.out.println("Decoded string: "+dstr);

        System.out.println();
        //Encoding & Decoding URL
        encoder = Base64.getUrlEncoder();
        String estr = encoder.encodeToString("http://www.mrj.com".getBytes());
        System.out.println("Encoded URL: "+estr);
        decoder = Base64.getUrlDecoder();
        String destr = new String(decoder.decode(estr));
        System.out.println("Decoded URL: "+destr);

    }
}
