package com.antu.nmea.annotation;

public class FieldSetting {

	private boolean isRequired;
	
	private int fieldWidth;
	
	private int precision;
	
	private String defaultValue;

	public FieldSetting(SentenceField annotation) {
		
		this.isRequired = annotation.isRequired();
		this.fieldWidth = annotation.fieldWidth();
		this.precision = annotation.precision();
		this.defaultValue = annotation.defaultValue();
	}

	public FieldSetting(MessageField annotation) {
		this.defaultValue = annotation.defaultValue();
		this.fieldWidth = annotation.requiredBits();
	}
	
	public FieldSetting(GroupItem annotation) {
		this.defaultValue = annotation.defaultValue();
		this.fieldWidth = annotation.fieldWidth();
	}
	
	public boolean isRequired() {
		return isRequired;
	}

	public int getFieldWidth() {
		return fieldWidth;
	}

	public int getPrecision() {
		return precision;
	}

	public String getDefaultValue() {
		return defaultValue;
	}
}
