package news.spring.demo.vo;

import java.io.Serializable;
import lombok.Data;

@Data
public class ArticleVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String content;

	private String name;

	private String summary;
}
