package com.wawa_applications.gamescluster.model.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.wawa_applications.gamescluster.model.details.GameImageModel;


/**
 * Created by Wojtek Krzywiec on 22/08/2017.
 */

public class GameResultModel {

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("api_detail_url")
    @Expose
    private String apiDetailUrl;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("image")
    @Expose
    private GameImageModel image;

    @SerializedName("expected_release_year")
    @Expose
    private Integer expectedReleaseYear;

    @SerializedName("original_release_date")
    @Expose
    private String originalReleaseDate;

    @SerializedName("deck")
    @Expose
    private String deck;

    private String fullTitle;

    public String getApiDetailUrl() {
        return apiDetailUrl;
    }

    public void setApiDetailUrl(String apiDetailUrl) {
        this.apiDetailUrl = apiDetailUrl;
    }

    public Integer getExpectedReleaseYear() {
        return expectedReleaseYear;
    }

    public void setExpectedReleaseYear(Integer expectedReleaseYear) {
        this.expectedReleaseYear = expectedReleaseYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GameImageModel getImage() {
        return image;
    }

    public void setImage(GameImageModel image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginalReleaseDate() {
        return originalReleaseDate;
    }

    public void setOriginalReleaseDate(String originalReleaseDate) {
        this.originalReleaseDate = originalReleaseDate;
    }

    public String getReleaseYear(){
        String releaseYear = "N/A";
        if(getExpectedReleaseYear() != null) releaseYear = String.valueOf(getExpectedReleaseYear());

        if(getOriginalReleaseDate() != null){
            releaseYear = getOriginalReleaseDate().substring(0, 4);
        }
        return releaseYear;
    }

    public String getDeck() {
        return deck;
    }

    public void setDeck(String deck) {
        this.deck = deck;
    }

    public String getFullTitle(){
        return name + " (" + getReleaseYear() + ")";
    }

}
