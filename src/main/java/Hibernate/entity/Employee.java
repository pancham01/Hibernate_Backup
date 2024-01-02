package Hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity(name = "ducat_emp")
@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@EqualsAndHashCode
@ToString(exclude = {"gender","salary"})
@Data
public class Employee {
	
	@Column(name="userName")
	private String name;
	private String gender;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int salary;
	
	
	
}
