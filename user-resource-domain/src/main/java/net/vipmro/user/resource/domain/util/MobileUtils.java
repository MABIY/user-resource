package net.vipmro.user.resource.domain.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileUtils {
	private static Pattern p = Pattern.compile("^(1[3,4,5,6,7,8,9])\\d{9}$");
	
	public static boolean isMobileNO(String mobiles) {
		Matcher m = p.matcher(mobiles);
		return m.matches();
	}
	
}
