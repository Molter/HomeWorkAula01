package br.com.gabriemolter.homework1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class FinalActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_finaly);
		
		String text = getIntent().getExtras().getString("texto");
		TextView textView= (TextView)findViewById(R.id.final_text);
		textView.setText(text);
		
	}

	
}
