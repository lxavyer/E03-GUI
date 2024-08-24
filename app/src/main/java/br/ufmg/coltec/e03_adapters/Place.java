package com.example.e03_gui_fixed;

/**
 * Created by jemaf on 07/03/18.
 */
public class Place {

    private String name;        // nome do local
    private Integer photoId;    // id da foto do local
    private Double distance;    // distância (em km)
    private Double rate;        // nota (1 a 5)
    private String description; // descrição do local
    //private String imgSource;   // fonte da imagem

    /**
     * Construtor
     * @param name nome do local
     * @param photoId ID da foto do local (Retirado do R.drawable)
     * @param distance Distância do local em KM
     * @param rate Nota do local (1 a 5)
     */
    public Place(String name, Integer photoId, Double distance, Double rate, String description) {
        this.name = name;
        this.photoId = photoId;
        this.distance = distance;
        this.rate = rate;
        this.description = description;
        //this.imgSource = imgSource;
    }

    public String getName() {
        return name;
    }


    public Integer getPhotoId() {
        return photoId;
    }


    public Double getDistance() {
        return distance;
    }



    public Double getRate() {
        return rate;
    }



    public String getDescription() {
        return description;
    }

    /*public String getImgSource() {
        return imgSource;
    }*/
}

