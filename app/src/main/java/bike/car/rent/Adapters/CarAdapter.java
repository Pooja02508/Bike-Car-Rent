package bike.car.rent.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import bike.car.rent.Models.CarBook;
import bike.car.rent.R;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ProductViewHolder> {

    private Context mCtx;
    private BikeAdapter.ItemClickListener mClickListener;
    private List<CarBook> carList;

    public CarAdapter(Context mCtx, List<CarBook> carList) {
        this.mCtx = mCtx;
        this.carList = carList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.car_rent_layout, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {

        CarBook product = carList.get(position);

        holder.carName.setText(product.getName());
        holder.automatic.setText(product.getAutomatic());
        holder.disel.setText(product.getDisel());
        holder.seats.setText(product.getSeats());
        holder.rent1.setText(product.getRent1());
        holder.rent2.setText(product.getRent2());
        holder.rent3.setText(product.getRent3());
        holder.extraCharge.setText(product.getExtraCharges());

        holder.carImage.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));



    }

    @Override
    public int getItemCount() {
        return carList.size();
    }


    class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView carName,automatic, disel, seats, rent1,rent2,rent3,extraCharge;
        ImageView carImage;
        Button book;

        public ProductViewHolder(View itemView) {
            super(itemView);

            carName = itemView.findViewById(R.id.carName);
            automatic = itemView.findViewById(R.id.automatic);
            disel = itemView.findViewById(R.id.disel);
            seats = itemView.findViewById(R.id.seats);
            rent1 = itemView.findViewById(R.id.rent1);
            rent2 = itemView.findViewById(R.id.rent2);
            rent3 = itemView.findViewById(R.id.rent3);
            extraCharge = itemView.findViewById(R.id.extra_charge);
            carImage = itemView.findViewById(R.id.carImage);


            itemView.findViewById(R.id.book).setOnClickListener(this);
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