package system;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("productController")
public class ProductController {
	
	@RequestMapping("productShowList")
	public void productShowList(HttpServletRequest request,HttpServletResponse response){
		System.out.println("------------¿ªÊ¼ÁË");
	}
}
