package xyz.zisarkaynar.poc_simplehabitmeditation.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.ViewGroup;

import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.CurrentProgramVO;
import xyz.zisarkaynar.poc_simplehabitmeditation.viewholders.CurrentProgramViewHolder;

public class CurrentProgramAdapter extends BaseRecyclerAdapter<CurrentProgramViewHolder, CurrentProgramVO>{

    public CurrentProgramAdapter(Context context) {
        super(context);
    }

    @NonNull
    @Override
    public CurrentProgramViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }
}
