package project56;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class sample {

	private String name;
	@Id
	@GeneratedValue
	private int id;
	private String guessNumber;
	private String enteredNumber;
	@CreationTimestamp
	private Date enteredDate;
	private int score;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGuessNumber() {
		return guessNumber;
	}
	public void setGuessNumber(String guessNumber) {
		this.guessNumber = guessNumber;
	}
	public String getEnteredNumber() {
		return enteredNumber;
	}
	public void setEnteredNumber(String enteredNumber) {
		this.enteredNumber = enteredNumber;
	}
	public Date getEnteredDate() {
		return enteredDate;
	}
	public void setEnteredDate(Date enteredDate) {
		this.enteredDate = enteredDate;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "sample [name=" + name + ", id=" + id + ", guessNumber=" + guessNumber + ", enteredNumber="
				+ enteredNumber + ", enteredDate=" + enteredDate + ", score=" + score + "]";
	}
	
	
	
	
	
	

}
