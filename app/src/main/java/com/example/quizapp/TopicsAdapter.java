package com.example.quizapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TopicsAdapter extends RecyclerView.Adapter<TopicsAdapter.ViewHolder> {
    public ArrayList<Topic>topicList;
    topicClicked activity;
    public interface topicClicked{
        void OnTopicClicked(int index);
    }

    public TopicsAdapter(ArrayList<Topic> topics, Context context) {
        this.topicList= topics;
        this.activity = (topicClicked) context;
    }

    @NonNull
    @Override
    public TopicsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.topics_layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TopicsAdapter.ViewHolder holder, int position) {
        holder.itemView.setTag(topicList.get(position));
        holder.topics.setText(topicList.get(position).getTopicName());
    }

    @Override
    public int getItemCount() {
        return topicList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView topics;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            topics = itemView.findViewById(R.id.txt_topics);
            try {
                itemView.setOnClickListener(v -> activity.OnTopicClicked(topicList.indexOf((Topic) v.getTag())));
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
