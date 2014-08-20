package com.timliu.demolistview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
public class ListviewImageViewActivity extends ListActivity  implements OnItemClickListener{
	private int balanceIndex = 0;
	SimpleAdapter adapter;
	List<Map<String, Object>> list;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        adapter= new SimpleAdapter(this,getData(),R.layout.activity_good,new String[]{"text","img","address"},new int[]{R.id.list_text,R.id.list_radioImg,R.id.list_address}); 
        
        setListAdapter(adapter);
    }
        
      private List<Map<String, Object>> getData(){
        	 list = new ArrayList<Map<String, Object>>();
        	
        	
        	
        	for(int i=0; i<100;i++)
        	{
        		Map<String, Object> new_obj = new HashMap<String, Object>(); 
        		new_obj.put("text", "微风"+i);  
        		new_obj.put("address", "好长随碟附送松岛枫了是"+i);  
        		new_obj.put("img", R.drawable.android_check_icon);  
            	list.add(new_obj);
        	}
        	
        	
        	return list;
        }
        
        protected void onListItemClick(ListView arg0, View view, int position, long id) {
         Toast t = Toast.makeText(this, ""+list.get(position).get("text"), Toast.LENGTH_SHORT);
         t.show();
          
        	 ChangeRadioImg(balanceIndex,false);
        	 ChangeRadioImg(position,true);
        	 balanceIndex=position;   
        	 
        	 list.get(position).get("text");
         }
        
		private void ChangeRadioImg(int selectedItem, boolean b) {
			SimpleAdapter la = adapter;	
	        HashMap<String, Object> map = (HashMap<String, Object>)la.getItem(selectedItem);  
	        if(b)
	        	map.put("img", R.drawable.android_checked_icon);
	        else
	        	map.put("img", R.drawable.android_check_icon);
	       la.notifyDataSetChanged();
			
		}

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			
		}
       
}
