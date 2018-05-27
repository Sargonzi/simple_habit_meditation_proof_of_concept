package xyz.zisarkaynar.poc_simplehabitmeditation.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.ViewGroup;

import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.CategoriesProgramVO;
import xyz.zisarkaynar.poc_simplehabitmeditation.viewholders.CategoryViewHolder;

public class CategoryAdapter extends BaseRecyclerAdapter<CategoryViewHolder, CategoriesProgramVO> {

    public CategoryAdapter(Context context) {
        super(context);
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }
}
