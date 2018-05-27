package xyz.zisarkaynar.poc_simplehabitmeditation.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

import xyz.zisarkaynar.poc_simplehabitmeditation.R;
import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.ProgramVO;
import xyz.zisarkaynar.poc_simplehabitmeditation.viewholders.BaseViewHolder;
import xyz.zisarkaynar.poc_simplehabitmeditation.viewholders.ProgramsViewHolder;
import xyz.zisarkaynar.poc_simplehabitmeditation.viewholders.TopicsViewHolder;

public class ProgramsAdapter extends BaseRecyclerAdapter<ProgramsViewHolder, ProgramVO> {


    public ProgramsAdapter(Context context) {
        super(context);
    }

    @NonNull
    @Override
    public ProgramsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mLayoutInflator.inflate(R.layout.item_view_program, parent, false);
        return new ProgramsViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ProgramsViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
