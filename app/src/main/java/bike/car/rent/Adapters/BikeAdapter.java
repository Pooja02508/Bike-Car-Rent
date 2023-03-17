package bike.car.rent.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import bike.car.rent.Models.BikeBook;
import bike.car.rent.R;

public class BikeAdapter extends RecyclerView.Adapter<BikeAdapter.ProductViewHolder> {

    private Context mCtx;
    private ItemClickListener mClickListener;
    private List<BikeBook> bikeList;

    public BikeAdapter(Context mCtx, List<BikeBook> bikeList) {
        this.mCtx = mCtx;
        this.bikeList = bikeList;
    }

    @Override
    public BikeAdapter.ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.bike_rent_layout, null);
        return new BikeAdapter.ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BikeAdapter.ProductViewHolder holder, int position) {
        BikeBook product = bikeList.get(position);

        holder.bikeName.setText(product.getName());
        holder.rent.setText(product.getRent());
        holder.bikeImage.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));

    }


    @Override
    public int getItemCount() {
        return bikeList.size();
    }


    public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView bikeName,rent;
        ImageView bikeImage;
        Button bookNow;

        public ProductViewHolder(View itemView) {
            super(itemView);

            bikeName = itemView.findViewById(R.id.bikeName);
            rent = itemView.findViewById(R.id.rent);
            bikeImage = itemView.findViewById(R.id.bikeImage);

            itemView.findViewById(R.id.bookNow).setOnClickListener(this);
        }
        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }

    }
    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}