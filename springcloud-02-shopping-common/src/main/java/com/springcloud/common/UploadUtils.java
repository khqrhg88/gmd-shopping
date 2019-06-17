package com.springcloud.common;

import java.util.Date;

/**
 * 文件上传的工具类
 * 
 * @author hong
 *
 */
public class UploadUtils {

	/**
	 * 获得新的文件名称（毫秒数+4位随机数）
	 * 
	 * @return返回新的文件名称
	 */
	public static String getFileName() {
		String fileName = null;

		// 获得1-1000之间的随机数
		int num = (int) (Math.random() * 1000 + 1);

		// 将随机数设置为4位
		String tempNum = "000" + num;
		tempNum = tempNum.substring(tempNum.length() - 4);

		Date date = new Date();
		fileName = date.getTime() + tempNum;

		return fileName;
	}

	/**
	 * 返回文件的扩展名
	 * 
	 * @param fileName
	 * @return成功返回文件扩展名，否则返回null
	 */
	public static String getExtendedName(String fileName) {
		if (fileName == null || fileName.length() == 0) {
			return null;
		}
		int index = fileName.lastIndexOf(".");
		if (index == -1) {
			return null;
		}
		return fileName.substring(index);
	}

	/*
	 * public static void main(String[] args) {
	 * System.out.println(getExtendedName("201607090349.jpg")); }
	 */

	/*
	 * public static void main(String[] args) { for(int i = 0 ; i < 10 ; i++) {
	 * System.out.println(getFileName()); } }
	 */

}
