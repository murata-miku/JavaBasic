package practice14.common;

public class main {
		public static void main(String [] args) {
			Javacourse jc = new Javacourse();
			System.out.println(jc.getCourseName());
			
			for(int i = 0; i < 7; i++) {
				System.out.println(jc.getCourseUnit()[i]);
			}
			
		}
}
