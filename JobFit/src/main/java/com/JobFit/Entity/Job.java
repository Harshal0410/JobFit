package com.JobFit.Entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;

@Entity
public class Job {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int jobId;
	@NotNull
	private String title;
	@NotNull
	private int companyId;
	
	private String techStack;
	@NotNull
	private String description;
	@ManyToMany(mappedBy = "jobs",cascade = CascadeType.ALL)
	private List<User> users;
	@NotNull
	private LocalDate startDate;
	@NotNull
	private LocalDate endDate;
	
	public Job(int jobId, @NotNull String title, @NotNull int companyId, String techStack, @NotNull String description,
			@NotNull LocalDate startDate, @NotNull LocalDate endDate) {
		super();
		this.jobId = jobId;
		this.title = title;
		this.companyId = companyId;
		this.techStack = techStack;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getTechStack() {
		return techStack;
	}
	public void setTechStack(String techStack) {
		this.techStack = techStack;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", title=" + title + ", companyId=" + companyId + ", techStack=" + techStack
				+ ", description=" + description + ", users=" + users + ", startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}
}
