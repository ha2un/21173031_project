package com.example.a21173031_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    ArrayList<Movie> items = new ArrayList<Movie>();
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView =inflater.inflate(R.layout.movie_item, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Movie item =items.get(position);
        holder.setItem(item);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(Movie item) {
        items.add(item);
    }

    public void setItems(ArrayList<Movie> items){
        this.items = items;
    }
    public Movie getItem(int position) {
        return items.get(position);

    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView movieName;
        TextView peopleCount;
        TextView openData;
        TextView movieRank;
        TextView showCount;

        public ViewHolder (View itemView){
            super(itemView);
            movieName = itemView.findViewById(R.id.MovieName);
            peopleCount = itemView.findViewById(R.id.peopleCount);
            openData = itemView.findViewById(R.id.openDt);
            movieRank = itemView.findViewById(R.id.rank);
            showCount = itemView.findViewById(R.id.showCount);
        }
        public void setItem(Movie item)
        {
            movieName.setText(item.movieNm);
            peopleCount.setText("누적관객수"+ item.audiCnt+ "명");
            openData.setText("개봉일"+ item.openDt);
            movieRank.setText(item.rank+"위");
            showCount.setText("상영 수"+ item.showCnt+"회");
        }
    }
}

