package com.lad_corp.dockerspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test")
public class Test {

	@Id
	@GeneratedValue
	private long id;

	@Column
	private String field;

	public Test() {}
	
	public Test(long id, String field) {
		super();
		this.id = id;
		this.field = field;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
	
	

}
