package com.xindus.wishlistmanagement.Model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="user_table")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer id;
	
	 @jakarta.validation.constraints.NotBlank
	private String name;
	
	private String username;
	
	 @jakarta.validation.constraints.Pattern(regexp = "^\\w+@gmail\\.com$")
	private String email;
	 
	 @jakarta.validation.constraints.NotBlank
	private String password;

}
