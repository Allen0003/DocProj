package util;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Const {

	public static final String title = "Allen Doc";

	public static String SSOSystemName;

	public static String SSO;

	public static String ENVIRONMENT;

	public static String dB_ID;

	public static String dB_PassWD;

	public static String dB_PassWD_IV = "";

	public static String dB_ServerIP;

	public static String dB_ServerPort;

	public static String dB_DatabaseName;

	public static String systemID;

	public static Logger logUtil;

	public static final String Manager = "M";

	public static final String User = "U";

	public static final long serialVersionUID = 1L;

	public static final int MEMORY_THRESHOLD = 1024 * 1024 * 3;

	public static final int MAX_FILE_SIZE = 1024 * 1024 * 40;

	public static final int MAX_REQUEST_SIZE = 1024 * 1024 * 50;

	public static ArrayList<DocType> DocType;

	private static long docCtlID = System.currentTimeMillis();

	private static long docDtlID = System.currentTimeMillis();

	public static final int DocID_Type_Ctl = 1;

	public static final int DocID_Type_Dtl = 2;

	public static final int DocID_For_all = 0;

	public static final int DocID_For_In_Hiszone = 1;

	public static final int DocID_For_Not_In_Hiszone = 2;

	public static synchronized String getKey(int type) {

		if (type == DocID_Type_Ctl) {
			docCtlID += 1;
			return Long.toString(docCtlID);
		} else {
			docDtlID += 1;
			return Long.toString(docDtlID);
		}
	}

}
