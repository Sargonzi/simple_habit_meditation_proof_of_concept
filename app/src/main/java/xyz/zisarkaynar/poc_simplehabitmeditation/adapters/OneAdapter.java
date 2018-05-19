package xyz.zisarkaynar.poc_simplehabitmeditation.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

import xyz.zisarkaynar.poc_simplehabitmeditation.R;
import xyz.zisarkaynar.poc_simplehabitmeditation.viewholders.OneViewHolder;

public class OneAdapter extends RecyclerView.Adapter<OneViewHolder> {
    private LayoutInflater mInflater;

    public OneAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public OneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_view_one, parent, false);
        return new OneViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OneViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
