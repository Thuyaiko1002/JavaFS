package com.vn.entities;

public class CusIdAuto {
	public static void main(String[] args) {
		String beforeId = null;
		String prefix = "C";
		int uperUnit = 1;
		int length = 7;
		String charCode = "0";
		String newId1 = generateProductID(beforeId, prefix, uperUnit, length, charCode);
		String newId2 = generateProductID(newId1, prefix, uperUnit, length, charCode);
		System.out.println(newId1);
		System.out.println(newId2);
	}

	private static String generateProductID(String beforeId, String prefix, int uperUnit, int length, String charCode) {
		// Tao chuoi co the thay doi
		StringBuilder result = new StringBuilder(prefix);
		int base = 1;
		if (beforeId != null) {
			base = base + uperUnit;
		}
		int totalCharSpace = length - String.valueOf(base).length() - prefix.length();
		for (int i = 0; i < totalCharSpace; i++) {
			result.append(charCode);
		}
		result.append(base);
		return result.toString();
	}
}