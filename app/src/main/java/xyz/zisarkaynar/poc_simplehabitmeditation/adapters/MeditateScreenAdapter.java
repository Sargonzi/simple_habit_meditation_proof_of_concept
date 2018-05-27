package xyz.zisarkaynar.poc_simplehabitmeditation.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.zisarkaynar.poc_simplehabitmeditation.R;
import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.CategoriesProgramVO;
import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.CurrentProgramVO;
import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.MainScreenVO;
import xyz.zisarkaynar.poc_simplehabitmeditation.viewholders.BaseViewHolder;
import xyz.zisarkaynar.poc_simplehabitmeditation.viewholders.CategoryViewHolder;
import xyz.zisarkaynar.poc_simplehabitmeditation.viewholders.CurrentProgramViewHolder;
import xyz.zisarkaynar.poc_simplehabitmeditation.viewholders.ProgramsViewHolder;
import xyz.zisarkaynar.poc_simplehabitmeditation.viewholders.TopicsViewHolder;

public class MeditateScreenAdapter extends BaseRecyclerAdapter<BaseViewHolder, MainScreenVO> {

    private static final int CURRENT_PROGRAM = 1;
    private static final int CATEGORIES_PROGRAM = 2;
    private static final int ALL_TOPIC = 3;

    public MeditateScreenAdapter(Context context) {
        super(context);
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == CURRENT_PROGRAM) {
            View view = mLayoutInflator.inflate(R.layout.item_view_current_program, parent, false);
            return new CurrentProgramViewHolder(view);
        } else if (viewType == CATEGORIES_PROGRAM) {
            View view = mLayoutInflator.inflate(R.layout.item_view_category, parent, false);
            return new CategoryViewHolder(view);
        } else {
            View view = mLayoutInflator.inflate(R.layout.item_view_topics, parent, false);
            return new TopicsViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.setData(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (mData.get(position) instanceof CurrentProgramVO) {
            return CURRENT_PROGRAM;
        } else if (mData.get(position) instanceof CategoriesProgramVO) {
            return CATEGORIES_PROGRAM;
        } else {
            return ALL_TOPIC;
        }
    }
}
