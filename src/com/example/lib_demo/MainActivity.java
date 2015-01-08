package com.example.lib_demo;

import com.example.lib_demo.photoview.LauncherActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

	private Button xListViewBtn, overscrollviewBtn, roundImage, httpManager;

	private Button photoViewBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		xListViewBtn = (Button) findViewById(R.id.xlistView);
		xListViewBtn.setOnClickListener(this);

		overscrollviewBtn = (Button) findViewById(R.id.overscrollview);
		overscrollviewBtn.setOnClickListener(this);

		roundImage = (Button) findViewById(R.id.roundimage);
		roundImage.setOnClickListener(this);

		httpManager = (Button) findViewById(R.id.httpmanager);
		httpManager.setOnClickListener(this);

		photoViewBtn = (Button) findViewById(R.id.photoview);
		photoViewBtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if (v == xListViewBtn) {
			XListViewActivity.launch(this);
		} else if (v == overscrollviewBtn) {
			Intent it = new Intent(this, OverScrollViewActivity.class);
			startActivity(it);
		} else if (v == roundImage) {
			Intent it = new Intent(this, RoundImageActivity.class);
			startActivity(it);
		} else if (v == httpManager) {
			Intent it = new Intent(this, HttpQueryPhoneNumActivity.class);
			startActivity(it);
		} else if (v == photoViewBtn) {
			Intent it = new Intent(this, LauncherActivity.class);
			startActivity(it);
		}
	}

}
