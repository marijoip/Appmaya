package com.example.appmaya;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {
    // Declararamos las Variables
    Context mContext;

    LayoutInflater inflater;
    private List<BuscadorClass> zonasArq = null;
    private ArrayList<BuscadorClass> arraylist;
    public ListViewAdapter(Context context, List<BuscadorClass> animalNamesList) {
        mContext = context;
        this.zonasArq = animalNamesList;
        inflater = LayoutInflater.from(mContext);
        this.arraylist = new ArrayList<BuscadorClass>();
        this.arraylist.addAll(animalNamesList);
    }
    public class ViewHolder {
        TextView nombre;
    }
    @Override
    public int getCount() {
        return zonasArq.size();
    }
    @Override
    public BuscadorClass getItem(int position) {
        return zonasArq.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.list_view_items, null);
            // Buscar los datos y presentarlos en el listview_item.xml
            holder.nombre = (TextView) view.findViewById(R.id.nombre);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        // Establecer resultados en el TextView
        holder.nombre.setText(zonasArq.get(position).getAnimalName());
        return view;
    }
    // Función filtrar
    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        zonasArq.clear();
        if (charText.length() == 0) {
            zonasArq.addAll(arraylist);
        } else {
            for (BuscadorClass wp : arraylist) {


                if (wp.getAnimalName().toLowerCase(Locale.getDefault()).contains(charText)) {
                    zonasArq.add(wp);
                }
            }
        }
        notifyDataSetChanged();
    }
}
