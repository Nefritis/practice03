package prob04;

public class StringUtil {
    public static String concatenate(String[] str) {
    	int length = str.length;
    	String line = new String();
    	for(int i=0;i<length;i++){
    		line = line + str[i];
    	}   	
    	return line;
    }
}
