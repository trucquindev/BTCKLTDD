package com.example.btcuoikyltdd_ntq.HomeFragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.btcuoikyltdd_ntq.Model.Item;
import com.example.btcuoikyltdd_ntq.R;

import java.util.ArrayList;

public class AdapterGridHome extends ArrayAdapter<Item> {
    Context context;
    int IdLayout;
    ArrayList<Item> mylist;

    public AdapterGridHome(Context context, int idLayout, ArrayList<Item> mylist) {
        super(context, idLayout,mylist);
        this.context = context;
        IdLayout = idLayout;
        this.mylist = mylist;
    }
    // gọi hàm getView đẻ Adapter để lấy dữ liệu và hiển thị

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater myflactor = LayoutInflater.from(context);
            convertView = myflactor.inflate(IdLayout, parent, false);
        }
//        LayoutInflater myflactor = LayoutInflater.from(context);
//        //tao view
//        convertView = myflactor.inflate(IdLayout, null);
        //lay 1 phan tu trong bang
        Item myitem = mylist.get(position);
        Item currentItem = mylist.get(position);
        ImageView img_item = convertView.findViewById(R.id.imageView);
        img_item.setImageResource(myitem.getImageResId());
        TextView txt_title = convertView.findViewById(R.id.textView);
        txt_title.setText(myitem.getTitle());

        return convertView;
    }
}
