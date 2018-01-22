package com.test.base64;

import org.apache.commons.codec.binary.Base64;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
/**
 * Base64的实现原理
 * 算法实现
 *    JDK
 *    Commons Codec（CC）
 *    Bouncy Castle （BC）
 */
public class Base64Test{

    private static String src="I am programmer !";

    /**
     * Base64实现方式1
     * @throws Exception
     */
    public static void jdkbase64() throws Exception{
        BASE64Encoder encoder=new BASE64Encoder();
        String encode = encoder.encode(src.getBytes());
        System.out.println("encode:"+encode);

        BASE64Decoder decoder=new BASE64Decoder();
        byte[] bytes = decoder.decodeBuffer(encode);
        String s = new String(bytes);
        System.out.println(s);
    }

    /**
     * Base64实现方式2
     */
    public static void commonsCodec(){
        byte[] bytes = Base64.encodeBase64(src.getBytes());
        System.out.println(new String(bytes));

        byte[] bytes1 = Base64.decodeBase64(bytes);
        System.out.println(new String(bytes1));

    }

    /**
     * Base64实现方式3
     */
    public static void bouncyCastleBase64(){
        byte[] encode = org.bouncycastle.util.encoders.Base64.encode(src.getBytes());
        System.out.println(new String(encode));
        byte[] decode = org.bouncycastle.util.encoders.Base64.decode(encode);
        System.out.println(new String(decode));
    }

    public static void main(String[] args) throws Exception {
        jdkbase64();
        commonsCodec();
        bouncyCastleBase64();
    }

}
