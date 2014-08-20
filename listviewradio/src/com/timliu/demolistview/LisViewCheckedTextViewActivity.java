package com.timliu.demolistview;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LisViewCheckedTextViewActivity  extends Activity
{

	private ListView listview;
	private ArrayAdapter<String> adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.checkable_main);
		
		listview = (ListView)findViewById(R.id.listview);
		
		String[] array = getResources().getStringArray(R.array.jazz_artist_names);
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(array));

        adapter = new ArrayAdapter<String>(this, R.layout.list_item_radio, R.id.text, arrayList);
        listview.setAdapter(adapter);
        listview.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
//        listview.getCheckedItemPosition();
//        listview.getCheckedItemPositions();
//        listview.setI
	}
}
