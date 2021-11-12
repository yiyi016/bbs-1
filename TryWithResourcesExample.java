package p05.trywithresouces;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		
		//old
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("file.txt"); //파일을 보겟다,,?
			fis.read(); // 파일 읽겟다 
			throw new Exception("강제적 예외 처리 "); //throw new Exception : 예외를 강제적을 처리할때
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				fis.close(); // 새로운 방법에선 필요없음 자동으로 닫아주기 때문에 
			} catch (Exception e) {
			}
			
		}
		
		//new (try~ with~resources)
	
		try(FileInputStream fis2 = new FileInputStream("file.txt")) { // 
			
			fis2.read(); // 파일 읽겟다 
			throw new Exception("강제적 예외 처리 "); //throw new Exception : 예외를 강제적을 처리할때
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			// close() 안써도 됨 자동으로 닫아주는 인터페이스를 썼기 때뭉에 ?
			

	}

}
}
