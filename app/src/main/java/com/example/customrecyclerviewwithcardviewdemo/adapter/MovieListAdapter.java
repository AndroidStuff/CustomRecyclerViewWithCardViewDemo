package com.example.customrecyclerviewwithcardviewdemo.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.customrecyclerviewwithcardviewdemo.R;
import com.example.customrecyclerviewwithcardviewdemo.model.Movie;

import java.util.List;

public class MovieListAdapter extends RecyclerView.Adapter {

    List<Movie> movies;

    public static class MovieViewHolder extends RecyclerView.ViewHolder { // ViewHolder Pattern
        TextView title;
        TextView rating;
        TextView genre;
        TextView year;
        ImageView thumbnail;
        CardView cv;

        public MovieViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            title = (TextView) itemView.findViewById(R.id.title);;
            rating = (TextView) itemView.findViewById(R.id.rating);;
            genre = (TextView) itemView.findViewById(R.id.genre);;
            year = (TextView) itemView.findViewById(R.id.releaseYear);
            thumbnail = (ImageView) itemView.findViewById(R.id.thumbnail);;
        }
    }

    public MovieListAdapter(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // We specify the layout that each item of the RecyclerView should use.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_cardview, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        // We specify the contents of each item of the RecyclerView here.
        MovieViewHolder mvh = (MovieViewHolder) holder;
        Movie m = movies.get(position);
        mvh.title.setText(m.getTitle());
        mvh.rating.setText(String.valueOf(m.getRating()));
        mvh.genre.setText(m.getStringifiedGenre());
        mvh.year.setText(m.getYear() + "");
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
