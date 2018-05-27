package xyz.zisarkaynar.poc_simplehabitmeditation.viewholders;

import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import xyz.zisarkaynar.poc_simplehabitmeditation.R;
import xyz.zisarkaynar.poc_simplehabitmeditation.adapters.MeditateScreenAdapter;
import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.TopicVO;

public class TopicsViewHolder extends BaseViewHolder<TopicVO, MeditateScreenAdapter> {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_desc)
    TextView tvDesc;

    public TopicsViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setData(TopicVO data) {
        mData = (TopicVO) data;
        tvTitle.setText(data.getTopicName().toString());
        tvDesc.setText(data.getTopicDesc().toString());
    }

    @Override
    public void onClick(View view) {

    }
}
