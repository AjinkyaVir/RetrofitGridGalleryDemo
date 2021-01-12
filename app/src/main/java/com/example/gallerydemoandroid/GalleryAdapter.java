package com.example.gallerydemoandroid;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ajinkya on 1/11/2021.
 */
public class GalleryAdapter extends BaseAdapter {

    private List<Result> resultList;
    private Context context;

    public GalleryAdapter(Context context,List<Result> resultList) {
        this.context = context;
        this.resultList = resultList;
    }

    @Override
    public int getCount() {
        return resultList.size();
    }

    @Override
    public Object getItem(int position) {
        return resultList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if (view == null){
            view =LayoutInflater.from(context).inflate(R.layout.gallery_image_list,viewGroup,false);
        }

        ImageView galleryImageView = view.findViewById(R.id.galleryImage);

        final Result result = resultList.get(position);

        //Picasso.with(context).load(properties.get(position).getPropertiesImages().get(0)).into(holder.imgProperty);
        Picasso.with(context).load(result.getPropertiesImages().get(position)).into(galleryImageView);

        return view;
    }
}
