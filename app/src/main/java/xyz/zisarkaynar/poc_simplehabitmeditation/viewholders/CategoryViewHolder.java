package xyz.zisarkaynar.poc_simplehabitmeditation.viewholders;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import xyz.zisarkaynar.poc_simplehabitmeditation.R;
import xyz.zisarkaynar.poc_simplehabitmeditation.adapters.MeditateScreenAdapter;
import xyz.zisarkaynar.poc_simplehabitmeditation.adapters.ProgramsAdapter;
import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.CategoriesProgramVO;

public class CategoryViewHolder extends BaseViewHolder<CategoriesProgramVO, MeditateScreenAdapter> {

    @BindView(R.id.tvCategoryTitle)
    TextView tvTitle;

    @BindView(R.id.rvProgram)
    RecyclerView rvProgram;

    private ProgramsAdapter mProgramsAdapter;

    public CategoryViewHolder(View itemView) {
        super(itemView);
        mProgramsAdapter = new ProgramsAdapter(itemView.getContext());
        rvProgram.setLayoutManager(new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.HORIZONTAL, false));

        rvProgram.setAdapter(mProgramsAdapter);

    }

    @Override
    public void setData(CategoriesProgramVO data) {
        mData = data;
        tvTitle.setText(data.getTitle().toString());
        mProgramsAdapter.setNewData(data.getProgramVOS());
    }

    @Override
    public void onClick(View view) {

    }
}
