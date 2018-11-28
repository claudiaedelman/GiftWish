package com.ct.giftwish;

import android.widget.ImageView;

/**
 * Created by edelmanclaudia on 26/04/2018.
 */

public class GiftItem {

    private String productName;
    private String shop;
    private ImageView img;

    public GiftItem(ImageView img,String name, String shop) {
        this.img = img;
        this.productName = name;
        this.shop = shop;
    }

    @Override
    public String toString() {
        return img +  productName +"\n" +shop;
    }
}
