package com.gaip.catroid_share;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class shareapiadapter extends RecyclerView.Adapter<shareapiadapter.holder>
{
    appdetails appdetails;
    shareapiadapter(appdetails appdetails)
    {
        this.appdetails=appdetails;
    }
    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.app,
                parent, false);
        return new holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        CatrobatProject catrobatProject=appdetails.getCatrobatProjects().get(position);
        Glide.with(holder.imageView.getContext()).load("https://share.catrob.at/"+catrobatProject.getScreenshotBig()).placeholder(R.drawable.loader).into(holder.imageView);
        holder.upload.setText(catrobatProject.getUploadedString().replace("more than ",""));
        holder.name.setText(catrobatProject.getProjectNameShort());
    }

    @Override
    public int getItemCount() {
        return appdetails.getCatrobatProjects().size();
    }

    class holder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView upload,name;
        holder(View a)
        {
            super(a);
            imageView=a.findViewById(R.id.appimage);
            upload=a.findViewById(R.id.appupload);
            name=a.findViewById(R.id.appname);
        }
    }
}
