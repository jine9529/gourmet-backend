package com.kodachaya.gourmet.api.dto.review.command;

import com.kodachaya.gourmet.api.dto.Stamp;
import com.kodachaya.gourmet.api.dto.menu.command.MenuPostCommand;
import com.kodachaya.gourmet.api.dto.restaurant.command.RestaurantPostCommand;

public class ReviewPostCommand {

    private RestaurantPostCommand restaurant;
    private MenuPostCommand menu;
    private String comment;
    private Stamp stamp;

    public RestaurantPostCommand getRestaurant() {
        return restaurant;
    }

    public MenuPostCommand getMenu() {
        return menu;
    }

    public String getComment() {
        return comment;
    }

    public Stamp getStamp() {
        return stamp;
    }


    @Override
    public String toString() {
        return "ReviewPostCommand{" +
                "restaurant=" + restaurant +
                ", menu=" + menu +
                ", comment='" + comment + '\'' +
                ", stamp=" + stamp +
                '}';
    }
}
