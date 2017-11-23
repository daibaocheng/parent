package com.vankeytech.pmp.auth.util;

public class Hex2StringKit {
	
	/**
	 * @param b
	 *            source byte array
	 * @param offset
	 *            starting offset
	 * @param len
	 *            number of bytes in destination (processes len*2)
	 * @return byte[len]
	 */
	public static byte[] hex2byte(byte[] b, int offset, int len) {
		byte[] d = new byte[len];
		for (int i = 0; i < len * 2; i++) {
			int shift = i % 2 == 1 ? 0 : 4;
			d[i >> 1] |= Character.digit((char) b[offset + i], 16) << shift;
		}
		return d;
	}

	/**
	 * @param s
	 *            source string (with Hex representation)
	 * @return byte array
	 */
	public static byte[] hex2byte(String s) {
		if (s.length() % 2 == 0) {
			return hex2byte(s.getBytes(), 0, s.length() >> 1);
		} else {
			// Padding left zero to make it even size #Bug raised by tommy
			return hex2byte("0" + s);
		}
	}

	/**
	 * converts a byte array to hex string (suitable for dumps and ASCII
	 * packaging of Binary fields
	 * 
	 * @param b
	 *            - byte array
	 * @return String representation
	 */
	public static String hexString(byte[] b) {
		StringBuilder d = new StringBuilder(b.length * 2);
		for (byte aB : b) {
			d.append(hexStrings[(int) aB & 0xFF]);
		}
		return d.toString();
	}

	public static String hexStringTest(byte[] b) {
		StringBuilder d = new StringBuilder(b.length * 2);
		for (byte aB : b) {
			d.append(hexStrings[(int) aB & 0xFF]).append(" ");
		}
		return d.toString();
	}

	/**
	 * converts a byte array to hex string (suitable for dumps and ASCII
	 * packaging of Binary fields
	 * 
	 * @param b
	 *            - byte array
	 * @param offset
	 *            - starting position
	 * @param len
	 *            the length
	 * @return String representation
	 */
	public static String hexString(byte[] b, int offset, int len) {
		StringBuilder d = new StringBuilder(len * 2);
		len += offset;
		for (int i = offset; i < len; i++) {
			d.append(hexStrings[(int) b[i] & 0xFF]);
		}
		return d.toString();
	}

	public static final String[] hexStrings;
	static {
		hexStrings = new String[256];
		for (int i = 0; i < 256; i++) {
			StringBuilder d = new StringBuilder(2);
			char ch = Character.forDigit(((byte) i >> 4) & 0x0F, 16);
			d.append(Character.toUpperCase(ch));
			ch = Character.forDigit((byte) i & 0x0F, 16);
			d.append(Character.toUpperCase(ch));
			hexStrings[i] = d.toString();
		}

	}
}