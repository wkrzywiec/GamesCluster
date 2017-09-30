package com.wawa_applications.gamescluster.view;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.wawa_applications.gamescluster.BR;
import com.wawa_applications.gamescluster.R;
import com.wawa_applications.gamescluster.model.details.GameDetailsResultModel;
import com.wawa_applications.gamescluster.model.search.GameResultModel;
import com.wawa_applications.gamescluster.network.GiantBombService;

import java.util.List;
import java.util.Random;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static java.lang.System.load;

/**
 * Created by Wojtek on 2017-09-29.
 */

public class GameImagesAdapter extends RecyclerView.Adapter<GameImagesAdapter.GameImagesHolder> {

    private List<String> mGameImages;
    Context context;


    public GameImagesAdapter(Context context, List<String> mGameImages) {
        this.mGameImages = mGameImages;
        this.context = context;
    }

    @Override
    public GameImagesAdapter.GameImagesHolder onCreateViewHolder(ViewGroup parent, int type) {

        View singleCard = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.image_layout, parent, false);
        GameImagesAdapter.GameImagesHolder holder = new GameImagesAdapter.GameImagesHolder(singleCard);
        return holder;
    }

    @Override
    public void onBindViewHolder(GameImagesAdapter.GameImagesHolder holder, int position) {
        String imageUrl = mGameImages.get(position);

        Glide.with(context)
                .load(imageUrl)
                .fitCenter()
                .crossFade()
                .into(holder.gameImage);
    }

    @Override
    public int getItemCount() {
        return mGameImages.size();
    }


    public class GameImagesHolder extends RecyclerView.ViewHolder {

        private ImageView gameImage;

        public GameImagesHolder(View rowView) {
            super(rowView);

            gameImage = rowView.findViewById(R.id.single_image);

            rowView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();

                }
            });
        }

        public ImageView getGameImage() {
            return gameImage;
        }
    }
}
