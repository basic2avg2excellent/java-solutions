package learning.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class DataBaseUrlBreakUp {

    public static final String SOURCE_USER_NAME = "SOURCE_USER_NAME";
	public static final String HOST_NAME = "HOST_NAME";
	public static final String PORT_NUMBER = "PORT_NUMBER";
	public static final String SOURCE_NAME = "SOURCE_NAME";
	public static final String ORACLE_DB_TYPE = "oracle";
	public static final String CDR_DB_TYPE = "cdr";

    public static void main(String[] args) {
        System.out.println(getSourceURLDetails("https://ca2uhdtcm001pd.quintiles.net:8888/hue/editor?editor=42431", "cdr"));
    }

    public static Map<String, String> getSourceURLDetails(String sourceURL, String sourceType) throws RuntimeException{
        char[] sourceURLarray = sourceURL.toCharArray();
		int index = 0;
		Map<String, String> resultMap = new LinkedHashMap<>(4);
		StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sourceURLarray.length; i++) {
            if(sourceURLarray[i] == ':' && sourceURLarray[i+1] == '/' && sourceURLarray[i+2] == '/'){
                index = i+3;
                break;
            }
        }
        for (int i = index; i < sourceURLarray.length; i++) {
            if(sourceURLarray[i] == ':'){
                index = i+1;
                break;
            }
            sb.append(sourceURLarray[i]);
        }
        
        resultMap.put(HOST_NAME, sb.toString());
        sb = new StringBuilder();

        for (int i = index; i < sourceURLarray.length; i++) {
            if(sourceURLarray[i] == '/'){
                index = i+1;
                break;
            }
            sb.append(sourceURLarray[i]);
        }

        resultMap.put(PORT_NUMBER, sb.toString());
        sb = new StringBuilder();

        for (int i = index; i < sourceURLarray.length; i++) {
            if(sourceURLarray[i] == '/'){
                break;
            }
            sb.append(sourceURLarray[i]);
        }
        resultMap.put(SOURCE_NAME, sb.toString());
        return resultMap;
    }
}

// DataBase URL : 
/* https://ca2uhdtcm001pd.quintiles.net:8888/hue/editor?editor=42431 */