package com.telefonica.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


/**
 * The persistent class for the examtemplate database table.
 * 
 */
@Entity
@NamedQuery(name="Examtemplate.findAll", query="SELECT e FROM Examtemplate e")
public class Examtemplate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="descriptionET")
	private int descriptionET;

	@Column(name="isPublisher")
	private byte isPublisher;
	
	@OneToMany (mappedBy = "examtemplate", cascade = CascadeType.ALL)
	private List<Question>question = new ArrayList<>();

	public Examtemplate() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDescriptionET() {
		return this.descriptionET;
	}

	public void setDescriptionET(int descriptionET) {
		this.descriptionET = descriptionET;
	}

	public byte getIsPublisher() {
		return this.isPublisher;
	}

	public void setIsPublisher(byte isPublisher) {
		this.isPublisher = isPublisher;
	}

}