import org.junit.Test;

public class StringVsStringBuffer {

	@Test
	public void testWithStringBuffer() {
		StringBuffer s3 = new StringBuffer("Value1");
		String s2 = "Value2";
		for (int i = 0; i < 100000; ++i) {
			s3.append(s2);
		}
		System.out.println(s3);
	}

//	@Test
//	public void testWithString() {
//		String s3 = "Value1";
//		String s2 = "Value2";
//		for (int i = 0; i < 100000; ++i) {
//			s3 = s3 + s2;
//		}
//		System.out.println(s3);
//	}
	@Test
	public void testWithString() {
		int[] array = {2, 1, 5, 4, 3,2, 1, 5, 4, 3,2, 1, 5, 4, 3,2, 1, 5, 4, 3};
		int[] result = new int[]{array[0], array[0]};
		for(int i=0; i<array.length;i++){
			result[0] = Math.max(result[0], array[i]);
			result[1] = Math.min(result[1], array[i]);
		}
		System.out.println(result[0]);
		System.out.println(result[1]);

	}


}
