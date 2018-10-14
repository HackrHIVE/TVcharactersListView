package com.example.rawal.listviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter<User> {

    Context context;           //Ref of the activity
    int resource;              //list_item
    ArrayList<User> objects;   //ArrayList of Users

    public UserAdapter(Context context, int resource, ArrayList<User> objects) {
        super( context, resource, objects );

        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = LayoutInflater.from( context ).inflate( resource,parent,false );
        ImageView imageView = view.findViewById( R.id.imageView );
        TextView name = view.findViewById( R.id.nameView );
        TextView TV = view.findViewById( R.id.TVView );

        User user = objects.get(position);
        imageView.setBackgroundResource( user.image );
        name.setText( user.name );
        TV.setText( user.TVSeries );

        return view;

    }
}
