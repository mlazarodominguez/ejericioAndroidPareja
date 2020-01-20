package com.example.amazon_item_design;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.amazon_item_design.AmazonProductFragment.OnListFragmentInteractionListener;
import com.example.amazon_item_design.dummy.DummyContent.DummyItem;

import java.text.BreakIterator;
import java.util.List;


public class MyAmazonProductRecyclerViewAdapter extends RecyclerView.Adapter<MyAmazonProductRecyclerViewAdapter.ViewHolder> {

    private final List<AmazonProduct> mValues;
    private Context ctx;
    private int layout;

    public MyAmazonProductRecyclerViewAdapter(List<AmazonProduct> objects, Context ctx,int layout) {
        mValues = objects;
        this.ctx = ctx;
        this.layout = layout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_amazonproduct, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.tvNombre.setText(holder.mItem.getNombre());
        holder.tvSubtitulo.setText(holder.mItem.getSubtitulo());
        holder.tvPrecio.setPrecio(holder.mItem.getPrecio());
        holder.tvPrime.isPrime(holder.mItem.isPrime());
        holder.tvFechaEntrega.setFechaEntrega(holder.mItem.getFechaEntrega());
        holder.tvPrecioEnvio.setPrecioEnvio(holder.mItem.getPrecioEnvio());
        holder.tvRating.setRating(holder.mItem.getRating());


        Glide.with(ctx)
                .load(holder.mItem.getUrlProducto())
                .centerCrop()
                .into(holder.ivFoto);





    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView tvNombre;
        public final TextView tvSubtitulo;
        public final TextView tvPrecio;
        public final TextView tvPrime;
        public final TextView tvFechaEntrega;
        public final TextView tvPrecioEnvio;
        public final TextView tvRating;
        public AmazonProduct mItem;


        public ViewHolder(View view) {
            super(view);
            mView = view;
            tvNombre = view.findViewById(R.id.txNombreProducto);
            tvSubtitulo = view.findViewById(R.id.txSubtitulo);
            tvPrecio = view.findViewById(R.id.txPrecio);
            tvPrime = view.findViewById(R.id.txPrime);
            tvFechaEntrega = view.findViewById(R.id.txFechaEntrega);
            tvPrecioEnvio = view.findViewById(R.id.txPrecioEnvio);
            tvRating = view.findViewById(R.id.ratingBar);



        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}
