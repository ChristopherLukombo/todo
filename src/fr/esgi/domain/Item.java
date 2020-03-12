package fr.esgi.domain;

public class Item {

	private Long id;
	private final String note;
	private final String amountOfTime;

	public Item(final Long id, final String note, final String amountOfTime) {
		this.id = id;
		this.note = note;
		this.amountOfTime = amountOfTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getNote() {
		return note;
	}

	public String getAmountOfTime() {
		return amountOfTime;
	}

}
