package br.ucsal.models;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_teacher")
public class Teacher {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long teacherId;
	private String nameTeacher;
	private String emailTeacher;
	
	
	public Long getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}
	public String getNameTeacher() {
		return nameTeacher;
	}
	public void setNameTeacher(String nameTeacher) {
		this.nameTeacher = nameTeacher;
	}
	public String getEmailTeacher() {
		return emailTeacher;
	}
	public void setEmailTeacher(String emailTeacher) {
		this.emailTeacher = emailTeacher;
	}
}
