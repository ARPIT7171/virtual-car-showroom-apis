package com.bluealtair.apis.data.entities;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import com.bluealtair.apis.data.enumeration.CarColor;
import com.bluealtair.apis.data.enumeration.CarEngineType;
import com.bluealtair.apis.data.enumeration.CarModel;


@Data
@Document(collection = "virtual_showroom")
public class Car {
    @Id
    private String id;

    @Field("name")
    private String name;

    @Field("model")
    private CarModel model;

    @Field("engine")
    private CarEngineType engine;

    @Field("color")
    private CarColor color;

    @Field("price")
    private String price;

    @Field("vin")
    private String vin;

    @Field("image")
    private String image;


}
