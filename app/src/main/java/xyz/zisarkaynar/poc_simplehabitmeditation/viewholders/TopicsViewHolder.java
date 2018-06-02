package xyz.zisarkaynar.poc_simplehabitmeditation.viewholders;

import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import xyz.zisarkaynar.poc_simplehabitmeditation.R;
import xyz.zisarkaynar.poc_simplehabitmeditation.adapters.MeditateScreenAdapter;
import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.TopicVO;
import xyz.zisarkaynar.poc_simplehabitmeditation.delegates.SHMdelegate;

public class TopicsViewHolder extends BaseViewHolder<TopicVO, MeditateScreenAdapter> {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_desc)
    TextView tvDesc;

    private SHMdelegate mdelegate;

    public TopicsViewHolder(View itemView, SHMdelegate shMdelegate) {
        super(itemView);
        mdelegate = shMdelegate;
    }

    @Override
    public void setData(TopicVO data) {
        mData = (TopicVO) data;
        tvTitle.setText(data.getTopicName().toString());
        tvDesc.setText(data.getTopicDesc().toString());
    }

    @Override
    public void onClick(View view) {
        mdelegate.onTapItemView(mData);
    }
}
