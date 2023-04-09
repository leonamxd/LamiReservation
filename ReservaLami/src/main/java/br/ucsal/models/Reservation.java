package br.ucsal.models;

import java.util.Date;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_reservation")
public class Reservation {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long reservationId;
	@ManyToOne
	@JoinColumn(name = "laboratory_id")
	private Laboratory laboratory;
	@ManyToOne
	@JoinColumn(name = "teacher_id")
	private Teacher teacher;
	@OneToMany
	@JoinColumn(name = "discipline_id")
	private Discipline discipline;
	private Date startTime;
	private Date endTime;
	private StatusReservation statusReservation;
	
	
	public Long getReservationId() {
		return reservationId;
	}
	public void setReservationId(Long reservationId) {
		this.reservationId = reservationId;
	}
	public Laboratory getLaboratory() {
		return laboratory;
	}
	public void setLaboratory(Laboratory laboratory) {
		this.laboratory = laboratory;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Discipline getDiscipline() {
		return discipline;
	}
	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public StatusReservation getStatusReservation() {
		return statusReservation;
	}
	public void setStatusReservation(StatusReservation statusReservation) {
		this.statusReservation = statusReservation;
	}
	
	public void reserveLab() {
		
	}
}
