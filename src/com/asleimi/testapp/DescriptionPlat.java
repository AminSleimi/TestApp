package com.asleimi.testapp;

import java.io.Serializable;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.asleimi.testapp.model.Plat;

public class DescriptionPlat extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_description_plat);
		
		
		final TextView platNomTextView = (TextView) findViewById(R.id.platNomTextView);
		final TextView ingredienTextView = (TextView) findViewById(R.id.ingredientTextView);
		final TextView etapeTextView = (TextView) findViewById(R.id.etapeTextView);
		
		Serializable extra = getIntent().getSerializableExtra("Plat");
		
		if (extra != null)
		{
			Plat plat = (Plat)extra;
			platNomTextView.setText(plat.getNomPlat());
			ingredienTextView.setText(plat.getIngredientPlat());
			etapeTextView.setText(plat.getEtapePlat());
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.description_plat, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
