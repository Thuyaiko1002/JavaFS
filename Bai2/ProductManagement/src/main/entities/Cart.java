package main.entities;

import java.io.Serializable;
import java.sql.Date;
import lombok.Data;

@Data
public class Cart implements Serializable{
	private static final long serialVersionUID = -5678684761199867467L;
	
	private String id;
	private Integer user_id;
	private Date buyDate;
	
	public Cart() {
		super();
	}

	public Cart(String id, Integer user_id, Date buyDate) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.buyDate = buyDate;
	}
}
