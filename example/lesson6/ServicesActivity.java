package com.example.lesson6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class ServicesActivity extends AppCompatActivity {

	public static final String EXTRA_NAILNOM = "nailNom";
	private Services service = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_services);

		// Получить вид услуги
		Bundle bundle = getIntent().getExtras();
		if (bundle != null) {
			int nailNom = bundle.getInt(EXTRA_NAILNOM);

			if ((TopActivity.service).equals("hair")) {
				service = Services.hairs[nailNom];
			} else if ((TopActivity.service).equals("nail")) {
				service = Services.nails[nailNom];
			}

			Log.d("ServicesActivity", "nailNom " + nailNom);
			Log.d("ServicesActivity", "nail " + service.getName());
			Log.d("ServicesActivity", "nailNom " + service.getDescription());
			Log.d("ServicesActivity", "nailNom " + service.getImageResourceId());

			// Заполнить ихображение услуги
			ImageView photo = (ImageView) findViewById(R.id.photo);
			photo.setImageResource(service.getImageResourceId());
			photo.setContentDescription(getResources().getString(service.getName()));

			// Заполнение наименования услуги
			TextView name = (TextView) findViewById(R.id.name);
			name.setText(service.getName());

			// Заполнение описания услуги
			TextView description = (TextView) findViewById(R.id.description);
			description.setText(service.getDescription());
		}
	}

}

