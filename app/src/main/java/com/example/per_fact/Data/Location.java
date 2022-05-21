package com.example.per_fact.Data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import okhttp3.Address;

public class Location {
    @SerializedName("documents")
    public List<Document> documentsList;

    @SerializedName("meta")
    public Meta meta;

    public static class Document {
        @SerializedName("place_name")
        private String place_name;
        @SerializedName("category_name")
        private String category_name;
        @SerializedName("x")        //longitude
        private String x;
        @SerializedName("y")        //latitude
        private String y;

        public String getPlace_name() {
            return place_name;
        }

        public void setAddress(String place_name) {
            this.place_name = place_name;
        }

        public String getCategory_name() {
            return category_name;
        }

        public void setAddress_name(String category_name) {
            this.category_name = category_name;
        }

        public String getX() {
            return x;
        }

        public void setX(String x) {
            this.x = x;
        }

        public String getY() {
            return y;
        }

        public void setY(String y) {
            this.y = y;
        }
    }


    public static class RegionInfo {
        @SerializedName("region")
        private List<String> region;
        @SerializedName("keyword")
        private String keyWord;
        @SerializedName("selected_region")
        private String selected_region;
    }

    public static class Meta {
        @SerializedName("is_end")
        private boolean is_end;
        @SerializedName("pageable_count")
        private int pageable_count;
        @SerializedName("total_count")
        private int total_count;
        @SerializedName("same_name")
        private RegionInfo same_name;

        public boolean isIs_end() {
            return is_end;
        }

        public void setIs_end(boolean is_end) {
            this.is_end = is_end;
        }

        public int getPageable_count() {
            return pageable_count;
        }

        public void setPageable_count(int pageable_count) {
            this.pageable_count = pageable_count;
        }

        public int getTotal_count() {
            return total_count;
        }

        public void setTotal_count(int total_count) {
            this.total_count = total_count;
        }

        public RegionInfo getSame_name() {
            return same_name;
        }

        public void setSame_name(RegionInfo same_name) {
            this.same_name = same_name;
        }
    }
}
