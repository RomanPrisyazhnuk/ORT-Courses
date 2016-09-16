package com.example.roman.collections;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;


public class Item_View_Holder extends RecyclerView.ViewHolder//отображает персон
{
    private ImageView photo;
    private EditText fName;
    private EditText lName;

    public Item_View_Holder(View itemview)
    {
        super(itemview);
        photo = (ImageView)itemview.findViewById(R.id.image_view);
        fName = (EditText) itemview.findViewById(R.id.txt_firstName);
        lName = (EditText) itemview.findViewById(R.id.txt_lastName);
    }

    public EditText getfName()
    {
        return fName;
    }

    public EditText getlName()
    {
        return lName;
    }

    public ImageView getPhoto()
    {
        return photo;
    }
}
