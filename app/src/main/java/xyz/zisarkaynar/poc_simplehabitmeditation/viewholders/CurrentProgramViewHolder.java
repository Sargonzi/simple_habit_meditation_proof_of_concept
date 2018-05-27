package xyz.zisarkaynar.poc_simplehabitmeditation.viewholders;

import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import xyz.zisarkaynar.poc_simplehabitmeditation.R;
import xyz.zisarkaynar.poc_simplehabitmeditation.adapters.MeditateScreenAdapter;
import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.CurrentProgramVO;

public class CurrentProgramViewHolder extends BaseViewHolder<CurrentProgramVO, MeditateScreenAdapter> {

    @BindView(R.id.tv_simplehabit)
    TextView tvTitle;

    @BindView(R.id.tv_time)
    TextView tvTime;

    public CurrentProgramViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setData(CurrentProgramVO data) {
        mData = (CurrentProgramVO) data;
        tvTitle.setText(data.getTitle().toString());
        tvTime.setText(data.getAverageLengths().toString() + "mins");
    }

    @Override
    public void onClick(View view) {

    }
}
