package com.ekhaneibd.ekhaneidemo;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.androidquery.AQuery;

public class ImageAdapter extends ArrayAdapter<String> {
	private Activity mContext;
	public String imageArray[];
	private AQuery mAquery;

	
	// Constructor
	public ImageAdapter(Activity context,String[] imageArray){
		super(context, R.layout.row_image,imageArray);
		this.mContext = context;
		this.imageArray = imageArray;
		mAquery=new AQuery(mContext);
	}
	static class ViewHolder {
		public ImageView img_demoimage;

	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View rowView = convertView;
		// reuse views
		if (rowView == null) {
			LayoutInflater inflater = mContext.getLayoutInflater();
			rowView = inflater.inflate(R.layout.row_image, null);
			// configure view holder
			ViewHolder viewHolder = new ViewHolder();
			viewHolder.img_demoimage = (ImageView) rowView.findViewById(R.id.img_demoimage);


			rowView.setTag(viewHolder);
		}

		// fill data
		ViewHolder holder = (ViewHolder) rowView.getTag();
		Log.i("Size of tion list", "" + imageArray[position]);
		mAquery.id(holder.img_demoimage).image(imageArray[position], true, true);


		return rowView;
	}

}
