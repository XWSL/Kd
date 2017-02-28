package com.adapter;

import java.util.ArrayList;

import com.weimeijing.feigeshudi.R;
import com.bean.ExpressInfo;
import com.bean.Root;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ExpressInfoAdapter extends BaseAdapter {
	private Root root;
	private Context mContext;  
    private LayoutInflater mInflater;
    
	public ExpressInfoAdapter(Context mContext,Root root) {
		
		this.mContext = mContext;
		mInflater = LayoutInflater.from(this.mContext);//获取LayoutInflater的实例
		this.root = root;
	}

	@Override
	public int getCount() {
		
		return root.getData().size();
	}

	@Override
	public Object getItem(int position) {
		
		return root.getData().get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}
	
	static class ViewHolder {
		TextView time;
		TextView context;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		//优化listview的操作使用ViewHolder,将缓存的那些view封装好
		 ViewHolder holder;
		 //第一次创建时缓存起来
		 if (convertView == null) {
			 //得到LayoutInflater实例之后就可以用它来加载方法
			 convertView = mInflater.inflate(R.layout.list_express_info_item,parent, false);
			 //静态加载的viewHolder
			 holder = new ViewHolder();
			 holder.time = (TextView) convertView.findViewById(R.id.tv_info_time);
			 holder.context = (TextView) convertView.findViewById(R.id.tv_info_context);
			 //setTag的作用才是把查找的view通过ViewHolder封装好缓存起来方便多次重用，当需要时可以getTag拿出来
			 convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		holder.time.setText(root.getData().get(position).getFtime());
		holder.context.setText(root.getData().get(position).getContext());
		
		return convertView;
	}
	
	@Override
	public boolean areAllItemsEnabled() {
	    return false;
	}
	 
	@Override
	public boolean isEnabled(int position)  {
	    return false;
	}

}
