package xyz.zisarkaynar.poc_simplehabitmeditation.viewholders;

import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import xyz.zisarkaynar.poc_simplehabitmeditation.R;
import xyz.zisarkaynar.poc_simplehabitmeditation.adapters.SessionAdapter;
import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.SessionsVO;

public class SessionViewHolder extends BaseViewHolder<SessionsVO, SessionAdapter> {

    @BindView(R.id.tv_no)
    TextView tvNO;

    @BindView(R.id.tv_title)
    TextView tvTitle;

    @BindView(R.id.tv_time)
    TextView tvTime;


    public SessionViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setData(SessionsVO data) {
        mData = data;
        tvNO.setText(data.getSessionId());
        tvTitle.setText(data.getTitle());
        tvTime.setText(data.getLengthInSeconds());
    }

    @Override
    public void onClick(View v) {

    }
}
