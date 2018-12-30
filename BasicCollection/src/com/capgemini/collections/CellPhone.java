package com.capgemini.collections;

public class CellPhone {

	private String company;
	private String model;
	private String description;
	private String operatingSystems;
	private int price;

	public CellPhone(String company, String model, String description,
			String operatingSystems, int price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystems = operatingSystems;
		this.price = price;
	}

	@Override
	public String toString() {
		return "CellPhone [company=" + company + ", model=" + model
				+ ", description=" + description + ", operatingSystems="
				+ operatingSystems + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime
				* result
				+ ((operatingSystems == null) ? 0 : operatingSystems.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CellPhone other = (CellPhone) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (operatingSystems == null) {
			if (other.operatingSystems != null)
				return false;
		} else if (!operatingSystems.equals(other.operatingSystems))
			return false;
		return true;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
