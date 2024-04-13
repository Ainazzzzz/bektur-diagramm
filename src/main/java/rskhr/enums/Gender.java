package rskhr.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;


@Getter
public enum Gender {
    MALE("Мужчина"),
    FEMALE("Женщина");

    private final String translation;

    Gender(String translation){
        this.translation=translation;
    }

    public List<String> getAllGenders(){
        return Arrays.stream(Gender.values()).map(Gender::getTranslation).toList();
    }
}
