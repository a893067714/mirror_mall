package com.iwonder.tea.framework.util;

import java.util.UUID;

public class UUIDUtils {
	/**
	 * 随机生成id
	 * 
	 * @return
	 */
	public static String getId() {
		return UUID.randomUUID().toString().replace("-", "").toUpperCase();
	}

	public static String getUUID8() {
		return getId().substring(0,8);
	}
	public static String getUUID16() {
		return getId().substring(0,16);
	}

	/**
	 * 生成随机码
	 * 
	 * @return
	 */
	public static String getCode() {
		return getId();
	}

	public static void main(String[] args) {
		System.out.println(getId());
		System.out.println(getUUID8());
		System.out.println(getUUID16());
		// String string = UUID.randomUUID().toString();
		// System.out.println(string);
	}
}
