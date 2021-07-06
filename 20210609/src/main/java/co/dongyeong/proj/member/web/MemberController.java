package co.dongyeong.proj.member.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping("/memberList.do")
	public String MemberList(Model model) {
		return "member/memberList";
	}
}
