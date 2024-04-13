package rskhr.enums;


import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
public enum City {

    BISHKEK("Бишкек"),
    OSH("Ош"),
    JALAL_ABAD("Джалал-Абад"),
    KARAKOL("Каракол"),
    TOKMOK("Токмок"),
    BALYKCHY("Балыкчы");

    private final String translation;
     City(String translation){
        this.translation=translation;
    }

    public List<String> getAllCities(){
         return Arrays.stream(City.values()).map(City::getTranslation).toList();
    }
}
