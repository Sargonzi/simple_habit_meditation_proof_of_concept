package xyz.zisarkaynar.poc_simplehabitmeditation.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.zisarkaynar.poc_simplehabitmeditation.R;
import xyz.zisarkaynar.poc_simplehabitmeditation.viewholders.TwoViewHolder;

public class TwoAdapter extends RecyclerView.Adapter<TwoViewHolder> {

    private LayoutInflater mInflater;

    public TwoAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public TwoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_view_two, parent, false);
        return new TwoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TwoViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 4;
    }


}
