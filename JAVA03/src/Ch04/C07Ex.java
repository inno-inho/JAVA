package Ch04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class C07Ex {

	// 속성
	static Map<String, Object> map = new HashMap();			// Object를 써놓은건 어떤 타입이든 다 받아내겠다는 의지
	
	// set
	static void setMap(Map < String, Object > param){
		for(String key : param.keySet()) {
			Object value = param.get(key);
			System.out.println("Key: " + key + ", value: " + value.toString());
			
			map.put(key, value);		
		}
	}

	// get
	
	static Map<String,Object>getMap(){
	return map;
	}
	
	public static void main(String[] args) {
		// 01 파라미터 생성
		Map<String, Object> params = new HashMap();
		
		// 02 파라미터에 데이터 저장
		String [] values = {"웹디자인기능사", "정보처리기사", "네트워크관리사", "SQLD"};
		params.put("자격증", values);
		setMap(params);
		
		// 03 파라미터에 데이터 저장 ArrayList
		List<String> values2 = new ArrayList();
		values2.add("등산");
		values2.add("독서");
		values2.add("게임");
		
		params.put("취미", values2);
		setMap(params);

		// 저장데이터 확인
		
		Map<String, Object> mapDatas = getMap();
		
		for(String Key: mapDatas.keySet()) {
			Object value = mapDatas.get(Key);
			
			if(value instanceof String[]) {
				String [] arr = (String[])value;
				for(String e : arr) {
					System.out.println("K: " + Key + "Value: " + value);
				}
				
				
			}else if(value instanceof List){
				System.out.println("K: " + Key + "Value: " + value);
			}
			
			
		}
		
	
	}
	

}
