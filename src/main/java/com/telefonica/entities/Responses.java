package com.telefonica.entities;

import java.io.Serializable;
import javax.persistence.*;




/**
 * The persistent class for the responses database table.
 * 
 */
@Entity
@Table(name="responses")
@NamedQuery(name="Responses.findAll", query="SELECT r FROM Responses r")
public class Responses implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id")
	private int id;
	
	@Column(name="descriptionR")
	private int descriptionR;

	@Lob
	@Column(name="image")
	private String image;

	@Column(name="OrderR")
	private int orderR;

	@Column(name="value")
	private byte value;
	
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "id_question")
	private Question question;

	public Responses() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDescriptionR() {
		return this.descriptionR;
	}

	public void setDescriptionR(int descriptionR) {
		this.descriptionR = descriptionR;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getOrderR() {
		return this.orderR;
	}

	public void setOrderR(int orderR) {
		this.orderR = orderR;
	}

	public byte getValue() {
		return this.value;
	}

	public void setValue(byte value) {
		this.value = value;
	}

}