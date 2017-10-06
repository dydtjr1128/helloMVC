package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor//인자를 가진 생성자를 만들어줌
public class Customer {
	
	private String id;
	private String name;
	private String email;
	
}
