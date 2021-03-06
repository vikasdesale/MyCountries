
package com.countries.mycountries.model;


import org.parceler.Parcel;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Parcel
public class Worldpopulation {

    Integer rank;
    String country;
    String population;
    String flag;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Worldpopulation() {
    }

    /**
     * 
     * @param rank
     * @param flag
     * @param population
     * @param country
     */
    public Worldpopulation(Integer rank, String country, String population, String flag) {
        super();
        this.rank = rank;
        this.country = country;
        this.population = population;
        this.flag = flag;
    }

}
