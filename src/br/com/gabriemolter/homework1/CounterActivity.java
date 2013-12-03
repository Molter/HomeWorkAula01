package br.com.gabriemolter.homework1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CounterActivity extends Activity {

	EditText mEditText;
	static int counter = 0;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		setContentView(R.layout.activity_counter);
		mEditText = (EditText) findViewById(R.id.editText2);
		
		String text =
		getIntent().getExtras().getString("texto");
		
		
		if(counter >= 2){
			Intent intent = new Intent(this, FinalActivity.class);
			
			intent.putExtra("texto", text);
			
			startActivity(intent);
		}
		
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		counter++;
	}
	
	public void sendValue(View view){
		String value = mEditText.getText().toString();
		
		Intent intent = new Intent(this, MainActivity.class);
		
		intent.putExtra("texto", value);
		intent.putExtra("counter", counter);
		
		startActivity(intent);
	}
}
