package com.example.e03_gui_fixed;

import android.content.Context;
import android.media.Rating;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PlaceAdapter extends BaseAdapter {

    private List<Place> places;
    private Context context;

    public PlaceAdapter(Context context) {
        this.context = context;
        this.places = new ArrayList<>();


        carryingPlaces();
    }


    public void carryingPlaces() {
        this.places.add(
                new Place("UFMG",
                        R.drawable.ufmg_img,
                        15.1,
                        5.0,
                        "Universidade Federal localizada na Pampulha"));
        this.places.add(
                new Place("TMT BRASIL",
                        R.drawable.tmt_img,
                        35.0,
                        5.0,
                        "Local de trabalho localizado em Betim"));
        this.places.add(
                new Place("teste",
                        0,
                        35.0,
                        5.0,
                        "testando"));
    }



    @Override
    public int getCount() { return this.places.size();}

    @Override
    public Object getItem(int position) { return this.places.get(position); }

    @Override
    public long getItemId(int position) {
        Place place = this.places.get(position);
        return place.getPhotoId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        Place atualPlace = this.places.get(position);
        View placeView = View.inflate(this.context, R.layout.list_item_place, null);

        ImageView imageView = placeView.findViewById(R.id.img_place_photo);
        RatingBar ratingBar = placeView.findViewById(R.id.place_rating);
        TextView lblNamePlace = placeView.findViewById(R.id.txt_place_name);
        TextView lblDescriptionPlace = placeView.findViewById(R.id.txt_place_description);
        TextView lblDistantPlace = placeView.findViewById(R.id.txt_place_distance);

        ratingBar.setRating((float) atualPlace.getRate().doubleValue());

        Log.d("PlaceAdapter", "Photo ID: " + atualPlace.getPhotoId());

        if(atualPlace.getPhotoId() != null && atualPlace.getPhotoId() != 0) {
            imageView.setImageResource(atualPlace.getPhotoId());
        } else {
            imageView.setImageResource(R.drawable.ic_launcher_background);
        }

        lblNamePlace.setText(atualPlace.getName());
        lblDescriptionPlace.setText(atualPlace.getDescription());
        lblDistantPlace.setText(atualPlace.getDistance().toString());

        return placeView;
    }
}
