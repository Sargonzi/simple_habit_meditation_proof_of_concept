package xyz.zisarkaynar.poc_simplehabitmeditation.viewholders;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import xyz.zisarkaynar.poc_simplehabitmeditation.R;
import xyz.zisarkaynar.poc_simplehabitmeditation.adapters.MeditateScreenAdapter;
import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.CurrentProgramVO;
import xyz.zisarkaynar.poc_simplehabitmeditation.delegates.SHMdelegate;

public class CurrentProgramViewHolder extends BaseViewHolder<CurrentProgramVO, MeditateScreenAdapter> {

    @BindView(R.id.tv_simplehabit)
    TextView tvTitle;

    @BindView(R.id.tv_time)
    TextView tvTime;

    private SHMdelegate mdelegate;

    public CurrentProgramViewHolder(View itemView, SHMdelegate shMdelegate) {
        super(itemView);
        mdelegate = shMdelegate;
    }

    @Override
    public void setData(CurrentProgramVO data) {
        mData = (CurrentProgramVO) data;
        tvTitle.setText(data.getTitle().toString());
        tvTime.setText(data.getAverageLengths().toString() + "mins");
    }

    @Override
    public void onClick(View view) {
        mdelegate.onTapItemView();
    }
}
