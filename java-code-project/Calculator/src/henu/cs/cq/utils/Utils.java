package henu.cs.cq.utils;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Utils {
	/**
	 * �ж��ַ����Ƿ���ȵķ���
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean judgeStr(String str1, String str2) {
		return str1.equals(str2);
	}
	
	/**
	 * �ж��Ƿ����ַ��ķ���
	 * @param str
	 * @return
	 */
	public static boolean isNum(String str) {
		return Character.isDigit(str.charAt(0));
	}
	
	
	/**
	 * ���ü��㷽��
	 * @param str
	 * @return
	 * @throws ScriptException
	 */
	public static Object calMethod(String str) throws ScriptException {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		Object result = engine.eval(str);
		return result;
	}
}
