package xyz.zisarkaynar.poc_simplehabitmeditation.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

import xyz.zisarkaynar.poc_simplehabitmeditation.R;
import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.TopicVO;
import xyz.zisarkaynar.poc_simplehabitmeditation.viewholders.TopicsViewHolder;

public class TopicsAdapter extends BaseRecyclerAdapter<TopicsViewHolder, TopicVO> {

    public TopicsAdapter(Context context) {
        super(context);
    }

    @NonNull
    @Override
    public TopicsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mLayoutInflator.inflate(R.layout.item_view_topics, parent, false);
        return new TopicsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TopicsViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
