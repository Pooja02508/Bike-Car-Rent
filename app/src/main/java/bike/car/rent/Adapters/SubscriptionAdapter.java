package bike.car.rent.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import bike.car.rent.Models.Booking;
import bike.car.rent.R;

public class SubscriptionAdapter extends RecyclerView.Adapter<SubscriptionAdapter.ProductViewHolder> {

    private Context mCtx;
    private BikeAdapter.ItemClickListener mClickListener;
    private List<Booking> bikeList;

    public SubscriptionAdapter(Context mCtx, List<Booking> bikeList) {
        this.mCtx = mCtx;
        this.bikeList = bikeList;
    }

    @Override
    public SubscriptionAdapter.ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.booking_layout, null);
        return new SubscriptionAdapter.ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Booking product = bikeList.get(position);

        holder.bikeName.setText(product.getName());
        holder.rent.setText(product.getRent());
        holder.bikeImage.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));
    }



    @Override
    public int getItemCount() {
        return bikeList.size();
    }


   public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView bikeName, rent,book_now;
        ImageView bikeImage;

        public ProductViewHolder(View itemView) {
            super(itemView);

            bikeName = itemView.findViewById(R.id.bikeName);
            rent = itemView.findViewById(R.id.rent);
            bikeImage = itemView.findViewById(R.id.bikeImage);
            itemView.findViewById(R.id.book_now).setOnClickListener(this);
        }
       @Override
       public void onClick(View view) {
           if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
       }

    }
    public void setClickListener(BikeAdapter.ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}