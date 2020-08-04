package examJavaProject.service;


import java.util.Date;

import examJavaProject.DAO.MemberDAO;
import examJavaProject.DTO.MemberDTO;
import examJavaProject.DTO.RegisterRequest;

public class MemberRegisterService {
	//의존 객체
	private MemberDAO memberDAO = new MemberDAO();
	
	public void regist(RegisterRequest req) {
		MemberDTO dto = memberDAO.selectByEmail(req.getEmail());
		if(dto == null) {
			dto = new MemberDTO();
			dto.setEmail(req.getEmail());
			dto.setName(req.getName());
			dto.setPassword(req.getPassword());
			dto.setRegisterDate(new Date());
			memberDAO.insert(dto);
			System.out.println("사용자 등록이 완료 되었습니다.");
		}
		else {
			System.out.println("중복 사용자 입니다.");
		}
	}
}
