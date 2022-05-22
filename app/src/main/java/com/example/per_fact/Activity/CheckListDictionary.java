package com.example.per_fact;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class CheckListDictionary implements Parcelable {

    private String id;
    boolean isSelected;


    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        this.isSelected = selected;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public CheckListDictionary(String id) {
        this.id = id;
        this.isSelected = isSelected();

    }

    //
    protected CheckListDictionary(Parcel in) {
        id = in.readString();

    }

    public static final Creator<CheckListDictionary> CREATOR = new Creator<CheckListDictionary>() {
        @Override
        public CheckListDictionary createFromParcel(Parcel in) {
            return new CheckListDictionary(in);
        }

        @Override
        public CheckListDictionary[] newArray(int size) {
            return new CheckListDictionary[size];
        }
    };
    //

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id);


    }


}
