package com.task3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class State implements Serializable {

    private final Logger logger = LogManager.getLogger(State.class.getName());

    protected ArrayList<Region> regionArrayList = new ArrayList<>();

    private String capital;

    private String nameCountry;

    public Logger getLogger() {
        return logger;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public ArrayList<Region> getRegionArrayList() {
        return regionArrayList;
    }

    public void setRegionArrayList(ArrayList<Region> regionArrayList) {
        this.regionArrayList = regionArrayList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return Objects.equals(logger, state.logger) && Objects.equals(capital, state.capital) && Objects.equals(nameCountry, state.nameCountry) && Objects.equals(regionArrayList, state.regionArrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logger, capital, nameCountry, regionArrayList);
    }

    @Override
    public String toString() {
        return "State{" +
                "logger=" + logger +
                ", capital='" + capital + '\'' +
                ", nameCountry='" + nameCountry + '\'' +
                ", regionArrayList=" + regionArrayList +
                '}';
    }

    /**
     * возврашаем областные центры
     */
    public ArrayList<String> getCountRegionCenter() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < regionArrayList.size(); i++) {
            stringArrayList.add(regionArrayList.get(i).getCity());
        }
        return stringArrayList;
    }

    public int getCountRegion() {
        return this.regionArrayList.size();
    }

    public double getSquareCountry() {
        double squareCountry = 0;
        for (int i = 0; i < this.regionArrayList.size(); i++) {
            squareCountry += this.regionArrayList.get(i).getSquareRegion();
        }
        return squareCountry;
    }


    /**
     * @param region first check this is class have to region if this is class have region object
     *               write logger file
     * @return false
     * else it is not same region then add regionArrayList
     * @return true;
     */
    public boolean addRegion(Region region) {
        for (int i = 0; i < regionArrayList.size(); i++) {
            if (region.getNameRegion().equals(regionArrayList.get(i).getNameRegion())) {
                logger.log(Level.DEBUG, "class State method addRegion()" +
                        "  this is class have region class on regionArraylist please add other region");
                return false;
            }
        }
        this.regionArrayList.add(region);
        return true;
    }

    /**
     * @param nameCityRegion
     * @param district
     * @return boolean
     * если нет region никакой то return false because do not
     * если коллекция не пуста и, не совпадает бласть с region куда надо добавиь то,
     * тоже return false
     * если нету такое область дб регион и return true;
     */
    public boolean addDistrict(String nameRegion, District district) {
        for (int i = 0; i < this.regionArrayList.size(); i++) {
            if (nameRegion.equals(regionArrayList.get(i).getNameRegion())) {
                this.regionArrayList.get(i).districtArrayList.add(district);
                return true;
            }
        }
        return false;
    }


}
