package practice14.common;

public class DBCourse  implements Course{

	private	String[] courseunit = new String [4];
	
	
	public String getCourseName() {
		return "【Eラーニング】DB基礎";
	}

	
	
	public String[] getCourseUnit() {
		
		
		courseunit[0] = "DB基礎";
		courseunit[1] = "SQL基礎";
		courseunit[2] = "正規化";
		courseunit[3] = "SQL応用";
		
	
		return courseunit;
	}
	

}
