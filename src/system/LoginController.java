package system;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("loginController")
public class LoginController {
	private static Logger LOGGER=Logger.getLogger(LoginController.class);
	
	@RequestMapping("toLogin")
	public String toLogin(HttpServletRequest request,HttpServletResponse response){
		LOGGER.info("------------跳转到登录页面了,时间："+new Date());
		return "login";
	}
}
