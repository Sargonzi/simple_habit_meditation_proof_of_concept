package xyz.zisarkaynar.poc_simplehabitmeditation.viewholders;

import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import xyz.zisarkaynar.poc_simplehabitmeditation.R;
import xyz.zisarkaynar.poc_simplehabitmeditation.adapters.MeditateScreenAdapter;
import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.ProgramVO;

public class ProgramsViewHolder extends BaseViewHolder<ProgramVO, MeditateScreenAdapter> {

    @BindView(R.id.tvProTitle)
    TextView tvProTitle;

    @BindView(R.id.tvTime)
    TextView tvTime;

    public ProgramsViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setData(ProgramVO data) {
        tvProTitle.setText(data.getTitle());
        tvTime.setText(data.getAverageLengths().toString() + "mins");
    }

    @Override
    public void onClick(View view) {

    }
}
