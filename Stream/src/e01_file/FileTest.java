package e01_file;

import java.io.File;
import java.io.IOException;

public class FileTest {
	/*
	 * 	파일 클래스 - File
	 * 		자바로 파일을 생성, 삭제, 경로 생성(폴더),
	 * 		파일 이름 변경, 해당 경로 파일 목록 조회. 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		//파일클래스 생성자에는 파일 전체 경로
		//해당 폴더 경로를 문자열로 초기화
		File file = new File("c:\\test"+File.separator+"hello.txt");
		System.out.println(file);
		//현재 파일의 절대 경로(실제 파일 위치 전체 경로)를 뽑음
		System.out.println(file.getAbsolutePath());
		//현재 파일의 저장된 폴더까지의 경로를 뽑음 - 문자열
		System.out.println(file.getParent());
		//현재 파일의 저장된 폴더까지의 경로를 뽑음 - File 객체
		System.out.println(file.getParentFile());
		//해당 파일의 모든 경로 생성
		file.getParentFile().mkdirs();		
		//파일 생성 - 단 주의할 점, 해당 경로가 먼저 생성되어야함.
		file.createNewFile();		
		//파일 클래스에 저장된 경로가 파일인지? 확인하는 메서드
		System.out.println(file.isFile()); //파일인지?
		//폴더인지?
		System.out.println(file.getParentFile().isDirectory());
		System.out.println(file.getParentFile().isFile());
		//파일 크기를 바이트 단위로 리턴하는 메서드
		System.out.println(file.length());
		//현재 파일이 위치한 파티션의 총 용량 크기
		System.out.println(file.getTotalSpace());
		//현재 파일이 위치한 파티션의 사용가능한 용량 크기
		System.out.println(file.getUsableSpace());
		//현재 파일이나, 경로가 실제로 존재하는지 체크하는 메서드
		System.out.println(file.exists());
		//파일명
		System.out.println(file.getName());
		//현재 파일의 부모 폴더의 경로를 파일 객체로 뽑음
		File parentPath = file.getParentFile();
		//해당 폴더에 있는 파일 및 폴더들을 조회
//		String[] arr = parentPath.list();
		parentPath = new File("c:\\");
		String[] arr = parentPath.list();
		for(String str : arr)
			System.out.println(str);
		
	}

}



