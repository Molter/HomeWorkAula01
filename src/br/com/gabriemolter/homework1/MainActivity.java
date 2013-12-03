package br.com.gabriemolter.homework1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	EditText mEditText;
	int counter = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mEditText = (EditText) findViewById(R.id.editText1);
		
		if(getIntent().getExtras() == null){
			return;
		}
		
		String text =
				getIntent().getExtras().getString("texto");
				
		mEditText.setText(text);
		counter = getIntent().getExtras().getInt("counter");
	}

	public void sendValue(View view) {
		String text = mEditText.getText().toString();
		Intent intent = new Intent(this, CounterActivity.class);
		intent.putExtra("counter", counter);
		intent.putExtra("texto", text);
		
		startActivity(intent);
	}

}
