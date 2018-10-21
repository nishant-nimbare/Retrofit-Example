
package com.nishantnimbare.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Quote {

    @SerializedName("quote")
    @Expose
    private String quote;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("category")
    @Expose
    private String category;

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
