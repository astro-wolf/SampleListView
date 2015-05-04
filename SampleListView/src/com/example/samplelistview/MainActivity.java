package com.example.samplelistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity{

	private String[] staticList={"This", "is", "a", "sample", "of", "static", "listview", "in", "android"};
	private ListView staticLv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		staticLv=(ListView)findViewById(R.id.lv_static);
		staticLv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, staticList));
		
		staticLv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(MainActivity.this, position+"th row clicked", Toast.LENGTH_SHORT).show();
			}
		});
	}
}
