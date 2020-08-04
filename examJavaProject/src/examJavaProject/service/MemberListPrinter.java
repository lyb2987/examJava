package examJavaProject.service;

import java.util.Collection;

import examJavaProject.DTO.MemberDTO;

import examJavaProject.DAO.MemberDAO;


public class MemberListPrinter {
	private MemberDAO memberDAO = new MemberDAO();
	private MemberPrinter printer = new MemberPrinter();
	public void printAll() {
		Collection<MemberDTO> lists = memberDAO.selectAll();
		System.out.println("총 회원 수는 : " + lists.size());
		for(MemberDTO dto :lists ) {
			printer.print(dto);
		}
	}
}