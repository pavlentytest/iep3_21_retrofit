package ru.samsung.itschool.mdev.myapplication;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewRow> {

    @NonNull
    @Override
    public ViewRow onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewRow holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewRow extends RecyclerView.ViewHolder {

        private TextView tv;

        public ViewRow(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.textView);
        }
    }
}