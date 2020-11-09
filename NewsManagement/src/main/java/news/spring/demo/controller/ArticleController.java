package news.spring.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import news.spring.demo.vo.ArticleVO;

@Controller
public class ArticleController {
	@RequestMapping(value = "/article", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)

	@ResponseBody
	public ArticleVO getAllArticles() {
		List<ArticleVO> article = new ArrayList<ArticleVO>();
		ArticleVO articleVO = new ArticleVO();
		articleVO.setId(1);
		articleVO.setName("Thuy");
		articleVO.setSummary("Thúy Aiko");
		articleVO.setContent("Thúy123");
		article.add(articleVO);
		
		return articleVO;
	}
}