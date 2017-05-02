package com.example.lesson6;

public class Services {

	private int name;
	private int description;
	private int imageResourceId;

	// Для каждой услуги хранится название, описание и ресурс изображения
	private Services(int name, int description, int imageResourceId) {
		this.name = name;
		this.description = description;
		this.imageResourceId = imageResourceId;
	}

	public int getName() {
		return name;
	}

	public int getDescription() {
		return description;
	}

	public int getImageResourceId() {
		return imageResourceId;
	}

//	@Override
//	public String toString() {
//		return this.name;
//	}

	public static final Services[] hairs = {
			new Services(R.string.classic_hairstyle,
					R.string.classic_hairstyle_discription,
					R.drawable.classic),
			new Services(R.string.model_hairstyle,
					R.string.model_hairstyle_discription,
					R.drawable.model),
			new Services(R.string.balb_hairstyle,
					R.string.bald_hairstyle_discription,
					R.drawable.balb)};

	public static final Services[] nails = {
			new Services(R.string.classic_manicure,
					R.string.classic_manicure_discription,
					R.drawable.kl_man),
			new Services(R.string.hardware_manicure,
					R.string.hardware_manicure_discription,
					R.drawable.ap_man),
			new Services(R.string.hardware_pedicure,
					R.string.hardware_pedicure_discription,
					R.drawable.ap_ped)};
}
