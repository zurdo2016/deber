package com.ug.encuesta.dominio;

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="requisitos")
public class Requisito {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int requisito_id;
	private int subgrupo_id;
	private String literal;
	private String descripcion;
	private boolean tiene_sangria;
	private boolean es_calificable;
	private double peso_relativo;
	
	
	public boolean isTiene_sangria() {
		return tiene_sangria;
	}
	public void setTiene_sangria(boolean tiene_sangria) {
		this.tiene_sangria = tiene_sangria;
	}
	public boolean isEs_calificable() {
		return es_calificable;
	}
	public void setEs_calificable(boolean es_calificable) {
		this.es_calificable = es_calificable;
	}
	public double getPeso_relativo() {
		return peso_relativo;
	}
	public void setPeso_relativo(double peso_relativo) {
		this.peso_relativo = peso_relativo;
	}
	public int getRequisito_id() {
		return requisito_id;
	}
	public void setRequisito_id(int requisito_id) {
		this.requisito_id = requisito_id;
	}
	public int getSubgrupo_id() {
		return subgrupo_id;
	}
	public void setSubgrupo_id(int subgrupo_id) {
		this.subgrupo_id = subgrupo_id;
	}
	public String getLiteral() {
		return literal;
	}
	public void setLiteral(String literal) {
		this.literal = literal;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	
}
