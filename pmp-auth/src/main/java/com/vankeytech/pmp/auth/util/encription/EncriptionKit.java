package com.vankeytech.pmp.auth.util.encription;

import java.security.MessageDigest;

import org.apache.shiro.authc.credential.PasswordService;

/**
 * 加密工具
 * 
 * @author chenqiu
 * 
 */
public class EncriptionKit {

	private static   PasswordService passwordServices;

	@SuppressWarnings("static-access")
	public void setPasswordService(PasswordService passwordService) {

		passwordServices = passwordService;
	}

	public static final String encryptPassword(String pwd) {

		return passwordServices.encryptPassword(pwd);
	}

	/**
	 * md5加密
	 * 
	 * @param srcStr
	 *            input string
	 * @return output encription string
	 */
	public static final String encrypt(String srcStr) {
		try {
			String result = "";
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] bytes = md.digest(srcStr.getBytes("utf-8"));
			for (byte b : bytes) {
				String hex = Integer.toHexString(b & 0xFF).toUpperCase();
				result += ((hex.length() == 1) ? "0" : "") + hex;
			}
			return result;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 字符串转换为16进制
	 * 
	 * @param s
	 *            hex string
	 * @return end string
	 */
	public static String toHexString(String s) {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			int ch = (int) s.charAt(i);
			str += Integer.toHexString(ch);
		}
		return str;
	}

	/**
	 * Text加密
	 * 
	 * @param text
	 *            text
	 * @param salt
	 *            salt
	 * @return string
	 */
	public static String textEncrypt(String text, String salt) {
		try {
			EncryptionTextKit textEncryptor = new EncryptionTextKit(salt);
			String result = textEncryptor.encrypt(text);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Text解密
	 * 
	 * @param text
	 *            encription string
	 * @param salt
	 *            salt
	 * @return string
	 */
	public static String textDecrypt(String text, String salt) {
		try {
			EncryptionTextKit textEncryptor = new EncryptionTextKit(salt);
			String result = textEncryptor.decrypt(text);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
