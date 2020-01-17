package com.example.youtube_item_design;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.youtube_item_design.VideoFragment.OnListFragmentInteractionListener;
import com.example.youtube_item_design.dummy.DummyContent.DummyItem;

import java.util.List;


public class MyVideoRecyclerViewAdapter extends RecyclerView.Adapter<MyVideoRecyclerViewAdapter.ViewHolder> {

    private final List<Video> mValues;
    private Context ctx;
    private int layout;


    public MyVideoRecyclerViewAdapter(Context ctx, int layout, List<Video> items) {
        this.ctx = ctx;
        this.layout = layout;
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_video, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);


    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final ImageView ivVideo;
        public final ImageView ivPerfil;
        public final TextView tvTitulo;
        public final TextView tvPerfil;
        public final TextView tvVistas;
        public Video mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            ivVideo = view.findViewById(R.id.imageViewVideo);
            ivPerfil = view.findViewById(R.id.imageViewPerfil);
            tvTitulo = view.findViewById(R.id.textViewTitulo);
            tvPerfil = view.findViewById(R.id.textViewNombrePerfil);
            tvVistas = view.findViewById(R.id.textViewVisitas);
        }
    }
}



