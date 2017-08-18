package com.grademojo.for_x;

/**
 * Created by sapling_a0 on 18/8/17.
 */

public class My_Course_Forex_Pojo {


    private String introduction;

    private int image_icon;

    private int view_1;



    My_Course_Forex_Pojo(int ic, String s ,int v1 ) {
        this.image_icon= ic;
        this.introduction = s;
        this.view_1 = v1;



    }



    public String getIntroduction() {
        return introduction;
    }

    public int getImage_icon() {
        return image_icon;
    }

    public int getView_1() {
        return view_1;
    }



    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public void setImage_icon(int image_icon) {
        this.image_icon = image_icon;
    }

    public void setView_1(int view_1) {
        this.view_1 = view_1;
    }





}