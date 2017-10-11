import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;

public class StringEx10 {

	public static void main(String[] args) {

		String[] types = {"UTF-8", "EUC-KR", "ISO-8859-1"};
		System.out.print(Charset.defaultCharset());
		String testValue = " : ÇÑ±Û";
		System.out.println(testValue);
		System.out.println("=================");
		
		String encode_result = null;
		
		for(String type : types) {
			try {
				encode_result = URLEncoder.encode(testValue, type);
				System.out.println(type + " : " + encode_result);
				
				for(String type2: types) {
					System.out.println(type2 + " : " + URLDecoder.decode(encode_result, type2));
				}
				System.out.println("=================");
			}catch(UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
