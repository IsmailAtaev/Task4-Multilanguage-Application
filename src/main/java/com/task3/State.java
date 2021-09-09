package com.task3;

import java.io.Serializable;
import java.util.ArrayList;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class State implements Serializable {
    private final Logger logger = LogManager.getLogger(State.class.getName());
    private String capital;

    ArrayList<Region> regionArrayList = new ArrayList<>();

        /**
         * @param region
         * first check this is class have to region if this is class have region object
         * write logger file
         * @return false
         * else it is not same region then add regionArrayList
         * @return true;
         * */
        public boolean addRegion(Region region) {
            for (int i = 0; i < regionArrayList.size(); i++) {
                if (region.getCity().equals(regionArrayList.get(i).getCity())) {
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
         * если нет области никакой то return false because do not
         * если коллекция не пуста и, не совпадает бласть с областем куда надо добавиь то,
         * тоже return false
         * если есть такое область дб регион и return true;
         * */
        public boolean addDistrict(String nameCityRegion,District district) {
            for (int i = 0; i < this.regionArrayList.size(); i++) {
                if (nameCityRegion.equals(regionArrayList.get(i).getCity())) {
                    this.regionArrayList.get(i).districtArrayList.add(district);
                    return true;
                }
            }
            return false;
        }



}
