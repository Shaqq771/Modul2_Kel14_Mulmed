package com.example.modul2_kel14;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ListUserResponse{

    @SerializedName("per_page")
    private int perPage;

    @SerializedName("total")
    private int total;

    @SerializedName("data")
    private List<com.example.modul2_kel14.DataItem> data;

    @SerializedName("page")
    private int page;

    @SerializedName("total_pages")
    private int totalPages;

    public void setPerPage(int perPage){
        this.perPage = perPage;
    }

    public int getPerPage(){
        return perPage;
    }

    public void setTotal(int total){
        this.total = total;
    }

    public int getTotal(){
        return total;
    }

    public void setData(List<com.example.modul2_kel14.DataItem> data){
        this.data = data;
    }

    public List<com.example.modul2_kel14.DataItem> getData(){
        return data;
    }

    public void setPage(int page){
        this.page = page;
    }

    public int getPage(){
        return page;
    }

    public void setTotalPages(int totalPages){
        this.totalPages = totalPages;
    }

    public int getTotalPages(){
        return totalPages;
    }

    @Override
    public String toString(){
        return
                "ListUserResponse{" +
                        "per_page = '" + perPage + '\'' +
                        ",total = '" + total + '\'' +
                        ",data = '" + data + '\'' +
                        ",page = '" + page + '\'' +
                        ",total_pages = '" + totalPages + '\'' +
                        "}";
    }
}
