package com.example.user.nottspark.View;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.nottspark.Model.Leaver;

import getresult.example.asus.nottspark.R;


/**
 * Provide views to RecyclerView with data from mDataSet.
 */
public class UserHistoryAdapter extends RecyclerView.Adapter<UserHistoryAdapter.ViewHolder> {
    private static final String TAG = "UserHistoryAdapter";

    private Leaver[] mDataSet;

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used by RecyclerView.
     */
    public UserHistoryAdapter(Leaver[] dataSet) {
        mDataSet = dataSet;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.row_in_history, viewGroup, false);

        return new ViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Log.d(TAG, "Element " + position + " set.");

        Context context = viewHolder.getImageView().getContext();
        viewHolder.gettvPlaceName().setText(mDataSet[position].getUserID().getCar().getCarPlate());
        viewHolder.gettvPlaceTime().setText(mDataSet[position].getLeavingTime());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataSet.length;
    }

    /**
     * Provide a reference to the type of views that you are using (custom ViewHolder)
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tvPlaceName;
        private final TextView tvPlaceTime;
        private final ImageView imageView;

        public ViewHolder(View v) {
            super(v);
            // Define click listener for the ViewHolder's View.
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d(TAG, "Element " + getAdapterPosition() + " clicked.");
                }
            });
            tvPlaceName = (TextView) v.findViewById(R.id.placeName);
            tvPlaceTime = (TextView) v.findViewById(R.id.placeTime);
            imageView = (ImageView) v.findViewById(R.id.placeImage);
        }

        public TextView gettvPlaceName() {
            return tvPlaceName;
        }

        public TextView gettvPlaceTime() {
            return tvPlaceTime;
        }

        public ImageView getImageView() {
            return imageView;
        }
    }
}