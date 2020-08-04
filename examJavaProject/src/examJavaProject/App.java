package examJavaProject;

import java.util.Scanner;

import examJavaProject.DTO.RegisterRequest;
import examJavaProject.service.MemberListPrinter;
import examJavaProject.service.MemberRegisterService;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("명령어를 입력해주세요 : ");
			String command = sc.nextLine();
			if(command.startsWith("new")) {
				System.out.println("회원 등록");
				// 의존객체 dependency object
				String [] arg = command.split(" ");
				if(arg.length != 5) {
					printHelp();
					System.out.println();
					continue;
				}
				RegisterRequest rr = new RegisterRequest();
				rr.setEmail(arg[1]);
				rr.setName(arg[2]);
				rr.setPassword(arg[3]);
				rr.setConfirmPassword(arg[4]);
				boolean bl = rr.checkPw();
				if(!bl) {
					System.out.println("비밀번호가 일치하지 않습니다.");
					continue;
				}
				MemberRegisterService mrs = new MemberRegisterService();
				mrs.regist(rr);
			}
			else if(command.startsWith("change")) {
				System.out.println("회원 정보 수정");
				
			}
			else if(command.startsWith("list")) {
				MemberListPrinter listPrint = new MemberListPrinter();
				listPrint.printAll();
			}
			else if(command.startsWith("Info")) {
				System.out.println("회원 정보");
				
			}
			else if(command.startsWith("exit")) {
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				
			}
		}
	}
	
	public static void printHelp() {
		System.out.println();
		System.out.println("명령어 사용법");
		System.out.println("new 이메일 이름 암호 암호확인");
		System.out.println("change 이메일 현재비번 변경비번");
		System.out.println("list");
		System.out.println("Info 이메일");
	}
}
